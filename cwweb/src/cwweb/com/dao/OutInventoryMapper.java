package cwweb.com.dao;

import cwweb.com.model.OutInventory;
import cwweb.com.model.OutInventoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutInventoryMapper {
    int countByExample(OutInventoryExample example);

    int deleteByExample(OutInventoryExample example);

    int deleteByPrimaryKey(Integer outinId);

    int insert(OutInventory record);

    int insertSelective(OutInventory record);

    List<OutInventory> selectByExample(OutInventoryExample example);

    OutInventory selectByPrimaryKey(Integer outinId);

    int updateByExampleSelective(@Param("record") OutInventory record, @Param("example") OutInventoryExample example);

    int updateByExample(@Param("record") OutInventory record, @Param("example") OutInventoryExample example);

    int updateByPrimaryKeySelective(OutInventory record);

    int updateByPrimaryKey(OutInventory record);
}