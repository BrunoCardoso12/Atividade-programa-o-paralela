package Formas;

public final class TrianguloEquilatero extends Bidimensional{



	public TrianguloEquilatero(
			String nome,
			int dimensao,
			double comprimento,
			double largura
			) {
		
		this.setNome(nome);
		this.setDimensao(dimensao);
		this.setComprimento(comprimento);
		this.setLargura(largura);
	}
	
	@Override
	public double getAltura() {
		// TODO Auto-generated method stub
		return java.lang.Math.sqrt(3)*this.getLargura()/2;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(super.toString() + " A area do triangulo e de: " + this.area());
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.getLargura()*this.getComprimento()/2;
	}
			
	

}
