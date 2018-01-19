package cwweb.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cwweb.com.dao.InInventoryMapper;
import cwweb.com.model.InInventory;
import cwweb.com.model.InInventoryExample;
import cwweb.com.service.InInventoryService;

@Service
public class InInventoryServiceImpl implements InInventoryService{

    @Autowired
    private InInventoryMapper inInventoryMapper;
    
    @Override
    public List<InInventory> getInventory(InInventoryExample example) {
        List<InInventory> resList = inInventoryMapper.getInventory(example);
        return resList;
    }

}
