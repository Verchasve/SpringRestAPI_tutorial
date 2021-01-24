package com.example.demo.controller;

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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Book_Table;
import com.example.demo.model.Customer;
import com.example.demo.model.CustomerBook;
import com.example.demo.service.TableService;



@RestController
@CrossOrigin
@RequestMapping("/panetworks")
public class Controller {
	
	
	@Autowired
	private TableService tablesrvice;
	
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);
    
    @GetMapping("/getAllBooks")
    @ResponseStatus(value =  HttpStatus.OK)
    public List<Book_Table> findAllBooks() {
        var data = (List<Book_Table>) tablesrvice.findAllBooks();
        logger.info("Value " +data);
        return data;
    }
    
    
    
    @GetMapping("/getAllCustomers")
    @ResponseStatus(value =  HttpStatus.OK)
    public List<Customer> findAllCustomer() {
        var data = (List<Customer>) tablesrvice.findAllCustomer();
        logger.info("Value " +data);
        return data;
    }
    
    @PostMapping("/getCustomerByBookId")
    @ResponseStatus(value =  HttpStatus.OK)
    public List<String> findCutomerNameByBooKId(
    		@RequestParam
    		Integer bookId ) {
        var data = (List<String>) tablesrvice.findCustomerNameByBookId(bookId);
        logger.info("Value " +data);
        return data;
    }
    
    
    @PostMapping("/getBookNameByCustomerId")
    @ResponseStatus(value =  HttpStatus.OK)
    public List<String> findBookNameByCustomerId(
    		@RequestParam
    		Integer customerId ) {
        var data = (List<String>) tablesrvice.findBookNameByCustomerID(customerId);
        
        return data;
    
    }
    
    
    @PostMapping("/addCustomer")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> AddNewustomer(
    	@RequestBody Customer insertdata) 
    {
    	
    	logger.info("va " + insertdata.getCustomer_id() + " | " + insertdata.getCustomer_name());
    	
    	if (tablesrvice.AddNewCustomer(insertdata))
    	{
	        return ResponseEntity.ok("New Customer is added !!!");
    	}
    	else 
    	
    	return ResponseEntity.ok("Error adding the Customer !!!");
    }
    
    
    @PostMapping("/addBook")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> AddNewBook(
    	@RequestBody Book_Table insertdata) {
    	
    	logger.info("va " + insertdata.getBook_id() + " | " + insertdata.getBook_name());
    	
    	if (tablesrvice.AddNewBook(insertdata))
    	{
	        return ResponseEntity.ok("New Book is added !!!");
    	}
    	else return ResponseEntity.ok("Error adding the Book !!!");
    
    }
    
    
    @PostMapping("/addBookToCustomer")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> AddNewBook(
    	@RequestBody CustomerBook insertdata) {
    	
    	logger.info("va " + insertdata.getBook_id() + " | " + insertdata.getCustomer_id());
    	
    	if (tablesrvice.AddBookToCustomer(insertdata))
    	{
	        return ResponseEntity.ok("New Book is added to Customer!!!");
    	}
    	else return ResponseEntity.ok("Error adding the Book  to Customer !!!");
    }
    
    
    @DeleteMapping("/deleteCustomerBook")
    @ResponseStatus(value =  HttpStatus.OK)
    public ResponseEntity<?> DeleteCustomerBook(
    	@RequestParam Integer book_id,
    	@RequestParam Integer customer_id
    	) {
    	if (tablesrvice.DeleteCustomerBook(book_id, customer_id))
    	{
	        return ResponseEntity.ok("Record is deleted !!!");
    	}
    	
    	else return ResponseEntity.ok("Error deleting the record!!!");
    
    }

}
