package org.ip.sesion07;

public class Complejo {
	
	private double real;
	private double imaginaria;
	
	public Complejo(double real, double imaginaria) {
		
		this.real = real;
		this.imaginaria = imaginaria;
		
	}
	
	public Complejo(double real) {
		
		this(real, 0);
		
	}
	
	public Complejo(Complejo comp) {
		
		this(comp.real, comp.imaginaria);
		
	}

	public double getReal() {
		
		return real;
	
	}

	public void setReal(double real) {
	
		this.real = real;
	
	}

	public double getImaginaria() {
	
		return imaginaria;
	
	}

	public void setImaginaria(double imaginaria) {
		
		this.imaginaria = imaginaria;
	
	}

	public String toString() {
		
		if(this.imaginaria == 0) {
			return this.real+"";
		}else if(this.real == 0) {
			return this.imaginaria+"i";
		}else {
			if(this.imaginaria < 0) {
				return this.real+" - "+Math.abs(imaginaria)+"i";
			}else {
				return this.real+" + "+imaginaria+"i";
			
			}
		}
	}

	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		return this.imaginaria == other.imaginaria && this.real == other.real;
		
	}
	
	public Complejo sumar(Complejo b) {
		
		double r = this.real + b.real;
		double i = this.imaginaria + b.imaginaria;
		return new Complejo(r, i);
		
	}
	
	public Complejo restar(Complejo b) {
		
		double r = this.real - b.real;
		double i = this.imaginaria - b.imaginaria;
		return new Complejo(r, i);
		
	}
	
	public Complejo multiplicar(Complejo b) {
		
		double r = this.real*b.real - this.imaginaria*b.imaginaria;
		double i = this.imaginaria*b.real + this.real*b.imaginaria;
		return new Complejo(r, i);
		
	}
	
	public Complejo productoPorEscalar(double valorEscalar) {
		
		double r = this.real * valorEscalar;
		double i = this.imaginaria * valorEscalar;
		return new Complejo(r, i);
		
	}
	
	public Complejo dividir(Complejo b) {
		
		double r = this.real*b.real + this.imaginaria*b.imaginaria;
		double i = this.imaginaria*b.real - this.real*b.imaginaria;
		double d = b.real*b.real + b.imaginaria*b.imaginaria;

		return new Complejo(r/d, i/d);
		
	}
	
	public Complejo modulo() {
		
		double r = Math.sqrt(this.real*this.real + this.imaginaria*this.imaginaria);
		return new Complejo(r);
		
	}
	
	public double argumento() {
		
		return Math.atan(this.imaginaria / this.real);
		
	}
	
	public Complejo conjugado() {
		
		return new Complejo(this.real, -this.imaginaria);
		
	}
}
