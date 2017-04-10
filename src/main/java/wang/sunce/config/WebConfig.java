package wang.sunce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sunce on 2017/4/9 0009.
 */
@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter{

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }

    @Bean
    public ViewResolver getViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Override
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }


//    @Bean
//    public ViewResolver getContentNegotiatingViewResolver(ContentNegotiationManager manager) {
//        List<ViewResolver> resolvers = new ArrayList<ViewResolver>();
//        List<View> view = new ArrayList<View>();
////        //解析json
//        MappingJackson2JsonView jsonView = new MappingJackson2JsonView();
//        jsonView.getObjectMapper().setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
//        view.add(jsonView);
//        //解析jsp
//        InternalResourceViewResolver jspResolver = new InternalResourceViewResolver();
////        jspResolver.setPrefix("/WEB-INF/");
//        jspResolver.setPrefix("/");
//        jspResolver.setSuffix(".jsp");
//        jspResolver.setOrder(1);
//        resolvers.add(jspResolver);
//
//        ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
//        resolver.setDefaultViews(view);
//        resolver.setViewResolvers(resolvers);
//        resolver.setContentNegotiationManager(manager);
//        return resolver;
//    }

}
