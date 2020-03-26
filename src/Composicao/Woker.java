package Composicao;

import Composicao.WorkerLevel;

import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Composicao.ContratoPorHora;

public class Woker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Departamento departamento;
	private List<ContratoPorHora> contratos = new ArrayList<>();
	
	public Woker() {
		
	}

	public Woker(String name, WorkerLevel level, Double baseSalary, Departamento departamento) {
		
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departamento = departamento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoPorHora> getContratos() {
		return contratos;
	}

	
	
	public void addContract(ContratoPorHora contrato) {
		contratos.add(contrato);
	}
	
	public void removeContract(ContratoPorHora contrato) {
		contratos.remove(contrato);
	}
	
	public double income(int ano, int mes) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (ContratoPorHora c : contratos) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = cal.get(Calendar.MONTH);
			if(ano == c_year && mes == c_month) {
				sum =+ c.totalValue();
			}
		}
		return sum;
		
	}

}
