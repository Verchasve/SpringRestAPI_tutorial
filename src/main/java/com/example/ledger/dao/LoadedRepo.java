/**
 * 
 */
package com.example.ledger.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.exampl.ledger.utils.Queries;
import com.example.ledger.calamp.GPS_CALAMP_DATA_T;
import com.example.ledger.model.LoadedMails;
import com.example.ledger.model.TRIP_SUMMARY_T;

/**
   Nov 18, 2020
 * @author DGS1Q0
 *
 *
 */ 

public interface LoadedRepo extends JpaRepository<LoadedMails , Long> 
{
 
	//@Query( Queries.UNKNOWN_MAIL_TRAILER_QUERY)
	//List<TRIP_SUMMARY_T> getAllUnknwonTrailerS(@Param("work_date") String work_date);
	 
}
