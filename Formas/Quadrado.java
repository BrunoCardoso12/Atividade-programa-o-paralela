package Formas;

public final class Quadrado extends Bidimensional{

	public Quadrado(
			String nome,
			int dimensao,
			double comprimento,
			double largura
			) {
		if (comprimento != largura) {
			
			System.out.printf("Comprimento nao pode ser diferente de largura");
			return;
		}
		this.setNome(nome);
		this.setDimensao(dimensao);
		this.setComprimento(comprimento);
		this.setLargura(largura);
		
	}

	@Override
	public double getAltura() {
		// TODO Auto-generated method stub
		return this.getComprimento();
	}

	@Override
	public void print() {
		System.out.println(super.toString() +", A area do quadrado e de: " + this.area());
		
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.getComprimento()*this.getAltura();
	}
		

}
