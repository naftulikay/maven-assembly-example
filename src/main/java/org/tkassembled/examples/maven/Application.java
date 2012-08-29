package org.tkassembled.examples.maven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Pretty simple application which really does nothing at all except demonstrate
 * that the Maven Assembly Plugin is awesome.
 * 
 * @author TK Kocheran
 */
public class Application {
	
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] arguments) {
		logger.info("Started incredibly useless and unhelpful example application!");
		logger.debug("Press Ctrl+C to exit.");
		
		try {
			while (true) { Thread.sleep(1000L); }
		} catch (InterruptedException e) {
			logger.info("Shutting down incredibly useless and unhelpful example application.");
		}
	}
}
