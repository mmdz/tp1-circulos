package ar.edu.unlam.tp1;

public class Circulo {
	
	private Double radio;
	
	public Circulo(){
		this.radio = 0.0;
	}
	
	public Circulo(Double radio){
		this.radio = radio;
	}
	
	public void setRadio (Double radio){
		this.radio = radio;
	}
	
	public Double getRadio(){
		return radio;
	}
	
	public Double getPerimetro(){
		return (2 * Math.PI * radio);
	}

}