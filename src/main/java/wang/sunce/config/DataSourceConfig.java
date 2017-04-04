package wang.sunce.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
/**
 * Created by Sunce on 2017/4/4 0004.
 */

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource druidDataSource() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername("root");
//        druidDataSource.setPassword("root");
        druidDataSource.setPassword("cece1028");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/ledian");
        druidDataSource.setMaxActive(100);
        druidDataSource.setFilters("stat,wall");
        druidDataSource.setInitialSize(10);
        return druidDataSource;
    }


}
