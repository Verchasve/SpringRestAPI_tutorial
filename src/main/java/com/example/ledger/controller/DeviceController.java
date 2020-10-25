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

import com.example.ledger.model.LedgerTable;
import com.example.ledger.service.LedgerService;


@RestController
@CrossOrigin
@RequestMapping("/ledger")

public class DeviceController {
	
	
 	    
		@Autowired 
	    private LedgerService ledgerService;
		
	    private static final Logger logger = LoggerFactory.getLogger(DeviceController.class);
	     

	    @GetMapping("/getAll")
	    @ResponseStatus(value =  HttpStatus.OK)
	    public List<LedgerTable> findAll() {
	        var ledgerVal = (List<LedgerTable>) ledgerService.findAll();
	        return ledgerVal;
	    }
	    
	    @GetMapping("/getByID")
	    @ResponseStatus(value =  HttpStatus.OK)
	    public List<LedgerTable> findByID(
	    		@RequestParam long id ) 
	    {
	        var ledgerVal = (List<LedgerTable>) ledgerService.findById(id);
	        return ledgerVal;
	    }
	
	    @GetMapping("/getAllNoSoft")
	    @ResponseStatus(value =  HttpStatus.OK)
	    public List<LedgerTable> findAllWithNoSoftDelete() {
	        var ledgerVal = (List<LedgerTable>) ledgerService.findTransactionNotSoftDeleted();
	        return ledgerVal;
	    }
	    
	    @GetMapping("/getSum")
	    @ResponseStatus(value =  HttpStatus.OK)
	    public double findSumWithNoSoftDelete() {
	        var ledgerVal =  ledgerService.transSumNotSoftDeleted();
	        return ledgerVal;
	    }
	    
	    @PutMapping("/update")
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
	    
	    
	    @PostMapping("/insert")
	    @ResponseStatus(HttpStatus.CREATED)
	    public ResponseEntity<?> InsertTransaction(
	    	@RequestBody LedgerTable updatedata) {
	    	if (ledgerService.insertTransaction( updatedata))
	    	{
		        return ResponseEntity.ok("New record is added !!!");
	    	}
	    	else return ResponseEntity.ok("Error adding the record !!!");
	    }
	    
	    
	    @DeleteMapping("/delete")
	    @ResponseStatus(value =  HttpStatus.OK)
	    public ResponseEntity<?> DeleteTransaction(
	    	@RequestParam long id) {
	    	if (ledgerService.updateSoftDelete(id))
	    	{
		        return ResponseEntity.ok("Record is deleted !!!");
	    	}
	    	
	    	else return ResponseEntity.ok("Error deleting the record!!!");
	    
	    }
}

