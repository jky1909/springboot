package com.tl.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jky
 * @date 2018/5/25 18:04
 */
@RestController
@RequestMapping({"/home"})
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/user")
    @ResponseBody
    public String user(){
        User user = userMapper.findUserByName("kaka");
        return user.getName()+"-----"+user.getAge();
    }
}
