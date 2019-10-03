package com.zensar.webservice.hello;

import java.time.LocalDate;

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
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
	public String sayHtmlHello() {
		return "<html>" + "<title>" + "Hello Jesrsey" + "</title>" + "<body bgcolor='pink'><h1>" + "Hello Jersy HTML"
				+ "</h1></body>" + "</html>";
	}

	@Path("/xml")
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXmlHello() {
		return "<?xml version='1.0'?><hello>HelloJerSey</hello>";
	}

	@GET
	@Path("/{nm}")
	@Produces("text/plain")
	public String sayHelloUser(@PathParam("nm") String name) { // nm istempory vr
		return "Dear" + name + "welcome to zensar hello sevrice";
	}

	@GET
	@Path("res/{nm}")
	@Produces("text/plain")
	public Response sayHelloUserResponse(@PathParam("nm") String name) { // nm istempory vr
		Response res = Response.status(200).entity("Dear" + name + "welcome to zensar hello sevrice").build();
		return res;
	}
@GET
	@Path("res/{nm}/{dd}/{mm}/{yy}")
	@Produces("text/plain")
	public Response sayHappyBirthday(@PathParam("nm") String name, @PathParam("dd") int day, @PathParam("mm") int month,
			@PathParam("yy") int year) { // nm is nbtempory vr
		LocalDate birthdate = LocalDate.of(year, month, day);
		Response res = Response.status(200)
				.entity("Dear" + name + "Happy Birthday!!!!!!!!!!!on" + birthdate + "welcome to zensar hello sevrice")
				.build();
		return res;
	}

}
