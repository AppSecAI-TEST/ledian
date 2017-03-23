package wang.sunce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import wang.sunce.dao.FoodDao;
import wang.sunce.entity.Food;

import java.util.List;

/**
 * Created by Sunce on 2017/3/19 0019.
 */
@SpringBootApplication
public class Application {



    public static  void  main(String[] args){
        SpringApplication.run(Application.class);
    }

}
