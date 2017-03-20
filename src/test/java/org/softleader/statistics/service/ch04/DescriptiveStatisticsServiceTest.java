package org.softleader.statistics.service.ch04;

import org.junit.Test;
import org.softleader.statistics.AbstractTest;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DescriptiveStatisticsServiceTest extends AbstractTest {

	@Autowired
	private DescriptiveStatisticsService descriptiveStatisticsServices;

	@Test
	public void testGetDescriptiveStatistics() {

		double[] data = new double[] { 0, 7, 12, 5, 33, 14, 8, 0, 9, 22 };
		log.debug("-------------------------------------------------------------------------------");
		log.debug("{}", data);
		descriptiveStatisticsServices.getDescriptiveStatistics(data);

		// 4-2a set1
		data = new double[] { 4, 4, 4, 4, 4, 50 };
		log.debug("-------------------------------------------------------------------------------");
		log.debug("{}", data);
		descriptiveStatisticsServices.getDescriptiveStatistics(data);
		// 4-2a set2
		data = new double[] { 4, 8, 15, 24, 39, 50 };
		log.debug("-------------------------------------------------------------------------------");
		log.debug("{}", data);
		descriptiveStatisticsServices.getDescriptiveStatistics(data);
		
		// 4-2b 
		data = new double[] { 8, 4, 9, 11, 3 };
		log.debug("-------------------------------------------------------------------------------");
		log.debug("{}", data);
		descriptiveStatisticsServices.getDescriptiveStatistics(data);
		
		// example 4.7
		data = new double[] { 17, 15, 23, 7, 9, 13 };
		log.debug("-------------------------------------------------------------------------------");
		log.debug("{}", data);
		descriptiveStatisticsServices.getDescriptiveStatistics(data);
		
		
		// example 4.11
		data = new double[] { 0, 0, 5, 7, 8, 9, 12, 14, 22, 33 };
		log.debug("-------------------------------------------------------------------------------");
		log.debug("{}", data);
		descriptiveStatisticsServices.getDescriptiveStatistics(data);

	}

}
