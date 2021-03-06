package com.cloudnative;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class PriceController {

    @RequestMapping(value="/price/{id}",method = RequestMethod.GET)
    public String getPriceByID(@PathVariable Long id) throws InterruptedException {
        System.out.println("id = [" + id + "]");
        Random random =new Random();
        int x = random.nextInt(100);
        System.out.println("x = [" + x + "]");
        Thread.sleep(x);
        return "{id:"+id+"}";
    }
}
