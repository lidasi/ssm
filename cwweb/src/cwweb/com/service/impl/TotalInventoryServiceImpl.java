package cwweb.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cwweb.com.dao.TotalInventoryMapper;
import cwweb.com.model.TotalInventory;
import cwweb.com.model.TotalInventoryExample;
import cwweb.com.service.TotalInventoryService;

@Service
public class TotalInventoryServiceImpl implements TotalInventoryService{

    @Autowired
    private TotalInventoryMapper totalInventoryMapper;
    
    @Override
    public List<TotalInventory> selectTotal(TotalInventoryExample totalInventoryExample) {
        List<TotalInventory> resList = totalInventoryMapper.selectTotalInventory(totalInventoryExample);
        return resList;
    }

}
