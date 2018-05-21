package top.oyoung.cloudservicedemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Yang Weixin
 * @Description:
 * @DateTime: 2018/5/21 下午6:38
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("")
    public String getUserById(){
        return "this is User Controller";
    }
}
