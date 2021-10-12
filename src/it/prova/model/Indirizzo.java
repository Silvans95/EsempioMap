package it.prova.model;

public class Indirizzo {

	String via;
	String civico;

	public Indirizzo() {
		// TODO Auto-generated constructor stub
	}

	public Indirizzo(String via, String civico) {
		super();
		this.via = via;
		this.civico = civico;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getCivico() {
		return civico;
	}

	public void setCivico(String civico) {
		this.civico = civico;
	}

	@Override
	public String toString() {
		return "Indirizzo [civico=" + civico + ", via=" + via + "]";
	}

}
