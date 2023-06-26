package Actividad2;

public class Test {

	public static void main(String[] args) {
		//HASHC
		HashC<String> hashC = new HashC(11);
			hashC.insert(34, "Registro 1");
			hashC.insert(3, "Registro 2");
			hashC.insert(7, "Registro 3");
			hashC.insert(30, "Registro 4");
			hashC.insert(11, "Registro 5");
			hashC.insert(8, "Registro 6");
			hashC.insert(7, "Registro 7");
			hashC.insert(23, "Registro 8");
			hashC.insert(41, "Registro 9");
			hashC.insert(16, "Registro 10");
			hashC.insert(24, "Registro 11");
			
			System.out.println("Tabla HashC: ");
		//HASHA
		HashA<String> hashA = new HashA(7);
			hashA.insert(34, "Registro 1");
			hashA.insert(3, "Registro 2");
			hashA.insert(7, "Registro 3");
			hashA.insert(30, "Registro 4");
			hashA.insert(11, "Registro 5");
			hashA.insert(8, "Registro 6");
			hashA.insert(7, "Registro 7");
			hashA.insert(23, "Registro 8");
			hashA.insert(41, "Registro 9");
			hashA.insert(16, "Registro 10");
			hashA.insert(24, "Registro 11");
			
			System.out.println(hashA.toString());
	}
}
