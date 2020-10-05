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
		Camion a=new Camion();
		a.placa=s;
		a.nombre=s2;
		a.precio=i;
		a.peso=j;
		a.fabricante=f;
		a.ejes=k;
		Pais.paises.add(f.getPais());
	}
	void setEjes(int i) {
		this.ejes=i;
	}
	int getEjes() {
		return this.ejes;
	}
}
