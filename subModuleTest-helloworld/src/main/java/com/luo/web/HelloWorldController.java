package com.luo.web;

import com.luo.domain.City;
import com.luo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot HelloWorld 案例
 * <p>
 * Created by bysocket on 16/4/26.
 */
@RestController
public class HelloWorldController {
    @Autowired(required = false)
    private CityService cityService;

    @RequestMapping("/")
    public String sayHello() {
        return "pipeline!";
    }

    @GetMapping(value = "/api/city1/{id}")
    public City findOneCity1(@PathVariable("id") Long id) {
        return cityService.findCityById(id);
    }


}
