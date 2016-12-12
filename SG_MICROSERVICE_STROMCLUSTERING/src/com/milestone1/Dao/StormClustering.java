package com.milestone1.Dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.milestone1.Service.StrormClusteringService;
import com.milestone1.aurora.AuroraClient1;
import com.milestone1.aurora.bean.JobResultsBean;

@Path("/StormClustering")
public class StormClustering {
	public static List<String> jobsList = new ArrayList<String>();
	private StrormClusteringService StrormClusteringService;
	private AuroraClient1 client;

	@GET
	@Path("/get")
	@Produces("application/xml")
	public String generateKML(String xmlNewResponse) throws Exception {
		System.out.println("IN SC /get");
		List<JobResultsBean> jobResultsBeanList = new ArrayList<>();

		String job = "Np-Complete";
		client = new AuroraClient1();
		// String jobName="";

		String job1 = job + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		System.out.println(job1);
		jobsList.add(job1);

		client.createJob(job1);

		Test test = new Test();
		String dummy = "";

		return "<KMLResponseFromStormClustering>" + "<tags>" + dummy + "</tags>" + "<ResponseMessageFromPrevious>"
				+ xmlNewResponse + "</ResponseMessageFromPrevious>" + "</KMLResponseFromStormClustering>";
	}

	@POST
	@Path("/send")
	@Consumes("application/xml")
	public Response json(String xmlResponse) throws Exception {
		StormClustering sc = new StormClustering();
		String xmlNewResponse = xmlResponse;
		System.out.println("data in Clustering" + xmlNewResponse);
		sc.generateKML(xmlNewResponse);
		System.out.println("DONE!!!!!!!!!!!!!!!!!!!!!!");
		return Response.status(200).entity(xmlNewResponse).build();

	}
	
	public AuroraClient1 getClient(){
		return client;
	}
	

}
