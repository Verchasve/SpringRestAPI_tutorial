/**
 * Oct 24, 2020
   created by Abhishek Singh
 */
package com.example.ledger.controller;

 
import java.util.List; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController; 
import com.example.ledger.calamp.GPS_CALAMP_DATA_T;
import com.example.ledger.dao.CalampRepository;
import com.example.ledger.dao.LoadedRepo;
import com.example.ledger.model.LedgerTable;
import com.example.ledger.model.LoadedMails;
import com.example.ledger.model.TRIP_SUMMARY_T;
import com.example.ledger.service.LedgerService; 
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.annotations.ApiIgnore;
import io.swagger.annotations.ApiResponse;
 
 


@RestController
@CrossOrigin
@RequestMapping("/ledger")
@Api(value = "ledgerproject " , description = "Demo for Rest controller methods " )
public class DeviceController {
	
	
 	    
		@Autowired 
	    private LedgerService ledgerService;
		
		@Autowired 
	    private CalampRepository calampService; 
		
		// @Autowired 
	    // private LoadedRepo loadService; 
		
		private static final String uri_getAll = "/getAll"; 
		private static final String uri_getAllNoSoft = "/getAllNoSoft";
		private static final String uri_getSum = "/getSum";
		private static final String uri_update= "/update";
		private static final String uri_insert = "/insert"; 
	    private static final Logger logger = LoggerFactory.getLogger(DeviceController.class);
	     
 
	/*  Setting up all GET endpoint to access data from the Database 
	 *  Here are the end-points creating for get request;
	 * 
	 * "/getAll"
	 * "/getByID"
	 * "/getAllNoSoft"
	 * "/getSum"
	 * 
	 * 
	 * */
	    
	    
	    @ApiOperation(value = "List of getting calamp devices" , response = GPS_CALAMP_DATA_T.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "Successfully retrieved Calamp list"),
	            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	    })
	    @GetMapping("/getCalamp")
	    @ResponseStatus(value =  HttpStatus.OK)
	    public   List<GPS_CALAMP_DATA_T>  findCalamp(@RequestParam String deviceID) { 
	        var ledgerVal =   calampService.findByID(deviceID);
	        logger.info("result "  + ledgerVal );
	        return ledgerVal; 
	    }
	    
	    
//	    @GetMapping("/getLoad")
//	    @ResponseStatus(value =  HttpStatus.OK)
//	    public  List<TRIP_SUMMARY_T>  findLoad(@RequestParam String work_date) { 
//	        var loadVal =   loadService.getAllUnknwonTrailerS(work_date);
//	        logger.info("result "  + loadVal );
//	        return loadVal; 
//	    }
	    
	    @GetMapping(uri_getAll)
	    @ResponseStatus(value =  HttpStatus.OK)
	    public List<LedgerTable> findAll() { 
	        var ledgerVal = (List<LedgerTable>) ledgerService.findAll();
	        return ledgerVal; 
	    }
	    
	    private static final String uri_getByID = "/getByID";
	    
	    @GetMapping(uri_getByID)
	    @ResponseStatus(value =  HttpStatus.OK)
	    public List<LedgerTable> findByID(
	    		@RequestParam long id ) 
	    {
	        var ledgerVal = (List<LedgerTable>) ledgerService.findById(id);
	        return ledgerVal;
	    }
	
	    @GetMapping(uri_getAllNoSoft)
	    @ResponseStatus(value =  HttpStatus.OK)
	    public List<LedgerTable> findAllWithNoSoftDelete() {
	        var ledgerVal = (List<LedgerTable>) ledgerService.findTransactionNotSoftDeleted();
	        return ledgerVal;
	    }
	    
	    @GetMapping(uri_getSum)
	    @ResponseStatus(value =  HttpStatus.OK)
	    public double findSumWithNoSoftDelete() {
	   
	        var ledgerVal =  ledgerService.transSumNotSoftDeleted();
	        return ledgerVal;
	    }
	    
	    
		/*  Setting up all PUT endpoint "/update" to update data record 
		 *  into the  Database  */	    
	    
	    @PutMapping(uri_update)
	    @ResponseStatus(value =  HttpStatus.OK)
	    public ResponseEntity<?> UpdateTrasaction(
	    	@RequestBody LedgerTable updatedata,
	    	@RequestParam long id) {
	    	if (ledgerService.updatetransaction(id, updatedata))
	    	{
		        return ResponseEntity.ok("Row is updated with new values !!!");
	    	}
	    	
	    	else return ResponseEntity.ok("No record found with id = "+id);
	    }
	    
	    
		/*  Setting up all POST endpoint "/insert" to insert data record into the  Database   */
	    
	    @PostMapping(uri_insert)
	    @ResponseStatus(HttpStatus.CREATED)
	    public ResponseEntity<?> InsertTransaction(
	    	@RequestBody LedgerTable updatedata) {
	    	if (ledgerService.insertTransaction( updatedata))
	    	{
		        return ResponseEntity.ok("New record is added !!!");
	    	}
	    	else return ResponseEntity.ok("Error adding the record !!!");
	    }
	    
	    
		/*  Setting up all DELETE endpoint "/delete" to update data record 
		 * 	into the  Database */
	    @ApiIgnore
	    @DeleteMapping("/delete")
	    @ResponseStatus(value =  HttpStatus.OK)
	    public ResponseEntity<?> DeleteTransaction(
	    	@RequestParam long id) {
	    	if (ledgerService.updateSoftDelete(id))
	    	{
		        return ResponseEntity.ok("Record is soft deleted !!!");
	    	}
	    	
	    	else return ResponseEntity.ok("Error deleting the record!!!");
	    
	    }
}

