package cn.lt.core.service;
import java.util.List;

import cn.lt.core.po.Food;

public interface FoodService {
	
	public List<Food> findAllFood();

	public boolean addFood(Food food);

	public void delFood(int id);
	
	public Food findFoodById(int id);
	
	public boolean updateFood(Food food);

	public Food findFoodByName(String name);
}
