package vehiculos;
import java.util.*;
public class Fabricante {
	private String nombre;
	private Pais pais;
	public static List<Fabricante> fabricantes=new ArrayList<>();
	public Fabricante(String s,Pais p){
		this.nombre=s;
		this.pais=p;
	}
	void setNombre(String s) {
		this.nombre=s;
	}
	public String getNombre() {
		return this.nombre;
	}
	void setPais(Pais p) {
		this.pais=p;
	}
	public Pais getPais() {
		return this.pais;
	}
	public static Fabricante fabricaMayorVentas() {
		Fabricante aux=null;
		int aux1=0;
		for(int i=0;i<fabricantes.size();i++) {
			if(Collections.frequency(fabricantes, fabricantes.get(i))>aux1) {
				aux=fabricantes.get(i);
				aux1=Collections.frequency(fabricantes, fabricantes.get(i));
			}
		}
		return aux;
	}
}
