package com.javacodegeeks.enterprise.rest.resteasy;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.simple.JSONObject;



@Path("jsonServices")
public class RESTEasyJSONServices {

	@GET
	@Path("/print/{name}")
	@Produces("application/json")
	public Student produceJSON( @PathParam("name") String name ) {
		
		Student st = new Student(name, "Marco",19,12);

		return st;

	}
	
	@POST
	@Path("/send")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response consumeJSON( Student student ) {
		
		String output = student.toString();

		return Response.status(200).entity(output).build();
	}


}
