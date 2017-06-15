package com.psl.pip.service;

import java.io.*;


import javax.xml.bind.*;

import com.psl.pip.dataAccessLayer.Customer;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class JerseyClient {

	public static Customer business() {
		Customer que=null;

		try {

			Customer cs = new Customer();
			
			Client c = Client.create();
			WebResource r=c.resource("http://localhost:8080/RESTfulExample/rest/xml/customer/999/loc.htm");

			
			

			ClientResponse response = r.get(ClientResponse.class);
			System.out.println( response.getStatus() );
			System.out.println( response.getHeaders().get("Content-Type") );
			String entity = response.getEntity(String.class);
			System.out.println(entity);

			StringReader reader = new StringReader(entity);
			 JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);  
			   
		        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
		        que= (Customer) jaxbUnmarshaller.unmarshal(reader); 
		        System.out.println(que);
			
		} catch (Exception e) {

			e.printStackTrace();

		}
		return que;
	}

}
