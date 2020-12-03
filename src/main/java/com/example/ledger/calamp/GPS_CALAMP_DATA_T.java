package com.example.ledger.calamp;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
 

 

 @Entity
 @Table(name = "GPS_CALAMP_DATA_T" , schema = "ATA_ADM")
 @Data 
public class GPS_CALAMP_DATA_T implements Serializable{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long ID;
	
	@ApiModelProperty(notes = "Ping Data of device",  required =  true)
	@Column(name="WORK_DATE") 
	private java.time.LocalDateTime  WORK_DATE; 
	

	@Column(name="GPS_ID") 
	@ApiModelProperty(notes = "The image URL of the product") private String GPS_ID; 
	

}
