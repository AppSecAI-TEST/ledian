package wang.sunce.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import wang.sunce.entity.Food;
import wang.sunce.service.FoodService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Sunce on 2017/3/21 0021.
 */
@RestController
public class FoodController {

    @Resource
    private FoodService foodService;

    @RequestMapping("/test")
    public @ResponseBody String find(){
    List<Food> foods=foodService.findAll();
        System.out.print(foods);
        return  foods.toString();
    }

    @RequestMapping("/save")
    public @ResponseBody String save(String foodName){
//        Food food=new Food();
//        food.setName(foodName);
//        foodDao.save(food);
        List<Food> foods=foodService.findAll();
        System.out.print(foods);
        return  foods.toString();
    }
}
