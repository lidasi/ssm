package cwweb.com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cwweb.com.model.RefundInfo;
import cwweb.com.model.RefundInfoExample;

public interface RefundInfoMapper {
    int countByExample(RefundInfoExample example);

    int deleteByExample(RefundInfoExample example);

    int deleteByPrimaryKey(Integer refundId);

    int insert(RefundInfo record);

    int insertSelective(RefundInfo record);

    List<RefundInfo> selectByExample(RefundInfoExample example);

    RefundInfo selectByPrimaryKey(Integer refundId);

    int updateByExampleSelective(@Param("record") RefundInfo record, @Param("example") RefundInfoExample example);

    int updateByExample(@Param("record") RefundInfo record, @Param("example") RefundInfoExample example);

    int updateByPrimaryKeySelective(RefundInfo record);

    int updateByPrimaryKey(RefundInfo record);
}