package vehiculos;
import java.util.*;
public class Pais {
	private String nombre;
	public static List<Pais> paises=new ArrayList<>();
	public Pais(String s){
		this.nombre=s;
	}
	void setNombre(String s) {
		this.nombre=s;
	}
	public String getNombre() {
		return this.nombre;
	}
	public static Pais paisMasVendedor() {
		Pais aux=null;
		int aux1=0;
		for(int i=0;i<paises.size();i++) {
			if(Collections.frequency(paises, paises.get(i))>aux1) {
				aux=paises.get(i);
				aux1=Collections.frequency(paises, paises.get(i));
			}
		}
		return aux;
	}
}
