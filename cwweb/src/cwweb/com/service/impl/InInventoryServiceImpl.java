package cwweb.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cwweb.com.dao.InInventoryMapper;
import cwweb.com.dao.TotalInventoryMapper;
import cwweb.com.model.InInventory;
import cwweb.com.model.InInventoryExample;
import cwweb.com.model.TotalInventory;
import cwweb.com.service.InInventoryService;

@Service
@Transactional
public class InInventoryServiceImpl implements InInventoryService{

    @Autowired
    private InInventoryMapper inInventoryMapper;
    
    @Autowired
    private TotalInventoryMapper totalInventoryMapper;
    
    @Override
    public List<InInventory> getInventory(InInventoryExample example) {
        List<InInventory> resList = inInventoryMapper.getInventory(example);
        return resList;
    }

    @Override
    public void insert(InInventory ininventory) {
        inInventoryMapper.insertSelective(ininventory);
        
    }

    @Override
    public void update(TotalInventory totalInventory) {
        totalInventoryMapper.updateByPrimaryKey(totalInventory);
        
    }

    @Override
    public void totalInsert(TotalInventory totalInventory) {
        totalInventoryMapper.insert(totalInventory);
    }

}
