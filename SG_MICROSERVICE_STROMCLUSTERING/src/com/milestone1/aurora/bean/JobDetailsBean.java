package com.milestone1.aurora.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JobDetailsBean {

	private String jobName;
	private long ram;
	private double cpu;
	private long disk;
	private String gif1;
	private String gif2;
	
	public JobDetailsBean(){
		
	}
	

	public JobDetailsBean(String jobName, long ramMb, double numCpus, long diskMb, String gif1, String gif2) {
		super();
		this.jobName = jobName;
		this.ram = ramMb;
		this.cpu = numCpus;
		this.disk = diskMb;
		this.gif1 = gif1;
		this.gif2 = gif2;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public long getRam() {
		return ram;
	}

	public void setRam(long ram) {
		this.ram = ram;
	}

	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public long getDisk() {
		return disk;
	}

	public void setDisk(long disk) {
		this.disk = disk;
	}

	public String getGif1() {
		return gif1;
	}

	public void setGif1(String gif1) {
		this.gif1 = gif1;
	}

	public String getGif2() {
		return gif2;
	}

	public void setGif2(String gif2) {
		this.gif2 = gif2;
	}

}
