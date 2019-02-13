package com.example.demo.service;

import com.example.demo.model.ApiInput;
import com.example.demo.model.ApiResponse;

/**
 * @author raghav on 13/2/19.
 */
public interface ApiControllerService {
    ApiResponse testMethod(ApiInput apiInput);
}
