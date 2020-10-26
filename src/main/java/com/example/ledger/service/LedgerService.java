
/**
 * Oct 24, 2020
   created by Abhishek Singh
 */


package com.example.ledger.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import com.example.ledger.dao.LedgerDao;
import com.example.ledger.model.LedgerTable;
 


@Service
public class LedgerService implements LedgerDao {

	
	@Autowired
	private JdbcTemplate jdbctemplate;
	private List<LedgerTable> data  = new ArrayList<>(); 
	private final String queryPredicate = "SELECT * FROM SYS.LEDGER";
	private final String UpdateQuery = "UPDATE SYS.LEDGER "
			+ " SET SENDER = ?, "
			+ " RECIPIENT  = ?, "
			+ " TRANSACTION_VALUE = ?, "
			+ " SOFT_DELETE = ? "
			+ " WHERE ID = ? ";
	private final String DeleteQuery = "UPDATE SYS.LEDGER SET SOFT_DELETE = TRUE WHERE ID = ? ";
	private final String InsertQuery = "INSERT INTO SYS.LEDGER (SENDER , RECIPIENT , TRANSACTION_VALUE , SOFT_DELETE )"
			+ "VALUE (? , ? , ? , ? )";
	
  
	/*  Service call to retrieve entire dataset from the Database */

	@Override
	public List<LedgerTable> findAll() {
		// TODO Auto-generated method stub
		data = jdbctemplate.query(queryPredicate, new LedgerMapper()) ; 
		return data;
	}

	
	/*  Service call to retrieve one dataset from the Database filter by ID */

	@Override
	public List<LedgerTable> findById(long id) {
		// TODO Auto-generated method stub
		String qery = queryPredicate+" where LEDGER.ID = ?" ;
		data = jdbctemplate.query(qery, new Object[]{id}, new LedgerMapper()) ;
		return data;
	}


	/*  Service call to update one column into Database filter by ID */
	
	@Override
	public List<LedgerTable> findTransactionNotSoftDeleted() {
		// TODO Auto-generated method stub
		String qery = queryPredicate+" where LEDGER.SOFT_DELETE IS FALSE" ;
		data = jdbctemplate.query(qery, new LedgerMapper()) ; 
		return data;
	}

	
	/*  Service call to get sum of transaction_values from all records, 
	 *  which has soft_delete set as false in the databse */

	@Override
	public double transSumNotSoftDeleted() {
		// TODO Auto-generated method stub
		List<Double> sum =  new ArrayList<>();
		
		String qery = "SELECT transaction_value FROM SYS.LEDGER where LEDGER.SOFT_DELETE IS FALSE" ;
		sum = jdbctemplate.queryForList(qery, Double.class);
		
		double count = 0.0;
		for (double i : sum)
		{
			count = i+count;
		}
		return count;
	}
	
	/*  Service call to update each column based on id into the databse */
	
	@Override
	public boolean updatetransaction(long id , LedgerTable data ) {
		// TODO Auto-generated method stub
		int result = 0;
		result = jdbctemplate.update(UpdateQuery , data.getSender() , 
				data.getRecipient() , data.getTransaction_value() , 
				data.isSoft_delete() , id);
		if (result > 0 )
		{
			return true;
		}
		return false;
	}
	
	/*  Service call to add new record into the databse */
	
	@Override
	public boolean insertTransaction(LedgerTable data) {
		// TODO Auto-generated method stub
		int result = 0;
		result = jdbctemplate.update(InsertQuery , data.getSender() 
				, data.getRecipient() , data.getTransaction_value() 
				, data.isSoft_delete());
		
		if (result > 0 )
		{
			return true;
		}
		return false;
	}

	/*  Service call to update on column 'SOFT_DELETE' based on id into the databse */

	@Override
	public boolean updateSoftDelete(long id) {
		// TODO Auto-generated method stub
		int result = 0;
		
		result = jdbctemplate.update(DeleteQuery, id);
		if (result > 0 )
		{
			return true;
		}
		return false;
	}
	
	

	protected class LedgerMapper implements RowMapper<LedgerTable>
	{
		@Override
		public LedgerTable mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			LedgerTable data = new LedgerTable();
			data.setId(rs.getLong("ID"));
			data.setRecipient(rs.getString("RECIPIENT"));
			data.setSender(rs.getString("SENDER"));
			data.setSoft_delete(rs.getBoolean("SOFT_DELETE"));
			data.setTransaction_value(rs.getDouble("TRANSACTION_VALUE"));
			return data;
		}
	}





}

