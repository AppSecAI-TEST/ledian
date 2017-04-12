package wang.sunce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import wang.sunce.constant.ShopConstant;
import wang.sunce.constant.StatusConstant;
import wang.sunce.dao.OperatorDao;
import wang.sunce.entity.Operator;
import wang.sunce.exception.ServiceException;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class OperatorService {
    @Autowired
    OperatorDao operatorDao;

    public void saveBaseInfo(String phone,String password,String passwordConfirm){
        if(StringUtils.isEmpty(phone)){
            throw new ServiceException("手机号不允许为空");
        }
        if(StringUtils.isEmpty(password)||StringUtils.isEmpty(passwordConfirm)){
            throw new ServiceException("密码不允许为空");
        }
        if(!password.equals(passwordConfirm)){
            throw new ServiceException("两次密码不一致");
        }
        Operator operator=new Operator();
        operator.setPhoneNo(phone);
        operator.setPassword(password);
        operator.setPublicPassword(password);
        operator.setStatus(StatusConstant.INIT_STATUS);
        operator.setCreateTime(new Date());
        operator.setType(ShopConstant.OWNER);
        operatorDao.save(operator);
    }

    public void save(Operator Operator){
        operatorDao.save(Operator);
    }

    public Operator update(Operator Operator){
        operatorDao.save(Operator);
        return Operator;
    }

    public List<Operator> findAll(){
        return operatorDao.findAll();
    }

    public void delete(Operator Operator){
        operatorDao.delete(Operator);
    }
}
