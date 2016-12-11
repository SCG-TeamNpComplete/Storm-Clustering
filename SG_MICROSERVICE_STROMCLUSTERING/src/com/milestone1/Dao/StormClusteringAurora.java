package com.milestone1.Dao;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.milestone1.aurora.AuroraClient;
import com.milestone1.mesos.MesosService;


@Path("/StormClustering")
public class StormClusteringAurora {
	
	@GET
	@Path("/runAurora")
	@Produces("application/xml")
	public String generateForecast(){
	        MesosService mesosService = new MesosService();
	        mesosService.execute();
	        String forecast =  "<kml><b1>HELLO</b1></kml>";
	        return forecast;
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() throws Exception {
	        AuroraClient client = new AuroraClient();
	        client.getJobDetails();
	        return "hello";
	    }
	}


