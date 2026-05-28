package org.mp.sesion02;

public class Octogono extends ObjetoGeometrico implements Comparable<Octogono>, Cloneable, DeColor {
	protected double lado;

	public Octogono() {
		super();
		this.lado = 0;
	}

	public Octogono(String color, boolean relleno, double lado) {
		super(color, relleno);
		this.lado = lado;
	}

	@Override
	public double getPerimetro() {
		return 8 * this.lado;
	}

	@Override
	public double getArea() {
		return (4 / Math.sqrt(2) + 2) * (Math.pow(lado, 2));
	}

	@Override
	public String comoColorear() {
		return "Colorear los 8 lados de " + this.getColor();
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public Object clone() {
		return new Octogono(this.getColor(), this.esRelleno(), this.getLado());

	}

	@Override
	public int compareTo(Octogono o) {
		int s = 0;
		if (this.getArea() < o.getArea() && this.getPerimetro() < o.getPerimetro()) {
			s = -1;
		}
		if (this.getArea() == o.getArea() && this.getPerimetro() == o.getPerimetro()) {
			s = 0;
		}
		if (this.getArea() > o.getArea() && this.getPerimetro() > o.getPerimetro()) {
			s = 1;
		}
		return s;
	}
}