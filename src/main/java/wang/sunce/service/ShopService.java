package wang.sunce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wang.sunce.dao.ShopDao;
import wang.sunce.entity.Shop;

import java.util.List;

/**
 * Created by Sunce on 2017/3/22 0022.
 */
@Service
@Transactional
public class ShopService {
    @Autowired
    ShopDao ShopDao;

    public void save(Shop Shop){
        ShopDao.save(Shop);
    }

    public Shop update(Shop Shop){
        ShopDao.save(Shop);
        return Shop;
    }

    public List<Shop> findAll(){
        return ShopDao.findAll();
    }

    public void delete(Shop Shop){
        ShopDao.delete(Shop);
    }
}
