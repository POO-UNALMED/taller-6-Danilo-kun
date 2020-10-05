package vehiculos;
public class Automovil extends Vehiculo {
	private int puestos;
	static int automoviles;
	Automovil(){
		this.puertas=4;
		this.velocidadMaxima=100;
		this.traccion="FWD";
		cantidadVehiculos+=1;
		automoviles+=1;
	}
	public Automovil(String s, String s2, int i, int j, Fabricante f, int k) {
		Automovil a=new Automovil();
		a.placa=s;
		a.nombre=s2;
		a.precio=i;
		a.peso=j;
		a.fabricante=f;
		a.puestos=k;
		Pais.paises.add(f.getPais());
	}
	void setPuestos(int i) {
		this.puestos=i;
	}
	int getPuestor() {
		return puestos;
	}
}
