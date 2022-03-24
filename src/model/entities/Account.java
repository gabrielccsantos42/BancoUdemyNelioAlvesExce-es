package model.entities;

public class Account {
	private Integer numero;
	private String nome;
	private Double saldo;
	private Double withdrawLimit;
	
	public Account(Integer numero, String nome, Double saldo, Double withdrawLimit) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.withdrawLimit = withdrawLimit;
	}
	
	
	
	public Integer getNumero() {
		return numero;
	}



	public void setNumero(Integer numero) {
		this.numero = numero;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Double getSaldo() {
		return saldo;
	}



	public Double getWithdrawLimit() {
		return withdrawLimit;
	}



	public void deposito(Double deposito) {
		this.saldo += deposito;
	}
	
	public void saque(Double saque) {
		this.saldo -= saque;
	}
	
	
	@Override
	public String toString() {
		return "New balance: " + getSaldo();
	}
}
 