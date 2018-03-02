package cwweb.com.service;

import java.util.List;

import cwweb.com.model.TotalInventory;
import cwweb.com.model.TotalInventoryExample;

public interface TotalInventoryService {
    List<TotalInventory> selectTotal(TotalInventoryExample totalInventoryExample);

    TotalInventory getCommodityTotal(Integer commodityId);

    void update(TotalInventory totalInventory);

}
