package com.itmsw.ant1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author tianyi
 * @date 2019-01-16 00:53
 */
@Controller
public class JumpController {

    @GetMapping("/apidoc")
    public String toDoc(){
        return "doc/index";
    }
}
