package Formas;

public final class Cubo extends Tridimensional{

	public Cubo(
		String nome,
		int dimensao,
		double altura,
		double largura,
		double profundidade
		
		) {
	if (altura != largura || altura != profundidade || largura != profundidade ){
		System.out.println("Altura, largura e profundidade do cubo precisa ser iguais");
		return;
	}
		
		this.setNome(nome);
		this.setDimensao(dimensao);
		this.setAltura(altura);
		this.setLargura(largura);
		this.setProfundidade(profundidade);
		
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(super.toString() + " Volume: " + this.volume());
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return this.getAltura()*this.getLargura()*this.getProfundidade();
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 4*this.getLargura()*this.getLargura();
	}
	

}
