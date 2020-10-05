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
		Camioneta a=new Camioneta();
		a.placa=s;
		a.puertas=i;
		a.nombre=s2;
		a.precio=j;
		a.peso=k;
		a.fabricante=f;
		a.volco=b;
		Pais.paises.add(f.getPais());
	}
	void setVolco(boolean i) {
		this.volco=i;
	}
	boolean isVolco() {
		return this.volco;
	}
}
