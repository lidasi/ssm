package cwweb.com.service;

import java.util.List;

import cwweb.com.model.InInventory;
import cwweb.com.model.InInventoryExample;

public interface InInventoryService {
    List<InInventory> getInventory(InInventoryExample example);
}
