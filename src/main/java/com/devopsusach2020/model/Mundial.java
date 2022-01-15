package com.devopsusach2020.model;

import java.io.Serializable;

public class Mundial implements Serializable {

	/**
	 * esta es la clase mundial
	 */
	private static final long serialVersionUID = 3908000903498620526L;
	
	private int totalconfirmed;
	private int totaldeaths;
	private int totalrecovered;
	

	// obtiene el total confimado
	public int getTotalConfirmed() {
		return totalconfirmed;
	}

	// fija el total confirmado
	public void setTotalConfirmed(int totalConfirmed) {
		this.totalconfirmed = totalConfirmed;
	}
	public int getTotalDeaths() {
		return totaldeaths;
	}
	public void setTotalDeaths(int totalDeaths) {
		this.totaldeaths = totalDeaths;
	}
	public int getTotalRecovered() {
		return totalrecovered;
	}
	public void setTotalRecovered(int totalRecovered) {
		this.totalrecovered = totalRecovered;
	}	

}
