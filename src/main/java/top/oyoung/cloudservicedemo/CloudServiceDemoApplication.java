package top.oyoung.cloudservicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudServiceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServiceDemoApplication.class, args);
    }
}

