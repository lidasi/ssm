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
import cwweb.com.model.CommodityInfoExample.Criteria;
import cwweb.com.service.CommodityInfoService;
import net.sf.json.JSONArray;

@RequestMapping("/user")
@Controller
public class CommodityController {

    @Autowired
    private CommodityInfoService commodityInfoService;
    
    @RequestMapping(value ="/commoditySearch", method = RequestMethod.GET)
    @ResponseBody
    public JSONArray CommoditySearch(HttpServletRequest request) {
        JSONArray jsonArray = new JSONArray(); 
        CommodityInfoExample commodityInfoExample = new CommodityInfoExample();
        Criteria criteria = commodityInfoExample.createCriteria();
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
            criteria.andCommodityNameEqualTo(name);
        }
        if(StringUtils.isNotEmpty(bar)) {
            criteria.andCommodityBarEqualTo(bar);
        }
        List<CommodityInfo> resList = commodityInfoService.commodityInfoSearch(commodityInfoExample);
        
        for(CommodityInfo arr : resList) {
            jsonArray.add(arr);
        }
        
        return jsonArray;
        
    }
}
