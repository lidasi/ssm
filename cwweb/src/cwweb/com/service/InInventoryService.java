package cwweb.com.service;

import java.util.List;

import cwweb.com.model.InInventory;
import cwweb.com.model.InInventoryExample;
import cwweb.com.model.TotalInventory;

public interface InInventoryService {
    List<InInventory> getInventory(InInventoryExample example);
    void insert(InInventory inInventory);
    void update(TotalInventory totalInventory);
    void totalInsert(TotalInventory totalInventory);
}
