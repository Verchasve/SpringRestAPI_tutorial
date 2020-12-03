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
@Table(name = "FACILITY_T" , schema ="ATA_ADM")
@Data
public class FACILITY_T implements java.io.Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long ID;
	
	public String FACILITY_ID;
	public String AREA_ID;
	public String AREA_NAME;
	public String DISTRICT_ID;
	public String DISTRICT_NAME;
	public String LOCALE_KEY;
	public String LOCALE_NAME;
	public String FACILITY_TYPE;
	public String ADDRESS;
	public String CITY;
	public String STATE;
	public String ZIP_CODE;
	public String PLUS4_CODE;
	public String NASS_DN_CODE;
	public String FAC_AMS_STATUS;
	public BigDecimal DOCK_CANOPY_CLEARANCE_FT;
	public BigDecimal DOCK_CANOPY_CLEARANCE_IN;
	public BigDecimal DOCK_DOOR_HEIGHT_FT;
	public BigDecimal DOCK_DOOR_HEIGHT_IN;
	public BigDecimal DOCK_DOOR_WIDTH;
	public BigDecimal DOCK_DEPTH_FT;
	public BigDecimal DOCK_DEPTH_IN;
	public BigDecimal DOCK_WIDTH_FT;
	public BigDecimal DOCK_WIDTH_IN;
	public BigDecimal DOC_OVERPASS_MAX_WT;
	public BigDecimal DOCK_OVERPASS_MIN_FT;
	public String DOCK_FORTY_FT_TRAILER_IND;
	public BigDecimal DOCK_TRUCK_MNVR_AREA_LGTH;
	public BigDecimal DOCK_TRUCK_MNVR_AREA_WIDTH;
	public BigDecimal DOCK_VEHICLE_MAX_LGTH;
	public String COLL_POSTAL_VEHICLE_TRANS_IND;
	public String FAC_DST_OBSERVED_IND;
	public String FACILITY_FINANCE_NBR;
	public String FAC_NASS_CODE;
	public String FAC_SCF_CODE;
	public String FAC_FACILITY_SUBTYPE;
	public String TIMEZONE;
	public String FAC_DDU_COLLOCATED_IND;
	public String LOC_TYPE;
	public BigDecimal LATITUDE;
	public BigDecimal LONGITUDE;
	public String FACILITY_STATUS;
	public String STATION_FINANCE_NBR;
	public BigDecimal GROUPING_LATITUDE;
	public BigDecimal GROUPING_LONGITUDE;
	public BigDecimal GROUPING_ID;
	public String REGION_ID;
	public String REGION_NAME;
	public String DIVISION_ID;
	public String DIVISION_NAME;
	
	 

}
