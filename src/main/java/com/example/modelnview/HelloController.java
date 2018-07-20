package com.example.modelnview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @Autowired
    MydataRepository repository;

    @RequestMapping("/")
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("index");
        Iterable<MyData> list = repository.findAll();
        mav.addObject("data", list);
        return mav;
    }
}
