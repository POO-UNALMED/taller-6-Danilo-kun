package vehiculos;
public class Camion extends Vehiculo {
	private int ejes;
	static int camiones;
	Camion(){
		this.puertas=2;
		this.velocidadMaxima=80;
		this.traccion="4X2";
		cantidadVehiculos+=1;
		camiones+=1;
	}
	public Camion(String s, String s2, int i, int j, Fabricante f, int k) {
		this.placa=s;
		this.nombre=s2;
		this.precio=i;
		this.peso=j;
		this.fabricante=f;
		this.ejes=k;
		this.puertas=2;
		this.velocidadMaxima=80;
		this.traccion="4X2";
		cantidadVehiculos+=1;
		camiones+=1;
		Pais.paises.add(f.getPais());
	}
	void setEjes(int i) {
		this.ejes=i;
	}
	int getEjes() {
		return this.ejes;
	}
}
