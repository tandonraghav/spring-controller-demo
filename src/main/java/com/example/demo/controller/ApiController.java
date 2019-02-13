package com.example.demo.controller;

import com.example.demo.model.ApiInput;
import com.example.demo.model.ApiResponse;
import com.example.demo.service.ApiControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author raghav on 13/2/19.
 */
@RestController
public class ApiController {

    @Autowired private ApiControllerService apiControllerService;

    @RequestMapping(method = RequestMethod.POST, value = "/test")
    public ApiResponse test(@RequestBody ApiInput apiInput){
        return apiControllerService.testMethod(apiInput);
    }
}
