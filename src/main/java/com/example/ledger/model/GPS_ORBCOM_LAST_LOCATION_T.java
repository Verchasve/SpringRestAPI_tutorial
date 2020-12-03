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
@Table(name = "GPS_ORBCOM_LAST_LOCATION_T" , schema ="ATA_ADM")
@Data
public class GPS_ORBCOM_LAST_LOCATION_T implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long ID;
	
	public java.sql.Date WORK_DATE;
	public String AREA_ID;
	public String DISTRICT_ID;
	public String NASS_CODE;
	public String EAM_ASSET_NO;
	public String VIN;
	public String LEASED_FLAG;
	public String ASSET_CATEGORY;
	public String SUPPLIER_TRAILER_NUMBER;
	public String SURFACE_VISIBILITY_BARCODE;
	public String GPS_ID;
	public java.sql.Date LAST_AUDIT_DATE;
	public String COR_NAME;
	public String COR_EMAIL;
	public String COR_ACE_ID;
	public String COR_TELEPHONE;
	public String SUPPLIER_NAME;
	public java.sql.Date DEVICE_TIME;
	public BigDecimal LATITUDE;
	public BigDecimal LONGITUDE;
	public java.sql.Date PREV_WORK_DATE;
	public java.sql.Date PREV_DEVICE_TIME;
	public BigDecimal PREV_LATITUDE;
	public BigDecimal PREV_LONGITUDE;
	public String EVENT_TYPE;
	public BigDecimal BATTERY_VOLTAGE;
	public BigDecimal SPEED;
	public BigDecimal DISTANCE;
	public String DIRECTION;
	public String GEO_AREA_ID;
	public String GEO_DISTRICT_ID;
	public String GEO_ZIP_CODE;
	public String GEO_NASS_CODE;
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
