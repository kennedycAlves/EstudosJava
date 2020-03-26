package Composicao;

import java.util.Date;

public class ContratoPorHora {
	private Date date;
	private Double valorPorHora;
	private Integer horas;
	
	public ContratoPorHora() {
		
	}
	
	public ContratoPorHora(Double valorPorHora, Integer horas) {
		
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public double totalValue() {
		return valorPorHora * horas;
		
	}
	
	

}
