
public class CalcularAreaQuadrilateros {
	
	public static void calculaAreaQuadrado(double lado1, double lado2) {
		
		double areaQuadrado = lado1 * lado2;
		
		System.out.println("A área do quadrado é " + areaQuadrado);
		
	}
	
	public static void calculaAreaRetangulo(double base, double altura) {
		
		double areaRetangulo = base * altura;
		
		System.out.println("A área do retângulo é " + areaRetangulo);

	}
	public static void calculaAreaTrapezio(double baseMaior, double baseMenor, double altura) {
		
		double areaTrapezio = (baseMaior+baseMenor) * (altura/2);
		
		System.out.println("A área do trapézio é " + areaTrapezio);
	}

}
