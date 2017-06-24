package com.oauth2app.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

    @RequestMapping(value = "/secured", method = RequestMethod.GET)
    public String securedEndpoint() {
        return "Secret stuff";
    }

    @RequestMapping(value = "/unsecured", method = RequestMethod.GET)
    public String unsecuredEndpoint() {
        return "Just public stuff";
    }
}
