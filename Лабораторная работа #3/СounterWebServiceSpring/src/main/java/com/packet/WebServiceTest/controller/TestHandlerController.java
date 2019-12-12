package com.packet.WebServiceTest.controller;

import com.packet.WebServiceTest.controller.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/index")
public class TestHandlerController {
    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    @ResponseBody
    public String getRemininder(ModelMap model){
        StringBuilder sb = new StringBuilder();
        sb.append("<h1>Local counter: " + Counter.getlocalCount() + "</h1>");
        sb.append("<h1>Total counter: " + Counter.getTotalCount() + "</h1>");
        return sb.toString();
    }

    @RequestMapping(value = {"/incr", "/incr/"}, method = RequestMethod.GET)
    @ResponseBody
    public String postRemininder(ModelMap model){
        StringBuilder sb = new StringBuilder();
        sb.append("<h1>Local counter: " + Counter.incrlocalCount() + "</h1>");
        sb.append("<h1>Total counter: " + Counter.incrTotalCount() + "</h1>");
        return sb.toString();
    }
}
