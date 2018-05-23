package top.oyoung.cloudservicedemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import top.oyoung.cloudservicedemo.entity.UserEntity;

import java.util.Random;

/**
 * @Author: Yang Weixin
 * @Description:
 * @DateTime: 2018/5/21 下午6:38
 */

@RestController
@RequestMapping("/user")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("id")
    public String getUserById(
        @RequestParam Long id
    ) throws InterruptedException {
        int time = new Random().nextInt(3000);
        logger.error("sleep time: "+ time);
        Thread.sleep(time);
        return "USER: userid "+ id;
    }

    @GetMapping("area")
    public String getUserById1(
        @RequestParam Long id,
        @RequestHeader String area
    ){
        StringBuffer str = new StringBuffer();
        str.append("USER: ");
        str.append("userId: "+ 1);
        str.append(",area: "+ area);

        return str.toString();
    }

    @PostMapping("entity")
    public String getUserById2(
        @RequestBody UserEntity user
    ){
        StringBuffer str = new StringBuffer();
        str.append("USER: ");
        str.append(user.toString());

        return str.toString();
    }
}
