package cn.lt.core.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lt.core.dao.FoodDao;
import cn.lt.core.po.Food;
import cn.lt.core.service.FoodService;
/**
 * 用户Service接口实现类
 */
@Service("foodService")
@Transactional
public class FoodServiceImpl implements FoodService {
	@Autowired
	private FoodDao foodDao;

	@Override
	public boolean addFood(Food food) {
		return this.foodDao.addFood(food)>0 ? true:false;
	}


	@Override
	public List<Food> findAllFood() {
		return this.foodDao.findAllFood();
	}


	@Override
	public void delFood(int id) {
		this.foodDao.delFood(id);
	}


	@Override
	public Food findFoodById(int id) {
		return this.foodDao.findFoodById(id);
	}


	@Override
	public boolean updateFood(Food food) {
		return this.foodDao.updateFood(food)>0 ? true:false;
	}


	@Override
	public Food findFoodByName(String name) {
		return this.foodDao.findFoodByName(name);
	}
	

}
