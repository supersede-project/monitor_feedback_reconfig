package eu.supersede.monitor.reconfiguration.executor.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import eu.supersede.monitor.reconfiguration.executor.IMonitorReconfigExecutor;
import eu.supersede.monitor.reconfiguration.executor.MonitorReconfigExecutor;

public class MonitorReconfigExecutorTest {

	@Before
	public void setUp() {
		
	}
	
	@Test
	public void updateMonitorConfig() {
		try {
			InputStream stream = this.getClass().getResourceAsStream("update_monitor.json");
			String jsonString = IOUtils.toString(stream);
			JsonObject jsonObject = (new JsonParser()).parse(jsonString).getAsJsonObject();
			IMonitorReconfigExecutor executor = new MonitorReconfigExecutor();
			executor.updateMonitorConfiguration(jsonObject, "SocialNetworksMonitor", "TwitterAPI", "1");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
}
