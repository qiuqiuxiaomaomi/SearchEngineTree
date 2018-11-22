package com.bonaparte.config;

import com.karakal.commons.filter.ApiCorsFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MvcConfig {

    @Bean
    public FilterRegistrationBean apiCorsFilterRegistrationBean(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        ApiCorsFilter apiCorsFilter = new ApiCorsFilter();
        registrationBean.setFilter(apiCorsFilter);
        List<String> urlPatterns = new ArrayList<String>();
        urlPatterns.add("/competeInfo");
        registrationBean.setUrlPatterns(urlPatterns);
        return registrationBean;
    }
}
