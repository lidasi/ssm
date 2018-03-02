package cwweb.com.dao;

import cwweb.com.model.ResumeInfo;
import cwweb.com.model.ResumeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResumeInfoMapper {
    int countByExample(ResumeInfoExample example);

    int deleteByExample(ResumeInfoExample example);

    int deleteByPrimaryKey(Integer resumeId);

    int insert(ResumeInfo record);

    int insertSelective(ResumeInfo record);

    List<ResumeInfo> selectByExample(ResumeInfoExample example);

    ResumeInfo selectByPrimaryKey(Integer resumeId);

    int updateByExampleSelective(@Param("record") ResumeInfo record, @Param("example") ResumeInfoExample example);

    int updateByExample(@Param("record") ResumeInfo record, @Param("example") ResumeInfoExample example);

    int updateByPrimaryKeySelective(ResumeInfo record);

    int updateByPrimaryKey(ResumeInfo record);
}