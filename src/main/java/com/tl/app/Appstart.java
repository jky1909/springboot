package com.tl.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author jky
 * @date 2018/5/24 14:58
 */
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.tl"})
public class Appstart {
    public static void main(String[] args){
        SpringApplication.run(Appstart.class,args);
    }

}
