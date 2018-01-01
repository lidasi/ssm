package cwweb.com.dao;

import cwweb.com.model.AddressInfo;
import cwweb.com.model.AddressInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressInfoMapper {
    int countByExample(AddressInfoExample example);

    int deleteByExample(AddressInfoExample example);

    int deleteByPrimaryKey(Integer addressId);

    int insert(AddressInfo record);

    int insertSelective(AddressInfo record);

    List<AddressInfo> selectByExample(AddressInfoExample example);

    AddressInfo selectByPrimaryKey(Integer addressId);

    int updateByExampleSelective(@Param("record") AddressInfo record, @Param("example") AddressInfoExample example);

    int updateByExample(@Param("record") AddressInfo record, @Param("example") AddressInfoExample example);

    int updateByPrimaryKeySelective(AddressInfo record);

    int updateByPrimaryKey(AddressInfo record);
}