package com.tang.lcn.stock;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Classname OrderApplication
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/12/23 19:09
 * @Created by ASUS
 */
@EnableTransactionManagement
@SpringBootApplication
@EnableEurekaClient
@MapperScan(value = {"com.tang.lcn.stock.mapper"})
@EnableDistributedTransaction
public class StockApplication {

    public static void main(String[] args) {

        SpringApplication.run(StockApplication.class, args);


    }

}