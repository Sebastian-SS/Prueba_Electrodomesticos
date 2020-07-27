package Prueba_1;

public class Lavadora extends Electrodomestico {
	
	final int cargaInicial = 5;
	int carga;
	
	public Lavadora() {
		super();
		this.carga = cargaInicial;
	}
	public Lavadora(int newPeso, int newPrecioBase) {
		super(newPeso, newPrecioBase);
		this.carga = cargaInicial;
	}
	public Lavadora(String newColor, int newPrecioBase, char newConsumoEnergetico, int newPeso, int newCarga) {
		super(newColor, newPrecioBase, newConsumoEnergetico, newPeso);
		this.carga = newCarga;
	}
	public int getCarga() {
		return carga;
	}
	
	public int precioFinal() {
		int sum =super.precioFinal();
		
		if(carga>30) {
			sum += 50;
	}
		return sum;
	}
	}



