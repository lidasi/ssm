package cwweb.com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cwweb.com.model.CommodityInfo;
import cwweb.com.model.CommodityInfoExample;
import cwweb.com.model.InInventory;
import cwweb.com.model.InInventoryExample;
import cwweb.com.model.InInventoryExample.Criteria;
import cwweb.com.model.TotalInventory;
import cwweb.com.model.TotalInventoryExample;
import cwweb.com.service.CommodityInfoService;
import cwweb.com.service.InInventoryService;
import cwweb.com.service.TotalInventoryService;
import cwweb.com.util.Const;
import cwweb.com.util.DateUtil;
import cwweb.com.util.UUIDUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@RequestMapping("/user")
@Controller
public class CommodityController {
    
    @Autowired
    private InInventoryService inInventoryService;
    
    @Autowired
    private CommodityInfoService commdityInfoService;
    
    @Autowired
    private TotalInventoryService totalInventoryService;
    
    /**
     * 商品入库管理
     * @param request
     * @return
     * @throws Exception 
     */
    @RequestMapping(value ="/commoditySearch", method = RequestMethod.GET)
    @ResponseBody
    public JSONArray CommoditySearch(HttpServletRequest request) throws Exception {
        DateUtil dateUtil = new DateUtil();
        JSONArray jsonArray = new JSONArray(); 
        InInventoryExample inInventoryExample = new InInventoryExample();
        Criteria criteria = inInventoryExample.createCriteria();
        int type = Integer.parseInt(request.getParameter("type"));
        int size = Integer.parseInt(request.getParameter("size"));
        int style = Integer.parseInt(request.getParameter("style"));
        int color = Integer.parseInt(request.getParameter("color"));
        String bar = request.getParameter("bar");
        String name = request.getParameter("name");
        if(type != -1) {
            criteria.andTypeEqualTo(type);
        }
        if(size != -1) {
            criteria.andSizeEqualTo(size);
        }
        if(style != -1) {
            criteria.andStyleEqualTo(style);     
        }
        if(color != -1) {
            criteria.andColorEqualTo(color);
        }
        if(StringUtils.isNotEmpty(name)) {
            criteria.andCommodityNameLike("%" + name + "%");
        }
        if(StringUtils.isNotEmpty(bar)) {
            criteria.andCommodityBarEqualTo(bar);
        }
        List<InInventory> resList = inInventoryService.getInventory(inInventoryExample);
        
        for(InInventory arr : resList) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("bar", arr.getCommodityInfo().getCommodityBar());
            jsonObject.put("name", arr.getCommodityInfo().getCommodityName());
            jsonObject.put("market", arr.getCommodityInfo().getCommodityMarket());
            jsonObject.put("state", arr.getCommodityInfo().getShelvesState());
            jsonObject.put("style", arr.getCommodityInfo().getStyle());
            jsonObject.put("color", arr.getCommodityInfo().getColor());
            jsonObject.put("size", arr.getCommodityInfo().getSize());
            jsonObject.put("type", arr.getCommodityInfo().getType());
            jsonObject.put("inNumber", arr.getInNumber());
            jsonObject.put("unitPrice", arr.getUnitPrice());
            jsonObject.put("commdityTotal", arr.getCommdityTotal());
            jsonObject.put("inType", arr.getInType());
            jsonObject.put("brokerage", arr.getBrokerage());
            jsonObject.put("commdityUnit", arr.getCommdityUnit());
            jsonObject.put("inDate", dateUtil.fmt_sdf14_L(arr.getInDate()));
            jsonArray.add(jsonObject);
        }
        
        return jsonArray;
        
    }
    
    /**
     * 添加商品信息
     * @param request
     */
    @RequestMapping(value ="/addInInventry", method = RequestMethod.POST)
    @ResponseBody
    public String addInInventry(HttpServletRequest request) {
        String getNow17 = DateUtil.getNow17();
        String strUUid = UUIDUtil.minimizedUUID();
        CommodityInfoExample commodityInfoExample = new CommodityInfoExample();
        cwweb.com.model.CommodityInfoExample.Criteria commodCriteria = commodityInfoExample.createCriteria();
        
        InInventoryExample inInventoryExample = new InInventoryExample();
        Criteria criteria = inInventoryExample.createCriteria();
        
        TotalInventoryExample totalInventoryExample = new TotalInventoryExample();
        cwweb.com.model.TotalInventoryExample.Criteria totalCriteria = totalInventoryExample.createCriteria();
        
        String bar = request.getParameter("bar");
        int inNumber = Integer.parseInt(request.getParameter("inNumber"));
        Double unitPrice = Double.parseDouble(request.getParameter("unitPrice"));
        int c_in_type = Integer.parseInt(request.getParameter("c_in_type"));
        String brokerage = request.getParameter("brokerage");
        
        if (StringUtils.isEmpty(bar)) {
            return Const.RES_FAIL;
        }
        if(StringUtils.isEmpty(brokerage)) {
            return Const.RES_FAIL;
        }
        commodCriteria.andCommodityBarEqualTo(bar);
        
        List<CommodityInfo> list = commdityInfoService.commodityInfoSearch(commodityInfoExample);
        if (list.size() > 0) {
            totalCriteria.andCommodityIdEqualTo(list.get(0).getCommodityId());
            List<TotalInventory> totalList= totalInventoryService.selectTotal(totalInventoryExample);
            if (totalList.size() > 0) {
                InInventory inInventory = new InInventory();
                //入库商品表添加一条记录
                inInventory.setTotalId(totalList.get(0).getTotalinId());
                inInventory.setUuid(totalList.get(0).getUuid());
                inInventory.setUnitPrice(unitPrice);
                double price = unitPrice;
                double total = price * inNumber;
                inInventory.setInNumber(inNumber);
                inInventory.setCommdityTotal(total);
                inInventory.setInType(c_in_type);
                inInventory.setCommdityUnit(0);
                inInventory.setBrokerage(brokerage);
                inInventory.setCreateDate(getNow17);
                inInventory.setInDate(getNow17);
                inInventory.setUpdateDate(getNow17);
                
                //总库存表修改一条记录
                
                TotalInventory totalInventory = totalInventoryService.getCommodityTotal(totalList.get(0).getCommodityId());
                int totalNumber = totalInventory.getTotalNumber() + inNumber;
                totalInventory.setTotalNumber(totalNumber);
                totalInventory.setUpdateDate(getNow17);
                
                inInventoryService.insert(inInventory);
                inInventoryService.update(totalInventory);
            } else {
                InInventory inInventory = new InInventory();
                //入库商品表添加一条记录
                inInventory.setUuid(strUUid);
                inInventory.setUnitPrice(unitPrice);
                double price = unitPrice;
                double total = price * inNumber;
                inInventory.setInNumber(inNumber);
                inInventory.setCommdityTotal(total);
                inInventory.setInType(c_in_type);
                inInventory.setCommdityUnit(0);
                inInventory.setBrokerage(brokerage);
                inInventory.setCreateDate(getNow17);
                inInventory.setInDate(getNow17);
                inInventory.setUpdateDate(getNow17);
                
                //总库存添加一条记录
                TotalInventory totalInventory = new TotalInventory();
                totalInventory.setCommdityUnit(0);
                totalInventory.setCommodityId(list.get(0).getCommodityId());
                totalInventory.setUuid(strUUid);
                totalInventory.setTotalNumber(inNumber);
                totalInventory.setCreateDate(getNow17);
                totalInventory.setUpdateDate(getNow17);
                
                inInventoryService.insert(inInventory);
                inInventoryService.totalInsert(totalInventory);
            }
            
            
        } else {
            return Const.RES_ERROR;
        }
        return Const.RES_SUCCESS;
    }
}
