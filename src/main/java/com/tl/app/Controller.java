package com.tl.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jky
 * @date 2018/5/24 14:59
 */
//@org.springframework.stereotype.Controller
@RestController
public class Controller {
    @RequestMapping("/index")
    @ResponseBody
    public Map<String,String> index(){
        Map map = new HashMap<String,String>(8);
        map.put("悟空","是只猴子");
        map.put("八戒","是个英雄");
        return map;
    }
}
