package Formas;

public class Main {
		
	public static void main(String[] args) {
        Cubo cubo = new Cubo("Cubo", 3, 5, 5, 5);
        cubo.print();

        Quadrado quadrado = new Quadrado("Quadrado", 2, 4, 4);
        quadrado.print();

        Tetraedro tetraedro = new Tetraedro("Tetraedro", 3, 3, 3, 3);
        tetraedro.print();

        TrianguloEquilatero triangulo = new TrianguloEquilatero("Triangulo", 2, 4, 4);
        triangulo.print();
    }
	
	}


