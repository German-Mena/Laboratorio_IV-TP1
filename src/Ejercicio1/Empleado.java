package Ejercicio1;

public class Empleado {
	
	private final int id;
	private String nombre;
	private int edad;
	private static int aux = 1000;
	
	public Empleado() {
		this.id = aux;
		aux++;
	}
	
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
