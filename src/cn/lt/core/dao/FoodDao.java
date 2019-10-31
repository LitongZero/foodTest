package cn.lt.core.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.lt.core.po.Food;
/**
 * 用户DAO层接口
 */
public interface FoodDao {
	/**
	 * 通过账号和密码查询用户
	 */
	public int addFood(Food food);
	
	public List<Food> findAllFood();

	public void delFood(int id);
	
	public Food findFoodById(int id);
	
	public int updateFood(Food food);

	public Food findFoodByName(@Param("name")String name);
}
