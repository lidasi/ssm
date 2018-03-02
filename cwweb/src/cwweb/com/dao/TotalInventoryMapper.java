package cwweb.com.dao;

import cwweb.com.model.TotalInventory;
import cwweb.com.model.TotalInventoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TotalInventoryMapper {
    int countByExample(TotalInventoryExample example);

    int deleteByExample(TotalInventoryExample example);

    int deleteByPrimaryKey(Integer totalinId);

    int insert(TotalInventory record);

    int insertSelective(TotalInventory record);

    List<TotalInventory> selectByExample(TotalInventoryExample example);

    TotalInventory selectByPrimaryKey(Integer totalinId);

    int updateByExampleSelective(@Param("record") TotalInventory record, @Param("example") TotalInventoryExample example);

    int updateByExample(@Param("record") TotalInventory record, @Param("example") TotalInventoryExample example);

    int updateByPrimaryKeySelective(TotalInventory record);

    int updateByPrimaryKey(TotalInventory record);
}