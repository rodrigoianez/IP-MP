package org.ip.sesion06;

public class Circulo {
	
		private double xCentro;
		private double yCentro;
		private double radio;
		private static int numCirculos = 0;
		
		public Circulo() {
			
			xCentro=0.0;
			yCentro=0.0;
			radio=0.0;
			numCirculos++;
			
		}
		
		public Circulo (double xCentro, double yCentro, double radio) {
			
			this.xCentro = xCentro;
			this.yCentro = yCentro;
			this.radio = radio;
			numCirculos++;
			
		}
		
		public Circulo (double xCentro, double yCentro) {
			
			this.xCentro = xCentro;
			this.yCentro = yCentro;
			this.radio = 0.0;
			numCirculos++;
					
		}
		
		public Circulo (double radio) {
			
			this.xCentro = 0.0;
			this.yCentro = 0.0;
			this.radio = radio;
			numCirculos++;
			
		}
		
		public Circulo(Circulo circulo) {
			
			this.xCentro = circulo.getXCentro();
			this.yCentro = circulo.getYCentro();
			this.radio = circulo.getRadio();
			numCirculos++;
			
		}
		
		public double getXCentro() {
			
			return this.xCentro;
			
		}
		
		public void setXcentro(double xCentro) {
			
			this.xCentro = xCentro;	
			
		}
		
		public double getYCentro() {
			
			return this.yCentro;
			
		}
		
		public void setYcentro(double yCentro) {
			
			this.yCentro = yCentro;
			
		}
		
		public double getRadio() {
			
			return this.radio;
			
		}
		
		public void setRadio(double radio) {
			
			this.radio = radio;
			
		}
		
		public static int getNumCirculos() {
			
			return numCirculos;
			
		}
		
		public String toString() {
			
			return "Circulo={(xCentro = " + xCentro + ", yCentro=" + yCentro+", radio = " + radio + ")}";
			
		}
		
		@Override
		
		public boolean equals( Object obj ) {
			Circulo other = (Circulo)obj;
			
			return this.toString().equals(other.toString());
			
		}
		
		public int compareTo(Object obj) {
			
			Circulo other= (Circulo)obj;
			
			if(calcularArea() == other.calcularArea() ) {
				
				return 0;
				
			}
			
			if(calcularArea() < other.calcularArea())
				
				return -1;
			
			else
				
				return 1;
			
		}
		
		public double calcularArea() {
			
			return Math.PI*Math.pow(radio, 2);
			
		
			
		}
		
		public double calcularLongitud() {
			
			return Math.PI*radio*2;
			
		}
		
		public double calcularDiametro() {
			
			return 2*radio;
			
		}
}