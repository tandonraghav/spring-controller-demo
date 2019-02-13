package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Getter;
import lombok.Setter;

/**
 * @author raghav on 13/2/19.
 */
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
public class ApiResponse {

    private String name;

    private String lastName;

}
