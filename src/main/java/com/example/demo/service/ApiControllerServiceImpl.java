package com.example.demo.service;

import com.example.demo.model.ApiInput;
import com.example.demo.model.ApiResponse;
import org.springframework.stereotype.Service;

/**
 * @author raghav on 13/2/19.
 */
@Service
public class ApiControllerServiceImpl implements ApiControllerService{

    public ApiResponse testMethod(ApiInput apiInput){
        ApiResponse apiResponse=new ApiResponse();
        apiResponse.setName(apiInput.getName());
        apiResponse.setLastName(apiInput.getLastName());
        return apiResponse;
    }

}
