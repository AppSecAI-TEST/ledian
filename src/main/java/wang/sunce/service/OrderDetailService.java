package wang.sunce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wang.sunce.dao.OrderDetailDao;
import wang.sunce.entity.OrderDetail;

import java.util.List;

/**
 * Created by Sunce on 2017/3/22 0022.
 */
@Service
@Transactional
public class OrderDetailService {
    @Autowired
    OrderDetailDao OrderDetailDao;

    public void save(OrderDetail OrderDetail){
        OrderDetailDao.save(OrderDetail);
    }

    public OrderDetail update(OrderDetail OrderDetail){
        OrderDetailDao.save(OrderDetail);
        return OrderDetail;
    }

    public List<OrderDetail> findAll(){
        return OrderDetailDao.findAll();
    }

    public void delete(OrderDetail OrderDetail){
        OrderDetailDao.delete(OrderDetail);
    }
}
