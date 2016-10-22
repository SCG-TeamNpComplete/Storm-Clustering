package com.milestone1.Dao;

import java.text.ParseException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.json.JSONException;

import com.milestone1.Service.StrormClusteringService;

@Path("/StormClustering")
public class StormClustering {
	
	public static Logger log = Logger.getLogger(StormClustering.class);
	private StrormClusteringService StrormClusteringService;

	@GET
	@Path("/get")
	@Produces("application/xml")
	public String generateKML(String xmlNewResponse) throws ParseException {

		Test test = new Test();
		log.info("created Test class Object");
		
		String dummy = "";

		return "<KMLResponseFromStormClustering>" + "<tags>" + dummy + "</tags>" + "<ResponseMessageFromPrevious>"
				+ xmlNewResponse + "</ResponseMessageFromPrevious>" + "</KMLResponseFromStormClustering>";
	}

	@POST
	@Path("/send")
	@Consumes("application/xml")
	public Response json(String xmlResponse) throws ParseException, JSONException {
		
		log.info("inside post() of storm cluster service");
		StormClustering sc = new StormClustering();
		String xmlNewResponse = xmlResponse;
		System.out.println("data in Clustering" + xmlNewResponse);
		sc.generateKML(xmlNewResponse);
		
		log.info("generated response successfully : storm clustering");
		System.out.println("DONE!!!!!!!!!!!!!!!!!!!!!!");
		return Response.status(200).entity(xmlNewResponse).build();
	}

}
