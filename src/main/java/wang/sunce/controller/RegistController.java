package wang.sunce.controller;

import com.google.gson.JsonObject;
import io.goeasy.GoEasy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import wang.sunce.entity.Food;
import wang.sunce.entity.Shop;
import wang.sunce.exception.ServiceException;
import wang.sunce.service.FoodService;
import wang.sunce.service.OperatorService;
import wang.sunce.service.ShopService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class RegistController {

    Logger logger= LoggerFactory.getLogger(RegistController.class);
    @Resource
    private OperatorService operatorService;
    @Resource
    private ShopService shopService;

    @RequestMapping("/newuser")
    public ModelAndView newuser(){
        ModelAndView model=new ModelAndView();
        model.setViewName("/regist/regist");
        return model;
    }

    @RequestMapping("/regist")
    public ModelAndView regist(HttpServletRequest request,@RequestParam String name,@RequestParam String password,@RequestParam String passwordConfirm,Model model){
//        logger.info(String.format("registPhone name:%s,password:%s,passwordConfirm:%s"), name, password, passwordConfirm);
        ModelAndView view=new ModelAndView();
        try{
            operatorService.saveBaseInfo(name,password,passwordConfirm);
            request.getSession().setAttribute("phoneNo",name);
            model.addAttribute("phoneNum",name);
            view.setViewName("/regist/complete");
        }catch (ServiceException e){
            view.setViewName("/error");
        }catch (Exception e){
            view.setViewName("/error");
        }
        return view;
    }

    @RequestMapping("/toComplete")
    public ModelAndView toComplete(HttpServletRequest request,@RequestParam String name,Model model){
//        logger.info(String.format("registPhone name:%s,password:%s,passwordConfirm:%s"), name, password, passwordConfirm);
        ModelAndView view=new ModelAndView();
        try{
            request.getSession().setAttribute("phoneNo", name);
            model.addAttribute("phoneNum",name);
            view.setViewName("/regist/complete");
        }catch (ServiceException e){
            view.setViewName("/error");
        }catch (Exception e){
            view.setViewName("/error");
        }
        return view;
    }


    @RequestMapping("/complete")
    public ModelAndView complete(HttpServletRequest request,Shop shop){
//        logger.info(String.format("registPhone name:%s,password:%s,passwordConfirm:%s"), name, password, passwordConfirm);
        ModelAndView model=new ModelAndView();
        try{
            shopService.save(shop);
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

}
