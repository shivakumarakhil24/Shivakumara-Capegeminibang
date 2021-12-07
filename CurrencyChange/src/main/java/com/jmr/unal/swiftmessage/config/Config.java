package com.jmr.unal.swiftmessage.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import com.jmr.unal.swiftmessage.bean.SourceDestination;
import com.jmr.unal.swiftmessage.service.CcyChangeImpl;

@Configuration
public class Config {

	Properties prop = new Properties();
	CcyChangeImpl ccyChangeImpl = new CcyChangeImpl();

	@Scheduled(fixedDelay = 5000)
	public void processIncoming() {

		try {
			
			prop.load(new FileInputStream("src/main/resources/properties/Path.properties"));

			//SourceDestination input = new SourceDestination(prop.getProperty("insrc"), prop.getProperty("indest"));
			SourceDestination input = new SourceDestination("C:/Users/Admin/Desktop/swift-insrc","C:/Users/Admin/Desktop/Swift-indest/");

			ccyChangeImpl.fileProcess(input);
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	@Scheduled(fixedDelay = 5000)
	public void processOutgoing() {
		try {

			prop.load(new FileInputStream("src/main/resources/properties/Path.properties"));
		//	SourceDestination output = new SourceDestination(prop.getProperty("outsrc"), prop.getProperty("outdest"));
			SourceDestination output = new SourceDestination("C:/Users/Admin/Desktop/swift-outsrc","C:/Users/Admin/Desktop/swift-outdest/");
			ccyChangeImpl.fileProcess(output);

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
