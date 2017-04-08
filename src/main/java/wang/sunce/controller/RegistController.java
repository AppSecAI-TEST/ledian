package wang.sunce.controller;

import com.google.gson.JsonObject;
import io.goeasy.GoEasy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import wang.sunce.entity.Food;
import wang.sunce.service.FoodService;
import wang.sunce.service.OperatorService;

import javax.annotation.Resource;
import java.util.List;


@Controller
public class RegistController {

    @Resource
    private OperatorService operatorService;

    @RequestMapping("/regist")
    public @ResponseBody String regist(String phone,String password){
        return null;
    }

}
