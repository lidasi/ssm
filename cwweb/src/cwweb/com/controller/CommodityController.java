package cwweb.com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cwweb.com.model.InInventory;
import cwweb.com.model.InInventoryExample;
import cwweb.com.model.InInventoryExample.Criteria;
import cwweb.com.model.TotalInventory;
import cwweb.com.service.InInventoryService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@RequestMapping("/user")
@Controller
public class CommodityController {
    
    @Autowired
    private InInventoryService inInventoryService;
    
    /**
     * 商品入库管理
     * @param request
     * @return
     */
    @RequestMapping(value ="/commoditySearch", method = RequestMethod.GET)
    @ResponseBody
    public JSONArray CommoditySearch(HttpServletRequest request) {
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
            jsonObject.put("inDate", arr.getInDate());
            jsonArray.add(jsonObject);
        }
        
        return jsonArray;
        
    }
}
