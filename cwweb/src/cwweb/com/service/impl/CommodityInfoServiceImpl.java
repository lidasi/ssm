package cwweb.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cwweb.com.dao.CommodityInfoMapper;
import cwweb.com.model.CommodityInfo;
import cwweb.com.model.CommodityInfoExample;
import cwweb.com.service.CommodityInfoService;

@Service
public class CommodityInfoServiceImpl implements CommodityInfoService{
    
    @Autowired
    CommodityInfoMapper commodityInfoMapper;
    
    @Override
    public List<CommodityInfo> commodityInfoSearch(CommodityInfoExample commodityInfoExample) {
        List<CommodityInfo> resList = commodityInfoMapper.selectByExample(commodityInfoExample);
        return resList;
    }

}
