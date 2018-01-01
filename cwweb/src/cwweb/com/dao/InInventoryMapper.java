package cwweb.com.dao;

import cwweb.com.model.InInventory;
import cwweb.com.model.InInventoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InInventoryMapper {
    int countByExample(InInventoryExample example);

    int deleteByExample(InInventoryExample example);

    int deleteByPrimaryKey(Integer addressId);

    int insert(InInventory record);

    int insertSelective(InInventory record);

    List<InInventory> selectByExample(InInventoryExample example);

    InInventory selectByPrimaryKey(Integer addressId);

    int updateByExampleSelective(@Param("record") InInventory record, @Param("example") InInventoryExample example);

    int updateByExample(@Param("record") InInventory record, @Param("example") InInventoryExample example);

    int updateByPrimaryKeySelective(InInventory record);

    int updateByPrimaryKey(InInventory record);
}