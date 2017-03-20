package org.softleader.statistics.service.ch04;

import org.apache.commons.math3.stat.Frequency;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.descriptive.rank.Median;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DescriptiveStatisticsService {

	
	/**
	 * DescriptiveStatistics	min, max, mean, geometric mean, n, sum, sum of squares, standard deviation, variance, percentiles, skewness, kurtosis, median
	 * SummaryStatistics	min, max, mean, geometric mean, n, sum, sum of squares, standard deviation, variance
	 * @param data
	 * @return
	 */
	
	public DescriptiveStatistics getDescriptiveStatistics(double[] data) {
		DescriptiveStatistics stats = new DescriptiveStatistics();
		Frequency freq = new Frequency();
		for (int i = 0; i < data.length; i++) {
			
			stats.addValue(data[i]);
			freq.addValue(data[i]);
			
		}
		
		// 查看平均值
		log.info("Mean(x bar) value = {}", stats.getMean());
		log.info("Range value = {}", (stats.getMax() - stats.getMin()));
		log.info("Variance(s^2) value = {}", stats.getVariance());
		log.info("Standard deviation(s) value = {}", stats.getStandardDeviation() );
		log.info("Geometric Mean value = {}", stats.getGeometricMean());
		log.info("Median value = {}", stats.getPercentile(50));
		log.info("Median value = {}", stats.apply(new Median()));

		log.info("Interquartile Range value = {} (L75) - {}(L25) = {}", stats.getPercentile(75), stats.getPercentile(25), stats.getPercentile(75) - stats.getPercentile(25));

		log.info("Coefficient of Variation(cv) value = {}", stats.getStandardDeviation()/stats.getMean());
		
		return stats;
	}

}
