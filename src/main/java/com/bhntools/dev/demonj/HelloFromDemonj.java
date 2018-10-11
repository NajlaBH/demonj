/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bhntools.dev.demonj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author remindNahool
 */

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloFromDemonj {
    @GetMapping
    public String hello () {
        return "Hello from demonj running with docker";
    }
    
}