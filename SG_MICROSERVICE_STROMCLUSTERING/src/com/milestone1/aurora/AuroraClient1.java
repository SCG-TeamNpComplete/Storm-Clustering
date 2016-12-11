package com.milestone1.aurora;

import com.milestone1.aurora.bean.*;
import com.milestone1.aurora.client.AuroraThriftClient;
import com.milestone1.aurora.client.sdk.*;
import com.milestone1.aurora.utils.AuroraThriftClientUtil;
import com.milestone1.aurora.utils.Constants;
import org.apache.log4j.Logger;
import org.apache.thrift.TException;

import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class AuroraClient1 {

    final static Logger logger = Logger.getLogger(AuroraClient.class);
    /** The properties. */

    /**
     * Gets the job summary.
     *
     * @param client the client
     * @return the job summary
     */
    /*public void getJobSummary(ReadOnlyScheduler.Client client) {
        try {
            
        	//1
        	Response response = client.getJobs("team-npcomplete");
            System.out.println("Response status: " + response.getResponseCode().name());
            if (response.getResult().isSetGetJobsResult()) {
                GetJobsResult result = response.getResult().getGetJobsResult();
                System.out.println(result);
                Set<JobConfiguration> jobConfigs = result.getConfigs();
                for (JobConfiguration jobConfig : jobConfigs) {
                    System.out.println(jobConfig);
                    JobKey jobKey = jobConfig.getKey();
                    Identity owner = jobConfig.getOwner();
                    TaskConfig taskConfig = jobConfig.getTaskConfig();
                    ExecutorConfig exeConfig = taskConfig.getExecutorConfig();

                    System.out.println("\n**** JOB CONFIG ****");
                    System.out.println("\t # instanceCount: " + jobConfig.getInstanceCount());
                    System.out.println("\t >> Job Key <<");
                    System.out.println("\t\t # name: " + jobKey.getName());
                    System.out.println("\t\t # role: " + jobKey.getRole());
                    System.out.println("\t\t # environment: " + jobKey.getEnvironment());
                    System.out.println("\t >> Identity <<");
                    System.out.println("\t\t # owner: " + owner.getUser());
                    System.out.println("\t >> Task Config <<");
                    System.out.println("\t\t # numCPUs: " + taskConfig.getNumCpus());
                    System.out.println("\t\t # diskMb: " + taskConfig.getDiskMb());
                    System.out.println("\t\t # ramMb: " + taskConfig.getRamMb());
                    System.out.println("\t\t # priority: " + taskConfig.getPriority());
                    System.out.println("\t >> Executor Config <<");
                    System.out.println("\t\t # name: " + exeConfig.getName());
                    System.out.println("\t\t # data: " + exeConfig.getData());
                }

            }
        } catch (TException e) {
            logger.error("Error while executing getJobSummary", e);
        }
    }

    public void getJobDetails() throws Exception {
        JobKeyBean jobKey = new JobKeyBean("devel", "team-npcomplete", "bash_wrf-npcomplete");

        JobDetailsResponseBean responseBean = (JobDetailsResponseBean) AuroraThriftClient.getAuroraThriftClient(Constants.AURORA_SCHEDULER_PROP_FILE).getJobDetails(jobKey);
        System.out.println(responseBean.toString());
    }

    public void createJob() throws Exception {
    	
    	System.out.println("Creat job module entered");
    	JobKeyBean jobKey = new JobKeyBean("devel", "team-npcomplete", "bash_wrf-npcomplete");
        IdentityBean owner = new IdentityBean("team-npcomplete");
        
        System.out.println("Job and owner created");
        
        //ProcessBean proc0 = new ProcessBean("process_0", "docker rm -f ncarwrfsandy; docker rm -f postproc;", false);
        ProcessBean proc1 = new ProcessBean("process_1", "docker run -i --volumes-from wpsgeog --volumes-from wrfinputsandy -v ~/wrfoutput:/wrfoutput --name npcomplete-ncarwrfsandy bigwxwrf/ncar-wrf /wrf/run-wrf", false);
        ProcessBean proc2 = new ProcessBean("process_2", "docker run -i --rm=true -v ~/wrfoutput:/wrfoutput --name npcomplete-postproc bigwxwrf/ncar-ncl", false);
        
        System.out.println("processes init");
        Set<ProcessBean> processes = new LinkedHashSet<>();
        //processes.add(proc0);
        processes.add(proc1);
        processes.add(proc2);
        
        System.out.println("processes added");
        
        ResourceBean resources = new ResourceBean(0.2, 200, 200);

        TaskConfigBean taskConfig = new TaskConfigBean("run_forecast_task-npcomplete", processes, resources);
        JobConfigBean jobConfig = new JobConfigBean(jobKey, owner, taskConfig, "example");
        
        System.out.println("config beans done");
        
        String executorConfigJson = AuroraThriftClientUtil.getExecutorConfigJson(jobConfig);
        System.out.println(executorConfigJson);

        AuroraThriftClient client = AuroraThriftClient.getAuroraThriftClient(Constants.AURORA_SCHEDULER_PROP_FILE);
        ResponseBean response = client.createJob(jobConfig);
        System.out.println("END");
    }
    */
    /*public void getJobSummary(ReadOnlyScheduler.Client client) {
        try {
            
        	//1
        	Response response = client.getJobs("team-npcomplete");
            System.out.println("Response status: " + response.getResponseCode().name());
            if (response.getResult().isSetGetJobsResult()) {
                GetJobsResult result = response.getResult().getGetJobsResult();
                System.out.println(result);
                Set<JobConfiguration> jobConfigs = result.getConfigs();
                for (JobConfiguration jobConfig : jobConfigs) {
                    System.out.println(jobConfig);
                    JobKey jobKey = jobConfig.getKey();
                    Identity owner = jobConfig.getOwner();
                    TaskConfig taskConfig = jobConfig.getTaskConfig();
                    ExecutorConfig exeConfig = taskConfig.getExecutorConfig();

                    System.out.println("\n**** JOB CONFIG ****");
                    System.out.println("\t # instanceCount: " + jobConfig.getInstanceCount());
                    System.out.println("\t >> Job Key <<");
                    System.out.println("\t\t # name: " + jobKey.getName());
                    System.out.println("\t\t # role: " + jobKey.getRole());
                    System.out.println("\t\t # environment: " + jobKey.getEnvironment());
                    System.out.println("\t >> Identity <<");
                    System.out.println("\t\t # owner: " + owner.getUser());
                    System.out.println("\t >> Task Config <<");
                    System.out.println("\t\t # numCPUs: " + taskConfig.getNumCpus());
                    System.out.println("\t\t # diskMb: " + taskConfig.getDiskMb());
                    System.out.println("\t\t # ramMb: " + taskConfig.getRamMb());
                    System.out.println("\t\t # priority: " + taskConfig.getPriority());
                    System.out.println("\t >> Executor Config <<");
                    System.out.println("\t\t # name: " + exeConfig.getName());
                    System.out.println("\t\t # data: " + exeConfig.getData());
                }

            }
        } catch (TException e) {
            logger.error("Error while executing getJobSummary", e);
        }
    }*/
    
    
    public static List<JobResultsBean> getJobDetailsList(List<String> jobNames) throws Exception {
        List<JobResultsBean> jobResultsBeanList = new ArrayList<>();
        for (String jobName : jobNames) {
            JobDetailsResponseBean jobDetailsResponseBean = getJobDetails(jobName);
            ScheduledTask scheduledTask = jobDetailsResponseBean.getTasks().get(0);
            List<URI> urlList = new ArrayList<>();
            urlList.add(new URI(scheduledTask.getAssignedTask().getSlaveHost() + scheduledTask.getAssignedTask().getTaskId()));
            JobResultsBean jobResultsBean = new JobResultsBean(jobName, scheduledTask.getStatus(), urlList);
            jobResultsBeanList.add(jobResultsBean);
        }
        return jobResultsBeanList;
    }

    public static JobDetailsResponseBean getJobDetails(String jobName) throws Exception {
        
    	System.out.println("jobname is"+jobName);
    	JobKeyBean jobKey = new JobKeyBean("devel", "team-npcomplete", "bash_wrf-"+jobName);

        JobDetailsResponseBean responseBean = (JobDetailsResponseBean) AuroraThriftClient.getAuroraThriftClient(Constants.AURORA_SCHEDULER_PROP_FILE).getJobDetails(jobKey);
        //System.out.println(responseBean.toString());
        return responseBean;
        
    }

    public static ResponseBean createJob(String jobName) throws Exception {
    	
    	System.out.println("Creat job module entered");
    	System.out.println("jobname is"+jobName);
    	JobKeyBean jobKey = new JobKeyBean("devel", "team-npcomplete", "bash_wrf-"+jobName);
        IdentityBean owner = new IdentityBean("team-npcomplete");
        
        System.out.println("Job and owner created");
        
        ProcessBean proc1 = new ProcessBean("process_1", "docker run -i --volumes-from wpsgeog --volumes-from wrfinputsandy -v ~/wrfoutput:/wrfoutput --name " + jobName + "_pc1 bigwxwrf/ncar-wrf /wrf/run-wrf", false);
        ProcessBean proc2 = new ProcessBean("process_2", "docker run -i --rm=true -v ~/wrfoutput:/wrfoutput --name " + jobName + "_pc2 bigwxwrf/ncar-ncl", false);
        ProcessBean proc0 = new ProcessBean("process_0", "docker rm -f " + jobName + "_pc1; docker rm -f " + jobName + "_pc2;echo 'remove containers'", false);
        
        
        System.out.println("processes init");
        Set<ProcessBean> processes = new LinkedHashSet<>();
        
        
        processes.add(proc0);
        processes.add(proc1);
        processes.add(proc2);
        
        System.out.println("processes added");
        
        ResourceBean resources = new ResourceBean(0.2, 200, 200);

        TaskConfigBean taskConfig = new TaskConfigBean("run_forecast_task-npcomplete", processes, resources);
        JobConfigBean jobConfig = new JobConfigBean(jobKey, owner, taskConfig, "example");
        
        System.out.println("config beans done");
        
        String executorConfigJson = AuroraThriftClientUtil.getExecutorConfigJson(jobConfig);
        System.out.println(executorConfigJson);

        AuroraThriftClient client = AuroraThriftClient.getAuroraThriftClient(Constants.AURORA_SCHEDULER_PROP_FILE);
        ResponseBean response = client.createJob(jobConfig);
        System.out.println("END");
        return client.createJob(jobConfig);
        
    
}
}
