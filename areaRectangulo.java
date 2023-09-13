import java.util.Scanner;
public class areaRectangulo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese la base del rectángulo: ");
		double base = sc.nextDouble();
		
		
		System.out.println("Ingrese la altura del rectángulo: ");
		double altura = sc.nextDouble();
		
		double area = base * altura;
		
		System.out.println("El área del rectángulo es:" + area);
	}

	
}
