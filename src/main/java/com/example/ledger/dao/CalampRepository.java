/**
 * 
 */
package com.example.ledger.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param; 
import com.example.ledger.calamp.GPS_CALAMP_DATA_T;

/**
   Oct 30, 2020
 * @author DGS1Q0
 *
 */
public interface CalampRepository extends JpaRepository<GPS_CALAMP_DATA_T , Long>{

	 //List<CalampDeviceEntity> findByLastName(String workDate); 
 
	 // Named Parameters
	 @Query("SELECT WORK_DATE , GPS_ID FROM  GPS_CALAMP_DATA_T  WHERE  GPS_ID = :deviceID")
	 List<GPS_CALAMP_DATA_T> findByID(@Param("deviceID") String deviceID);
	  
}
