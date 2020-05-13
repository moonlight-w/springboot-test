package com.moon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author wei
 * @create 2020/4/16
 * @since 1.0.0
 */
public class MultipartConfig {
    @Bean
    public CommonsMultipartResolver resolver(){
        CommonsMultipartResolver r = new CommonsMultipartResolver();
        r.setDefaultEncoding("UTF-8");
        r.setMaxUploadSize(500 * 1024 * 1024);
        r.setMaxInMemorySize(2048);
        return r;
    }

}