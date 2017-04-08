package wang.sunce.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import wang.sunce.entity.Food;
import wang.sunce.service.FoodService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Sunce on 2017/4/4 0004.
 */
@Component
public class TestTask {

    @Resource
    private FoodService foodService;
    //    @Scheduled(cron = "1/1 * * * * ? ")
    @Scheduled(cron = "0 0 0/7 * * ? ")
    public void testDataSource(){
        List<Food> foods=foodService.findAll();
        System.out.print(foods);
    }
}
