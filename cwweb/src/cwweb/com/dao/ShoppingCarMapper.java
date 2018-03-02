package cwweb.com.dao;

import cwweb.com.model.ShoppingCar;
import cwweb.com.model.ShoppingCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoppingCarMapper {
    int countByExample(ShoppingCarExample example);

    int deleteByExample(ShoppingCarExample example);

    int deleteByPrimaryKey(Integer carId);

    int insert(ShoppingCar record);

    int insertSelective(ShoppingCar record);

    List<ShoppingCar> selectByExample(ShoppingCarExample example);

    ShoppingCar selectByPrimaryKey(Integer carId);

    int updateByExampleSelective(@Param("record") ShoppingCar record, @Param("example") ShoppingCarExample example);

    int updateByExample(@Param("record") ShoppingCar record, @Param("example") ShoppingCarExample example);

    int updateByPrimaryKeySelective(ShoppingCar record);

    int updateByPrimaryKey(ShoppingCar record);
}