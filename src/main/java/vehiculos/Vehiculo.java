package vehiculos;
import java.util.*;
public class Vehiculo {
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected long precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	public static int cantidadVehiculos;
	public Vehiculo(String s, int i, int j, String s2, int k, int l, String s3, Fabricante f) {
		this.placa=s;
		this.puertas=i;
		this.velocidadMaxima=j;
		this.nombre=s2;
		this.precio=k;
		this.peso=l;
		this.traccion=s3;
		this.fabricante=f;
		cantidadVehiculos+=1;
		Pais.paises.add(f.getPais());
	}
	public Vehiculo(){
		
	}
	public static void setCantidadVehiculos(int i) {
		cantidadVehiculos=i;
	}
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	static String vehiculosPorTipo() {
		return "Automoviles: "+Automovil.automoviles+"\nCamionetas: "+Camioneta.camionetas+"\nCamiones: "+Camion.camiones;
	}
	void setPlaca(String s) {
		this.placa=s;
	}
	public String getPlaca() {
		return this.placa;
	}
	void setPuertas(int i) {
		this.puertas=i;
	}
	public int getPuertas() {
		return this.puertas;
	}
	void setVelocidadMaxima(int i) {
		this.velocidadMaxima=i;
	}
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	void setNombre(String s) {
		this.nombre=s;
	}
	public String getNombre() {
		return this.nombre;
	}
	void setPrecio(long i) {
		this.precio=i;
	}
	public long getPrecio() {
		return this.precio;
	}
	void setPeso(int i) {
		this.peso=i;
	}
	public int getPeso() {
		return this.peso;
	}
	void setTraccion(String s) {
		this.traccion=s;
	}
	public String getTraccion() {
		return this.traccion;
	}
	void setFabricante(Fabricante f) {
		this.fabricante=f;
	}
	Fabricante getFabricante() {
		return this.fabricante;
	}
	public static void main(String[] args) {
		System.out.println();
	}
}
