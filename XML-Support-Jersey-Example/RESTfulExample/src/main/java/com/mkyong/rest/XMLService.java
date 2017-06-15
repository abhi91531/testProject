package com.mkyong.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mkyong.Customer;



@Path("/xml/customer")
public class XMLService {

	@GET
	@Path("/{pin}/loc.htm")
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomerInXML(@PathParam("pin") int pin) {

		Customer customer = new Customer();
		customer.setName("mkyong");
		
		customer.setPin("999");

		return customer;

	}

}