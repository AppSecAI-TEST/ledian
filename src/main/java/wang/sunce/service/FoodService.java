package wang.sunce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wang.sunce.dao.FoodDao;
import wang.sunce.entity.Food;

import java.util.List;

/**
 * Created by Sunce on 2017/3/22 0022.
 */
@Service
@Transactional
public class FoodService {
    @Autowired
    FoodDao foodDao;

    public void save(Food food){
        foodDao.save(food);
    }

    public Food update(Food food){
        foodDao.save(food);
        return food;
    }

    public List<Food> findAll(){
        return foodDao.findAll();
    }

    public void delete(Food food){
        foodDao.delete(food);
    }
}
