package com.angus.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with eureka-client.
 * User: anguszhu
 * Date: Jun,22 2017
 * Time: 16:25
 * description:
 */
@RestController
public class HelloController {

    @RequestMapping("/name/{who:.*}")
    public String sayHello(@PathVariable String who){
        return "Hey "+who+", what's up man!";
    }
}
