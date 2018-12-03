package com.uae.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/list")
@Api(value="onlinestore", description="Operations pertaining to list in Online Store")
public class WelcomeController {

	@ApiOperation(value = "View a list of available products",response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
	 @RequestMapping(value = "/productlist", method= RequestMethod.GET)
	    public List productlist(String name){
		 List<String> test = new ArrayList<String>();
		 test.add("dress");
		 test.add("shoes");
	     return test;
	    }
	 
	@ApiOperation(value = "View a list of companylist products",response = List.class)
	 @RequestMapping(value = "/companylist", method= RequestMethod.GET)
	    public List companylist(String name){
		 List<String> test = new ArrayList<String>();
		 test.add("unimoni");
		 test.add("cts");
	     return test;
	    }
	 
	@ApiOperation(value = "View a list of frendlist products",response = List.class)
	 @RequestMapping(value = "/frendlist", method= RequestMethod.GET)
	    public List frendlist(String name){
		 List<String> test = new ArrayList<String>();
		 test.add("venkat");
		 test.add("sudheer");
	     return test;
	    }
	 
	@ApiOperation(value = "View a list of itemlist products",response = List.class)
	 @RequestMapping(value = "/itemlist", method= RequestMethod.GET)
	    public List list(String name){
		 List<String> test = new ArrayList<String>();
		 test.add("idli");
		 test.add("vada");
	     return test;
	    }
	   

}