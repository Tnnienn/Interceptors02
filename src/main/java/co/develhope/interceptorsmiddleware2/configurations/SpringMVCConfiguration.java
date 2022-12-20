package co.develhope.interceptorsmiddleware2.configurations;

import co.develhope.interceptorsmiddleware2.interceptors.BasicInterceptor;
import co.develhope.interceptorsmiddleware2.interceptors.MonthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMVCConfiguration implements WebMvcConfigurer {

    @Autowired
    private MonthInterceptor monthInterceptor;
    @Autowired
    private BasicInterceptor basicInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(monthInterceptor);
        registry.addInterceptor(basicInterceptor);
    }

}
