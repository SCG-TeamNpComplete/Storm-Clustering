package com.milestone1.aurora;

import java.util.ArrayList;
import java.util.List;

import com.milestone1.aurora.bean.JobDetailsResponseBean;
import com.milestone1.aurora.bean.JobResultsBean;
import com.milestone1.aurora.client.sdk.ReadOnlyScheduler;

public class Application {
	public static void main(String[] args) throws Exception {
		List<String> jobsList=new ArrayList<String>(); 
		List<JobResultsBean> jobResultsBeanList = new ArrayList<>();
		
		String job="Np-Complete";
		AuroraClient1 client= new AuroraClient1();
		String jobName="";
		
		String job1=job+"1";
		String job2=job+"2";
		
		
		client.createJob(job1);
		client.createJob(job2);
		jobsList.add(job1);
		jobsList.add(job2);
		
		
		
		System.out.println("GETTING JOB DETAILS \n");
		System.out.println("-----------------------");
		
		for(String jobs:jobsList){
			JobDetailsResponseBean bean=client.getJobDetails(jobs);
			System.out.println();
			System.out.println(bean.toString());
		}
		
		jobResultsBeanList=client.getJobDetailsList(jobsList);
		for(JobResultsBean jobs:jobResultsBeanList){
			System.out.println("In JobResultsBean");
			System.out.println(jobs.getJobName());
			System.out.println(jobs.getScheduleStatus());
			System.out.println(jobs.getImageUrls());
			
		}
		
		
		//JobDetailsResponseBean bean=client.getJobDetails(job1);
		//System.out.println(bean.toString());
		
		//System.out.println("GETTING JOB SUMARY \n");
		//System.out.println("-----------------------");
		
		//client.getJobSummary(client);
		
		
	}

}
