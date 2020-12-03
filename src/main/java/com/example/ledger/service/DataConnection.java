/**
 * 
 */
package com.example.ledger.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

import oracle.jdbc.OracleConnection;

/**
   Oct 30, 2020
 * @author DGS1Q0
 *
 */
@Configuration
public class DataConnection { 
	
	@Value("${spring.datasource.oracle.network-admin-path}")
	private String walletLocation;
	@Value("${spring.datasource.url}")
	private String jdbcUrl;
	@Value("${spring.datasource.driver-class-name}")
	private String jdbcDriver;
	
	@Bean
	public HikariDataSource dataSource() {
		HikariDataSource hikaridatasource = null;
		String OracleTnsAdminProperty = "oracle.net.tns_admin";
		String DefaultDataSourceClass = "oracle.jdbc.pool.OracleDataSource";
		try {
			com.zaxxer.hikari.HikariConfig HikariConfig = new com.zaxxer.hikari.HikariConfig();
			System.setProperty(OracleTnsAdminProperty, walletLocation);
			HikariConfig.setDriverClassName(jdbcDriver);
			HikariConfig.setJdbcUrl(jdbcUrl);
			HikariConfig.getDataSourceProperties().setProperty(OracleTnsAdminProperty, walletLocation);
			HikariConfig.getDataSourceProperties().setProperty(OracleConnection.CONNECTION_PROPERTY_WALLET_LOCATION,walletLocation);
			HikariConfig.setPoolName(DefaultDataSourceClass);
			HikariConfig.addDataSourceProperty("cachePrepStmts", "true");
			HikariConfig.addDataSourceProperty("prepStmtCacheSize", "250");
			HikariConfig.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
			HikariConfig.setMaximumPoolSize(20);
			HikariConfig.setLeakDetectionThreshold(10);
			HikariConfig.setInitializationFailTimeout(3000);
			hikaridatasource = new HikariDataSource(HikariConfig);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hikaridatasource;
	}

}
