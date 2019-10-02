package com.zensar.webservice.hello;
import javax.ws.rs.GET;
/**
 * @author Rohini Ahirrao
 * @creation Date 1st oct 2019 5:19PM
 * @modification Date  1st oct 2019 5:19PM
 * @version 1.0
 * @copyright : zensar Technologies . All rights reserved.
 * @description It is webService. 
 */
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {
	@GET
	@Produces(MediaType.TEXT_HTML)
public String sayPlaneHello() {
	return "welcome To Zensar Hello Service";
}
	@Path("/html")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello()
	{
		return "<html>" + "<title>" +"Hello Jesrsey"+"</title>" 
	+"<body bgcolor='pink'><h1>" + "Hello Jersy HTML" + "</h1></body>" + "</html>";
	}
	@Path("/xml")
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXmlHello()
	{
		return "<?xml version='1.0'?><hello>HelloJerSey</hello>";
	}
	
}
