package com.example.challenge15.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "facturas")
public class FacturaModel {
	
	@Id
	@Column (name = "nroFactura")
	private long nroFactura;
	
	@Column(name = "fk_cliente")
	private long dniCliente;
	
	 @Column(name = "monto")
	private double monto;

	
	
	 
	public FacturaModel() {
	}


	public FacturaModel(long nroFactura, long dniCliente, double monto) {
		this.nroFactura = nroFactura;
		this.dniCliente = dniCliente;
		this.monto = monto;
	}


	public long getNroFactura() {
		return nroFactura;
	}


	public void setNroFactura(long nroFactura) {
		this.nroFactura = nroFactura;
	}


	public long getCliente() {
		return dniCliente;
	}


	public void setCliente(long dniCliente) {
		this.dniCliente = dniCliente;
	}


	public double getMonto() {
		return monto;
	}


	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	
	
	
}
