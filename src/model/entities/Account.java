package model.entities;

import model.execptions.DomainExceptions;

public class Account {
	private Integer numero;
	private String nome;
	private Double saldo;
	private Double limiteSaque;
	
	public Account(Integer numero, String nome, Double saldo, Double limiteSaque) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
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



	public Double getLimiteSaque() {
		return limiteSaque;
	}



	public void deposito(Double deposito) {
		this.saldo += deposito;
	}
	
	public void saque(Double saque) throws DomainExceptions {
		if(saque > limiteSaque) {
			throw new DomainExceptions("Valor ultrapassou limte de saque");
		}
		if(saque > saldo) {
			throw new DomainExceptions("Valor ultrapassou o saldo da conta");
		}
		this.saldo -= saque;
	}
	
	@Override
	public String toString() {
		return "New balance: " + getSaldo();
	}
}
 