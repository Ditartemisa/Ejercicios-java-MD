
import java.util.Scanner;
public class javas3MD {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese su nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Ingrese su apellido: ");
		String apellido= sc.nextLine();
		
		System.out.println("Ingrese su edad ");
		int edad = sc.nextInt();
		
		
		System.out.println("Hola" + nombre + "" + apellido + "; ¡bienvenido/a!");
		System.out.println("Dentro de 10 años, tendrás" + (edad + 10) + "años.");
		
	}

}
