package Prueba_1;

public class Television extends Electrodomestico {

	final int resolucionInicial =20;
	final Boolean sinSintonizadorTDT = false;
	
	int resolucion;
	Boolean sintonizadorTDT;
	
	public Television() {
		super();
		this.sintonizadorTDT = sinSintonizadorTDT;
		this.resolucion = resolucionInicial;
	}
	public Television(int newPeso, int newPrecioBase) {
		super(newPeso, newPrecioBase);
		this.sintonizadorTDT = sinSintonizadorTDT;
		this.resolucion = resolucionInicial;
	}
	public Television(String newColor, int newPrecioBase, char newConsumoEnergetico, int newPeso, Boolean newSintonizadorTDT, int newResolucion) {
		super(newColor, newPrecioBase, newConsumoEnergetico, newPeso);
		this.sintonizadorTDT = newSintonizadorTDT;
		this.resolucion = newResolucion;
	}
	public int getResolucion() {
		return resolucion;
	}
	public Boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	public int precioFinal() {
		int sum =super.precioFinal();
		
		if(resolucion>40) {
			sum += precioBase*0.3;
		}
		if(sintonizadorTDT == true) {
			sum += 50;
		}
		return sum;
	}
}
