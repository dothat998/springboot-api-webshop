package com.datn;

import com.datn.util.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.Arrays;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class DatnApplication {

    static  int M[];
    public static void main(String[] args) {

        SpringApplication.run(DatnApplication.class, args
        );

        Arrays.sort(M);
    }

}
