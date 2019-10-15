package com.mootal.id.controller;

import com.mootal.id.service.IdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * . _________         .__   _____   __
 * ./   _____/__  _  __|__|_/ ____\_/  |_
 * .\_____  \ \ \/ \/ /|  |\   __\ \   __\
 * ./        \ \     / |  | |  |    |  |
 * /_______  /  \/\_/  |__| |__|    |__|
 * .       \/
 *
 * @author li tong
 * @date 2019/3/27 16:12
 * @see Object
 * @since 1.0
 */
@RestController
public class IdTestController {

    private static final Logger logger = LoggerFactory.getLogger(IdTestController.class);

    @Autowired
    private IdService idService;

    @GetMapping("/welcome")
    public String activeProfile() {
        return "Hello";
    }

    @GetMapping("/getId")
    public Object getId(String key) {
        return idService.getId(key);
    }

}
