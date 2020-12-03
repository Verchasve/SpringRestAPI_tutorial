package com.example.ledger.model;

import java.io.Serializable;
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


@Entity
@Table(schema = "ATA_ADM")
@Data
public class LoadedMails  implements Serializable{
	
	
	/**
	 * 
	 */
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long ID;
	
	private static final long serialVersionUID = 1L;
	private Long route_trip_id; 
	private Long route_trip_leg_id;
//	private String route_id;
//	private String trip_id;
//	private String leg_dest_site_id;
//	private String leg_dest_grouping_id;
//	private String geo_inbound_dtm;
//	private Double geo_inbound_latitude;
//	private Double geo_inbound_longitude;
//	private String orbcom_gps_id;
//	private String orbcom_time;
//	private Double orbcom_latitude;
//	private Double orbcom_longitude;
//	private String geo_orb_grouping_id;
//	private String orb_stationary_start;
//	private Double orb_latitude;
//	private Double orb_longitude; 
//	private String trailerbarcode;
//	private Integer container_view;
//	private String scheduled_dept_dtm;
//	private String actual_dept_dtm;
//	private String scheduled_arr_dtm;
//	private String est_arr_dtm;
	private String leg_origin_facility;
	private String leg_dest_facility;
	private Date most_recent_time;
	private String most_recent_coordinates;
	
	
//
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "FAC_NASS_CODE", nullable = false)  
//	@Fetch(FetchMode.JOIN)
//	private FACILITY_T facility_t;
	

	

}
