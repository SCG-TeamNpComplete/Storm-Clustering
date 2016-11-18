package com.milestone1.Dao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryNTimes;
import org.apache.curator.x.discovery.ServiceDiscoveryBuilder;
import org.apache.curator.x.discovery.ServiceInstance;
import org.apache.curator.x.discovery.UriSpec;

@Path("/StormClustering")
public class StormClusterInit extends HttpServlet {

	@Override
	public void init() throws ServletException {

		// ZookeeperServiceRegistry registry=new ZookeeperServiceRegistry();
		String endpointURI = "http://localhost:8080/SG_MICROSERVICE_STROMCLUSTERING/gateway/StormClustering/get";
		// private final String endpointURI = "http://" + serverName + ":" +
		// serverPort + "/catalog/resources/catalog";
		// private final String endpointURI = "http://" +
		// WildFlyUtil.getHostName() + ":" + WildFlyUtil.getHostPort() +
		// "/catalog/resources/catalog";
		String serviceName = "stormCluster";

		int port = 8080;

		
		  CuratorFramework curatorFramework = CuratorFrameworkFactory.newClient("localhost:2181", new RetryNTimes(5, 1000));
		  curatorFramework.start();

		/*CuratorFramework curatorFramework = CuratorFrameworkFactory.newClient("149.160.144.17:2181",
				new RetryNTimes(5, 1000));
		curatorFramework.start();*/
		try {
			ServiceInstance serviceInstance = ServiceInstance.builder().uriSpec(new UriSpec(endpointURI)).address("localhost").port(port).name(serviceName).build();
			ServiceDiscoveryBuilder.builder(Void.class).basePath("load-balancing-example").client(curatorFramework).thisInstance(serviceInstance).build().start();
			// return "done SC instance";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@GET
	@Path("/init")
	@Produces("text/plain")
	public String initZookeeper() throws IOException {

		// ZookeeperServiceRegistry registry=new ZookeeperServiceRegistry();
		String endpointURI = "http://localhost:8080/SG_MICROSERVICE_STROMCLUSTERING/gateway/StormClustering/get";
		// private final String endpointURI = "http://" + serverName + ":" +
		// serverPort + "/catalog/resources/catalog";
		// private final String endpointURI = "http://" +
		// WildFlyUtil.getHostName() + ":" + WildFlyUtil.getHostPort() +
		// "/catalog/resources/catalog";
		String serviceName = "stormCluster";

		int port = 8080;

		/*
		 * CuratorFramework curatorFramework =
		 * CuratorFrameworkFactory.newClient("localhost:2181", new
		 * RetryNTimes(5, 1000));
		 */

		CuratorFramework curatorFramework = CuratorFrameworkFactory.newClient("10.0.0.62:2181",
				new RetryNTimes(5, 1000));
		curatorFramework.start();
		try {

			ServiceInstance serviceInstance = ServiceInstance.builder().uriSpec(new UriSpec(endpointURI))
					.address("localhost").port(port).name(serviceName).build();
			ServiceDiscoveryBuilder.builder(Void.class).basePath("load-balancing-example").client(curatorFramework)
					.thisInstance(serviceInstance).build().start();
			return "done SC instance";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// registry.unregisterService(serviceName, endpointURI);

		// registry.discoverServiceURI(serviceName);
		return "udeeeeesssss";
	}
}
