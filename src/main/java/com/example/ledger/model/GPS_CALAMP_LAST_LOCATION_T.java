/**
 * 
 */
package com.example.ledger.model;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
   Nov 27, 2020
 * @author DGS1Q0
 *
 */
@Entity
@Table(name = "GPS_CALAMP_LAST_LOCATION_T" , schema ="ATA_ADM")
@Data
public class GPS_CALAMP_LAST_LOCATION_T implements java.io.Serializable {
	
	/**
	 * 
	 */
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long ID;
	
	private static final long serialVersionUID = 1L;
	
	public java.sql.Date WORK_DATE;
	public java.sql.Date LOCAL_DATE;
	public String GPS_ID;
	public BigDecimal LATITUDE;
	public BigDecimal LONGITUDE;
	public String STREET_ADDRESS;
	public String BATTERY_VOLTAGE;
	public String CHARGING;
	public String GEO_AREA_ID;
	public String GEO_DISTRICT_ID;
	public String GEO_ZIP_CODE;
	public String GEO_NASS_CODE;
	public java.sql.Date PREV_WORK_DATE;
	public java.sql.Date PREV_LOCAL_DATE;
	public BigDecimal PREV_LATITUDE;
	public BigDecimal PREV_LONGITUDE;
	public BigDecimal SPEED;
	public BigDecimal DISTANCE;
	public java.sql.Date STATIONARY_START;
	public java.sql.Date STATIONARY_END;
	public BigDecimal STATIONARY_COUNT;
	public BigDecimal SECONDS_STATIONARY;
	public BigDecimal SECONDS_SINCE_LAST_TRANS;
	public BigDecimal DISTANCE_TRAVELED;
	public BigDecimal ACTIVE_EVENT;
	public String GEO_REGION_ID;
	public String GEO_DIVISION_ID;
 

}
