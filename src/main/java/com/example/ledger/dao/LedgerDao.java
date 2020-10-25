
/**
 * Oct 24, 2020
   created by Abhishek Singh
 */
package com.example.ledger.dao;

import java.util.List;

import com.example.ledger.model.LedgerTable;

public interface LedgerDao {
	
	List<LedgerTable> findAll();
	
	List<LedgerTable> findById(long id);
	
	List<LedgerTable> findTransactionNotSoftDeleted();
	
	double transSumNotSoftDeleted();
	
	boolean updatetransaction(long id , LedgerTable data);
	
	boolean updateSoftDelete(long id);
	
	boolean insertTransaction(LedgerTable data);

}

