package Formas;

public abstract class Bidimensional extends Forma {
	
	private double comprimento;
	private double largura;
	
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "comprimento=" + this.comprimento + ", largura=" + this.largura  ;
	}
	
	public abstract double area();
}
