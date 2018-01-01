package cwweb.com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cwweb.com.model.SaleResume;
import cwweb.com.model.SaleResumeExample;

public interface SaleResumeMapper {
    int countByExample(SaleResumeExample example);

    int deleteByExample(SaleResumeExample example);

    int deleteByPrimaryKey(Integer saleId);

    int insert(SaleResume record);

    int insertSelective(SaleResume record);

    List<SaleResume> selectByExample(SaleResumeExample example);

    SaleResume selectByPrimaryKey(Integer saleId);

    int updateByExampleSelective(@Param("record") SaleResume record, @Param("example") SaleResumeExample example);

    int updateByExample(@Param("record") SaleResume record, @Param("example") SaleResumeExample example);

    int updateByPrimaryKeySelective(SaleResume record);

    int updateByPrimaryKey(SaleResume record);
}