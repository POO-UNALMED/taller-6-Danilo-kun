package vehiculos;
public class Camioneta extends Vehiculo {
	private boolean volco;
	static int camionetas;
	Camioneta(){
		this.velocidadMaxima=90;
		this.traccion="4X4";
		cantidadVehiculos+=1;
		camionetas+=1;
	}
	public Camioneta(String s, int i, String s2, int j, int k, Fabricante f, boolean b) {
		this.placa=s;
		this.puertas=i;
		this.nombre=s2;
		this.precio=j;
		this.peso=k;
		this.fabricante=f;
		this.volco=b;
		this.velocidadMaxima=90;
		this.traccion="4X4";
		cantidadVehiculos+=1;
		camionetas+=1;
		Pais.paises.add(f.getPais());
		Fabricante.fabricantes.add(f);
	}
	void setVolco(boolean i) {
		this.volco=i;
	}
	boolean isVolco() {
		return this.volco;
	}
}
