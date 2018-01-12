package cwweb.com.service;

import java.util.List;

import cwweb.com.model.CommodityInfo;
import cwweb.com.model.CommodityInfoExample;

public interface CommodityInfoService {
    public List<CommodityInfo> commodityInfoSearch(CommodityInfoExample commodityInfoExample);
}
