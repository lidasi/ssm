package cwweb.com.dao;

import cwweb.com.model.ResumeInventory;
import cwweb.com.model.ResumeInventoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResumeInventoryMapper {
    int countByExample(ResumeInventoryExample example);

    int deleteByExample(ResumeInventoryExample example);

    int deleteByPrimaryKey(Integer resinId);

    int insert(ResumeInventory record);

    int insertSelective(ResumeInventory record);

    List<ResumeInventory> selectByExample(ResumeInventoryExample example);

    ResumeInventory selectByPrimaryKey(Integer resinId);

    int updateByExampleSelective(@Param("record") ResumeInventory record, @Param("example") ResumeInventoryExample example);

    int updateByExample(@Param("record") ResumeInventory record, @Param("example") ResumeInventoryExample example);

    int updateByPrimaryKeySelective(ResumeInventory record);

    int updateByPrimaryKey(ResumeInventory record);
}