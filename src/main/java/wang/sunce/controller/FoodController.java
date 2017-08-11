package wang.sunce.controller;

import com.google.gson.JsonObject;
import io.goeasy.GoEasy;
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
    @ResponseBody
    String find() {
        List<Food> foods = foodService.findAll();
        System.out.print(foods);
        JsonObject result = new JsonObject();
        result.addProperty("FOOD", foods.toString());
        GoEasy goEasy = new GoEasy("a7c60e16-d2bf-4aed-815d-8e1580a8ca74");
        goEasy.publish("abcde", result.toString());
        return foods.toString();
    }

    @RequestMapping("/save")
    public
    @ResponseBody
    String save(String foodName) {
//        Food food=new Food();
//        food.setName(foodName);
//        foodDao.save(food);
        List<Food> foods = foodService.findAll();
        System.out.print(foods);
        return foods.toString();
    }
}
