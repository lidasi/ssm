package cwweb.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cwweb.com.dao.TotalInventoryMapper;
import cwweb.com.model.TotalInventory;
import cwweb.com.model.TotalInventoryExample;
import cwweb.com.service.TotalInventoryService;

@Service
@Transactional
public class TotalInventoryServiceImpl implements TotalInventoryService{

    @Autowired
    private TotalInventoryMapper totalInventoryMapper;
    
    @Override
    public List<TotalInventory> selectTotal(TotalInventoryExample totalInventoryExample) {
        List<TotalInventory> resList = totalInventoryMapper.selectByExample(totalInventoryExample);
        return resList;
    }

    @Override
    public TotalInventory getCommodityTotal(Integer commodityId) {
        TotalInventory totalInventory = totalInventoryMapper.selectByPrimaryKey(commodityId);
        return totalInventory;
    }

    @Override
    public void update(TotalInventory totalInventory) {
        totalInventoryMapper.updateByPrimaryKey(totalInventory);
    }

}
