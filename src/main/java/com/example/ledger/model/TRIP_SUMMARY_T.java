/**
 * 
 */
package com.example.ledger.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Data;

/**
   Nov 27, 2020
 * @author DGS1Q0
 *
 */


@Entity
@Table(name ="TRIP_SUMMARY_T" , schema = "ATA_ADM")
@Data
public class TRIP_SUMMARY_T implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long ID;
	
	public BigDecimal DRIVE_TIME_FLAG;
	public java.sql.Date WORK_DATE;
	public BigDecimal ROUTE_TRIP_ID;
	public BigDecimal ROUTE_TRIP_LEG_ID;
	public String LEG_NUMBER;
	public String ROUTE_ID;
	public String TRIP_ID;
	public String TRIP_TYPE;
	public BigDecimal TOUR_ID;
	public String ORIGIN_SITE_ID;
	public String DEST_SITE_ID;
	public String LEG_ORIGIN_SITE_ID;
	public String LEG_DEST_SITE_ID;
	public String TRAILERBARCODE;
	public String VIN;
	public String EAM_ASSET_NO;
	public BigDecimal CONTAINER_ASSETS;
	public BigDecimal HANDLINGUNIT_ASSETS;
	public java.sql.Date SCHEDULED_DEPT_DTM;
	public java.sql.Date ACTUAL_DEPT_DTM;
	public java.sql.Date SCHEDULED_ARR_DTM;
	public java.sql.Date ACTUAL_ARR_DTM;
	public String USER_ID;
	public String ORBCOM_GPS_ID;
	public java.sql.Date ORBCOM_TIME;
	public BigDecimal ORBCOM_LATITUDE;
	public BigDecimal ORBCOM_LONGITUDE;
	public String CALAMP_GPS_ID;
	public java.sql.Date CALAMP_TIME;
	public BigDecimal CALAMP_LATITUDE;
	public BigDecimal CALAMP_LONGITUDE;
	public String SOURCE;
	public String DEVICEID;
	public java.sql.Date CN51_TIME;
	public BigDecimal CN51_LATITUDE;
	public BigDecimal CN51_LONGITUDE;
	public java.sql.Date EST_ARR_DTM;
	public java.sql.Date GEO_INBOUND_DTM;
	public BigDecimal GEO_INBOUND_LATITUDE;
	public BigDecimal GEO_INBOUND_LONGITUDE;
	public java.sql.Date GEO_OUTBOUND_DTM;
	public BigDecimal GEO_OUTBOUND_LATITUDE;
	public BigDecimal GEO_OUTBOUND_LONGITUDE;
	public String ORBCOM_GEO_AREA_ID;
	public String ORBCOM_GEO_DISTRICT_ID;
	public String ORBCOM_GEO_ZIP_CODE;
	public String ORBCOM_GEO_NASS_CODE;
	public String CALAMP_GEO_AREA_ID;
	public String CALAMP_GEO_DISTRICT_ID;
	public String CALAMP_GEO_ZIP_CODE;
	public String CALAMP_GEO_NASS_CODE;
	public String CN51_GEO_AREA_ID;
	public String CN51_GEO_DISTRICT_ID;
	public String CN51_GEO_ZIP_CODE;
	public String CN51_GEO_NASS_CODE;
	public java.sql.Date UNLOAD_EVENT;
	public String ORBCOM_GEO_REGION_ID;
	public String ORBCOM_GEO_DIVISION_ID;
	public String CALAMP_GEO_REGION_ID;
	public String CALAMP_GEO_DIVISION_ID;
	public String CN51_GEO_REGION_ID;
	public String CN51_GEO_DIVISION_ID;
	
	

	 
}
