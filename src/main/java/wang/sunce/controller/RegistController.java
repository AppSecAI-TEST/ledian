package wang.sunce.controller;

import com.google.gson.JsonObject;
import io.goeasy.GoEasy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import wang.sunce.entity.Food;
import wang.sunce.exception.ServiceException;
import wang.sunce.service.FoodService;
import wang.sunce.service.OperatorService;

import javax.annotation.Resource;
import java.util.List;


@Controller
public class RegistController {

    Logger logger= LoggerFactory.getLogger(RegistController.class);
    @Resource
    private OperatorService operatorService;

    @RequestMapping("/regist")
    public ModelAndView regist(String name,String password,String passwordConfirm){
//        logger.info(String.format("registPhone name:%s,password:%s,passwordConfirm:%s"), name, password, passwordConfirm);
        ModelAndView model=new ModelAndView();
        try{
            operatorService.saveBaseInfo(name,password,passwordConfirm);
            model.setViewName("/regist/complete");
        }catch (ServiceException e){
            model.addObject("msg",e.getMessage());
            model.setViewName("/error");
        }catch (Exception e){
            model.addObject("msg","系统异常");
            model.setViewName("/error");
        }
        return model;
    }
    @RequestMapping("/newuser")
    public ModelAndView newuser(){
        ModelAndView model=new ModelAndView();
        model.setViewName("/regist/regist");
        return model;
    }

}
