package com.example.demo.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import com.example.demo.model.Book_Table;
import com.example.demo.model.Customer;
import com.example.demo.model.CustomerBook;
import com.example.demo.repo.TableRepo;
 

@Service
public class TableService implements TableRepo{
	
	
	@Autowired
	private NamedParameterJdbcTemplate namedjdbctemplate;
	

	@Override
	public List<Book_Table> findAllBooks() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM SYS.BOOK_TABLE";
		 var val =  namedjdbctemplate.query(sql , new BookMapper());
		return val;
	}
	

	@Override
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		 String sql = "SELECT * FROM SYS.CUSTOMER";
		 var data =  namedjdbctemplate.query(sql , new CustomerMapper());
		return data;
	}

	@Override
	public List<String> findCustomerNameByBookId(int book_id) {
		// TODO Auto-generated method stub
		
		 String sql =  "select  \n"
		 		+ " distinct customer.customer_name\n"
		 		+ " from sys.book_table \n"
		 		+ "left join sys.customer_book on customer_book.book_id = sys.book_table.book_id\n"
		 		+ "left join sys.customer on customer.customer_id= sys.customer_book.customer_id\n"
		 		+ " where sys.book_table.book_id = :book_id";
		
		    MapSqlParameterSource parameters = new MapSqlParameterSource();
			parameters.addValue("book_id", book_id);
		   var val = namedjdbctemplate.queryForList(sql , parameters , String.class);
		  
		return  val;
	}
	
	


	@Override
	public List<String> findBookNameByCustomerID(int customerid) {
		// TODO Auto-generated method stub
		
		String sql = "select  \n"
				+ "distinct sys.book_table.book_name\n"
				+ "from sys.book_table  \n"
				+ "left join sys.customer_book on customer_book.book_id = sys.book_table.book_id\n"
				+ "left join sys.customer on customer.customer_id= sys.customer_book.customer_id\n"
				+ "where sys.customer.customer_id = :customerid";
		
		    MapSqlParameterSource parameters = new MapSqlParameterSource();
			parameters.addValue("customerid", customerid);
		   var val = namedjdbctemplate.queryForList(sql , parameters , String.class);
		   
		   return val;
	}
	
	
	
	@Override
	public boolean AddNewCustomer(Customer data) {
		// TODO Auto-generated method stub
		 MapSqlParameterSource parameters = new MapSqlParameterSource();
		 parameters.addValue("customer_id", data.getCustomer_id());
		 parameters.addValue("customer_name", data.getCustomer_name());
		int result = 0;
		String sql = "INSERT INTO SYS.CUSTOMER VALUE (:customer_id, :customer_name)";
		result = namedjdbctemplate.update(sql , parameters);
		if (result > 0 )
		{
			return true;
		}
		return false;
	}


	@Override
	public boolean AddNewBook(Book_Table data) {
		// TODO Auto-generated method stub
		int result = 0;
		 MapSqlParameterSource parameters = new MapSqlParameterSource();
		 
		 parameters.addValue("book_id", data.getBook_id());
		 parameters.addValue("book_name", data.getBook_name());
		 
		String sql = "INSERT INTO SYS.BOOK_TABLE VALUE (:book_id , :book_name)";
		result = namedjdbctemplate.update(sql , parameters);
		
		if (result > 0 )
		{
			return true;
		}
		return false;
	}


	@Override
	public boolean AddBookToCustomer(CustomerBook data) {
		// TODO Auto-generated method stub
		
		 int result = 0;
		 MapSqlParameterSource parameters = new MapSqlParameterSource();
		 
		 parameters.addValue("book_id", data.getBook_id());
		 parameters.addValue("customer_id", data.getCustomer_id());
		 
		String sql = "INSERT INTO SYS.CUSTOMER_BOOK VALUE (:customer_id , :book_id)";
		result = namedjdbctemplate.update(sql , parameters);
		
		if (result > 0 )
		{
			return true;
		}
		
		return false;
	}
	
	
	@Override
	public boolean DeleteCustomerBook(int book_id, int customer_id) {
		// TODO Auto-generated method stub
		
		 int result = 0;
		 MapSqlParameterSource parameters = new MapSqlParameterSource();
		 
		 parameters.addValue("book_id", book_id);
		 parameters.addValue("customer_id", customer_id);
		 
		String sql = "DELETE FROM SYS.CUSTOMER_BOOK WHERE CUSTOMER_ID = :customer_id AND BOOK_ID = :book_id";
		result = namedjdbctemplate.update(sql , parameters);
		
		if (result > 0 )
		{
			return true;
		}
		
		return false;
	}

	
	

	protected class BookMapper implements RowMapper<Book_Table>
	{
		@Override
		public Book_Table mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Book_Table data = new Book_Table();
			data.setBook_id(rs.getInt("book_id"));
			data.setBook_name(rs.getString("book_name"));
			return data;
		}
	}
	
	protected class CustomerMapper implements RowMapper<Customer>
	{
		@Override
		public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Customer data = new Customer();
			data.setCustomer_id(rs.getInt("customer_id"));
			data.setCustomer_name(rs.getString("customer_name"));
			return data;
		}
	}


}
