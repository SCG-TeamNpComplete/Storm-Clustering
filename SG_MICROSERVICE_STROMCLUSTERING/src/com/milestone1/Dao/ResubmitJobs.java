package com.milestone1.Dao;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.milestone1.aurora.AuroraClient1;

@Path("/resubmit")
public class ResubmitJobs {
	
	private AuroraClient1 client;
	
	@GET
	public void resubmitJobs(@DefaultValue("Np-Complete2016.12.12.19.09.36") @QueryParam("jobName") String jobName) throws Exception{
		System.out.println("in resubmit jobs");
		
		boolean present = false;
		
		for (String s: StormClustering.jobsList){
			if (s.equals(jobName)){
				present = true;
				break;
			}
		}
		
		if (!present){
			StormClustering.jobsList.add(jobName);
		}
		client = new AuroraClient1();
		client.createJob(jobName);
		System.out.println("completed submission");
		
	}
	
}
