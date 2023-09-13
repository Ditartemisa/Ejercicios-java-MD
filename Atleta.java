
public class Atleta {

	private String nombre;
	private String deporte;
	private int energía;
	
	public Atleta (String nombre, String deporte)
	{
		this.nombre = nombre;
		this.deporte = deporte;
		this.energía = 100;
		
	}
	
	public void entrenar (int horas)
	{
		System.out.println(nombre + " ha entredado por " + horas + "horas.");
	}
	
	public void descansar ()
	{
		System.out.println(nombre + "está descansando.");
	}
	
	public void celebrarVictoria ()
	{
		System.out.println(nombre + "ha ganado y está celebrando la victoria.");
	}
}
