package com.service;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/login")
public class LoginService {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String registerMobileNo(@HeaderParam("mobileNo") String mobileNo){
		
		return "success";
		
	}
}
