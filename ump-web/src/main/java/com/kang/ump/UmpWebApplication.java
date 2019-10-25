package com.kang.ump;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangkang
 */
@SpringBootApplication
/*@MapperScan("com.kang.upm.user.**.dao")*/
public class UmpWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(UmpWebApplication.class, args);
    }

}
