package test.java;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;

import org.glassfish.jersey.client.ClientConfig;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class StormClusteringTest {
	
	private ClientConfig clientConfig;
	private Client client;
	private WebTarget target;
	private String responsefrom;
	private String result;
	private String dummy;
	private String url1;
	private String KML;
	private String KMLurl;

	@Before
	public void returnRequiredObjects() {

		result = "Generated in StormDetection.java";
		dummy = "";
		url1 = "https://noaa-nexrad-level2.s3.amazonaws.com/1996/06/06/hello/hello19960606_001958.gz";

		clientConfig = new ClientConfig();
		client = ClientBuilder.newClient(clientConfig);
		target = client.target("http://ec2-35-161-48-143.us-west-2.compute.amazonaws.com:8888/SG_MICROSERVICE_STROMCLUSTERING/gateway/StormClustering")
				.path("send");
		KML = new String("<kml xmlns=\"http://www.opengis.net/kml/2.2\">\n" + "  <Placemark>\n"
				+ "    <name>Simple placemark</name>\n"
				+ "    <description>Attached to the ground. Intelligently places itself \n"
				+ "       at the height of the underlying terrain.</description>\n" + "    <Point>\n"
				+ "      <coordinates>-122.0822035425683,37.42228990140251,0</coordinates>\n" + "    </Point>\n"
				+ "  </Placemark>\n" + "</kml>");

		KMLurl = "<KMLResponseFromStormDetector>" + "<tags>" + dummy + "</tags>" + "<newUrl>" + url1 + "</newUrl>"
				+ "<dummyKml>" + KML + "</dummyKml>" + "<filename>" + result + "</filename>"
				+ "</KMLResponseFromStormDetector>";
		
		
		

	}

	@Test
	public void testGenerateKML() {

		responsefrom = target.request().post(Entity.entity(KMLurl, "application/xml"), String.class);
		Assert.assertEquals(KMLurl, responsefrom);
	}
	
	
}
