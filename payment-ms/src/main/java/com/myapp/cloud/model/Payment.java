package com.myapp.cloud.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "payments")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long txnid;
	private double amount;
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date trxndate;

	public long getTxnid() {
		return txnid;
	}

	public void setTxnid(long txnid) {
		this.txnid = txnid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getTrxndate() {
		return trxndate;
	}

	public void setTrxndate(Date trxndate) {
		this.trxndate = trxndate;
	}

}
