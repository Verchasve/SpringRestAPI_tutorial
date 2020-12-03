/**
 * 
 */
package com.exampl.ledger.utils;

/**
   Nov 18, 2020
 * @author DGS1Q0
 *
 */
public class Queries {
	
	public final static  String UNKNOWN_MAIL_TRAILER_QUERY = "select distinct \r\n" + 
			"		       trip_summary_t.route_trip_id,\r\n" + 
			"		       trip_summary_t.route_trip_leg_id,\r\n" + 
			"		       leg_origin_facility_t.locale_name as leg_origin_facility,\r\n" + 
			"		       leg_dest_facility_t.locale_name as leg_dest_facility,        \r\n" + 
			"		       case when cn51_time > orbcom_time \r\n" + 
			"					     then case when cn51_time > calamp_time \r\n" + 
			"						           then cn51_time \r\n" + 
			"								   else calamp_time \r\n" + 
			"								   end\r\n" + 
			"		            else case when orbcom_time > calamp_time \r\n" + 
			"						           then calamp_time \r\n" + 
			"								   else orbcom_time \r\n" + 
			"								   end \r\n" + 
			"		            end as most_recent_time,\r\n" + 
			"		       case when cn51_time > orbcom_time \r\n" + 
			"		            then case when cn51_time > calamp_time \r\n" + 
			"		                      then decode(cn51_latitude||','||cn51_longitude,',',null,cn51_latitude||','||cn51_longitude)\r\n" + 
			"		                      else decode(calamp_latitude||','||calamp_longitude,',',null,calamp_latitude||','||calamp_longitude)\r\n" + 
			"		                      end\r\n" + 
			"		            else case when orbcom_time > calamp_time \r\n" + 
			"		                      then decode(calamp_latitude||','||calamp_longitude,',',null,calamp_latitude||','||calamp_longitude)\r\n" + 
			"		                      else decode(orbcom_latitude||','||orbcom_longitude,',',null,orbcom_latitude||','||orbcom_longitude)\r\n" + 
			"		                      end \r\n" + 
			"		            end as most_recent_coordinates, \r\n" + 
			"			case when orbcom_gps_id is null and calamp_gps_id is null and cn51_time is null then 0 else 1 end as associated \r\n" + 
			"		  from ata_adm.trip_summary_t \r\n" + 
			"			left join ata_adm.facility_t leg_origin_facility_t on leg_origin_facility_t.fac_nass_code = trip_summary_t.leg_origin_site_id   \r\n" + 
			"		  left join ata_adm.facility_t leg_dest_facility_t on leg_dest_facility_t.fac_nass_code = trip_summary_t.leg_dest_site_id ";

}
