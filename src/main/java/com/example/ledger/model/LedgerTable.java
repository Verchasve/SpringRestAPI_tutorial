
/**
 * Oct 24, 2020
   created by Abhishek Singh
 */
package com.example.ledger.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ledger")
public class LedgerTable {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String sender;
    private String recipient;
    private boolean soft_delete;
    private double transaction_value;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the sender
	 */
	public String getSender() {
		return sender;
	}
	/**
	 * @param sender the sender to set
	 */
	public void setSender(String sender) {
		this.sender = sender;
	}
	/**
	 * @return the recipient
	 */
	public String getRecipient() {
		return recipient;
	}
	/**
	 * @param recipient the recipient to set
	 */
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	/**
	 * @return the soft_delete
	 */
	public boolean isSoft_delete() {
		return soft_delete;
	}
	/**
	 * @param soft_delete the soft_delete to set
	 */
	public void setSoft_delete(boolean soft_delete) {
		this.soft_delete = soft_delete;
	}
	/**
	 * @return the transaction_value
	 */
	public double getTransaction_value() {
		return transaction_value;
	}
	/**
	 * @param transaction_value the transaction_value to set
	 */
	public void setTransaction_value(double transaction_value) {
		this.transaction_value = transaction_value;
	}
    
    

}
