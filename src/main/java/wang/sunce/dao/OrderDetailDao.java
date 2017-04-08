package wang.sunce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Component;
import wang.sunce.entity.OrderDetail;

/**
 * Created by Sunce on 2017/3/20 0020.
 */
@Component
public interface OrderDetailDao extends JpaRepository<OrderDetail, Long>, JpaSpecificationExecutor<OrderDetail> {

//    public Food find
}
