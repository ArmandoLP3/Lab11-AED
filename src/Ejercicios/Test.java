package Ejercicios;

public class Test {

	public static void main(String[] args) {
		//Hash C con el metodo del cuadrado
		HashC<String> hashC1 = new HashC<>(11);
		hashC1.insert(34, "Registro 1");
		hashC1.insert(3, "Registro 2");
		hashC1.insert(7, "Registro 3");
		hashC1.insert(30, "Registro 4");
		hashC1.insert(11, "Registro 5");
		hashC1.insert(8, "Registro 6");
		hashC1.insert(7, "Registro 7");
		hashC1.insert(23, "Registro 8");
		hashC1.insert(41, "Registro 9");
		hashC1.insert(16, "Registro 10");
		hashC1.insert(34, "Registro 11");
		
		System.out.println("Tabla HashC con metodo del cuadrado");
		System.out.println(hashC1.toString());
		//Metodo por pliegue aplicando suma
		
		HashC<String> hashC2 = new HashC<>(11);
		hashC2.insert(34, "Registro 1");
		hashC2.insert(3, "Registro 2");
		hashC2.insert(7, "Registro 3");
		hashC2.insert(30, "Registro 4");
		hashC2.insert(11, "Registro 5");
		hashC2.insert(8, "Registro 6");
		hashC2.insert(7, "Registro 7");
		hashC2.insert(23, "Registro 8");
		hashC2.insert(41, "Registro 9");
		hashC2.insert(16, "Registro 10");
		hashC2.insert(34, "Registro 11");
		
		System.out.println("Tabla HashC con metodo por lpliegue aplicando suma");
		System.out.println(hashC2.toString());
	}
}
