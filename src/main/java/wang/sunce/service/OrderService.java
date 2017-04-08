package wang.sunce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wang.sunce.dao.OrderDao;
import wang.sunce.entity.Order;

import java.util.List;

/**
 * Created by Sunce on 2017/3/22 0022.
 */
@Service
@Transactional
public class OrderService {
    @Autowired
    OrderDao OrderDao;

    public void save(Order Order){
        OrderDao.save(Order);
    }

    public Order update(Order Order){
        OrderDao.save(Order);
        return Order;
    }

    public List<Order> findAll(){
        return OrderDao.findAll();
    }

    public void delete(Order Order){
        OrderDao.delete(Order);
    }
}
