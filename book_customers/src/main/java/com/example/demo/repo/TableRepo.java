package com.example.demo.repo;

import java.util.List;
import com.example.demo.model.Book_Table;
import com.example.demo.model.Customer;
import com.example.demo.model.CustomerBook;

public interface TableRepo {
	
	List<Book_Table> findAllBooks();
	
	List<Customer> findAllCustomer();
	 
	List<String> findCustomerNameByBookId(int bookd_id);
	
	List<String> findBookNameByCustomerID(int customerid);
	
	boolean AddNewCustomer(Customer data);
	
	boolean AddNewBook(Book_Table data);
	
	boolean AddBookToCustomer(CustomerBook data);
	
	boolean DeleteCustomerBook(int book_id , int customer_id);
	

}
