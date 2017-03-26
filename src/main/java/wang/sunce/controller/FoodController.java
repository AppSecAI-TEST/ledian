package wang.sunce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import wang.sunce.dao.FoodDao;
import wang.sunce.entity.Food;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Sunce on 2017/3/21 0021.
 */
@RestController
public class FoodController {

    @Resource
    private FoodDao foodDao;

    @RequestMapping("/test")
    public @ResponseBody String find(){
    List<Food> foods=foodDao.findAll();
        return  foods.toString();
    }

    @RequestMapping("/save")
    public @ResponseBody String save(String foodName){
//        Food food=new Food();
//        food.setName(foodName);
//        foodDao.save(food);
        List<Food> foods=foodDao.findAll();
        return  foods.toString();
    }
}
