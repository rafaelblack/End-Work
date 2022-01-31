package content;

import java.util.ArrayList;

public class Edificio {
	private Integer id;
	private Integer qtd_apartamentos;
	private Integer qtd_andares;
	private String cor;
	//private ArrayList<Apartamento> apartamentos;
	
	public Edificio(Integer id, Integer qtd_apartamentos, Integer qtd_andares, String cor) {
		this.id = id;
		this.qtd_apartamentos = qtd_apartamentos;
		this.qtd_andares = qtd_andares;
		this.cor = cor;
		//this.apartamentos = new ArrayList<Apartamento>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQtd_apartamentos() {
		return qtd_apartamentos;
	}

	public void setQtd_apartamentos(Integer qtd_apartamentos) {
		this.qtd_apartamentos = qtd_apartamentos;
	}

	public Integer getQtd_andares() {
		return qtd_andares;
	}

	public void setQtd_andares(Integer qtd_andares) {
		this.qtd_andares = qtd_andares;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
