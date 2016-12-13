package com.milestone1.Dao;

import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.milestone1.aurora.AuroraClient1;
import com.milestone1.aurora.bean.JobDetailsBean;
import com.milestone1.aurora.bean.JobDetailsResponseBean;

@Path("/getjobdetails")
public class JobDetails {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<JobDetailsBean> getJobDetails() throws Exception {

		System.out.println("inside getJobDetails");

		List<String> jobsList = StormClustering.jobsList;
		List<JobDetailsBean> jdb = new LinkedList<>();
		AuroraClient1 client = new AuroraClient1();
		String host = "";
		for (String jobs : jobsList) {
			JobDetailsResponseBean bean = client.getJobDetails(jobs);
			if (bean.getTasks().get(0).getAssignedTask().slaveHost.equals("sga-mesos-slave-2")) {
				host = "54.215.219.32";
			} else {
				host = "52.53.179.0";
			}

			int size = bean.getTasks().size();
			if (size > 0) {
				String gif1 = host + ":1338/file/" + bean.getTasks().get(size - 1).getAssignedTask().taskId
						+ "/wrfoutput/Surface_multi.gif";
				String gif2 = host + ":1338/file/" + bean.getTasks().get(size - 1).getAssignedTask().taskId
						+ "/wrfoutput/Precip_total.gif";
				jdb.add(new JobDetailsBean(jobs, bean.getTasks().get(size - 1).assignedTask.task.ramMb,
						bean.getTasks().get(size - 1).assignedTask.task.numCpus,
						bean.getTasks().get(size - 1).assignedTask.task.diskMb, gif1, gif2,
						bean.getTasks().get(size - 1).status));
			}

		}

		System.out.println(jdb.size());

		return jdb;

	}

}
