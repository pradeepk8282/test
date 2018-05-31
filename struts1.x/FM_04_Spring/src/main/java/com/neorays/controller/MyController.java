package com.neorays.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.neorays.service.VersionService;

@Controller
public class MyController {

    @Autowired
    private VersionService versionService;

    @RequestMapping("/index")
    public String index(Model model) {

        return "index";
    }

    @RequestMapping(value = "/version", method = RequestMethod.GET)
    public ModelAndView version() {

        String version = versionService.getVersion();

        ModelAndView model = new ModelAndView("version");
        model.addObject("version", version);

        return model;
    }
}