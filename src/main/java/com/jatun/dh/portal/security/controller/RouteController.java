package com.jatun.dh.portal.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by aralco on 2/1/15.
 */
@Controller
public class RouteController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String processHome(ModelMap model)   {
        model.addAttribute("message", "Welcome from controller");
        return "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(ModelMap model)   {
        String view = "error";
        if(true) {
            view = "home";
        }
        return view;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public String processLogout(ModelMap modelMap)   {
        return "login";
    }

}
