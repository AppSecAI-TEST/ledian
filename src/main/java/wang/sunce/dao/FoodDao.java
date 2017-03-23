package wang.sunce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Component;
import wang.sunce.entity.Food;

/**
 * Created by Sunce on 2017/3/20 0020.
 */
@Component
public interface FoodDao  extends JpaRepository<Food, Long>, JpaSpecificationExecutor<Food> {

//    public Food find
}
