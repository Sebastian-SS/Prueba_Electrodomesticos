package Prueba_1;

public class Electrodomestico {
	
	final String initialColor = "Blanco";
	final int initialprecioBase = 100000;
	final char initialconsumoEnergetico = 'F';
	final int initialpeso = 5;
	
	final String[] coloresDisponibles = {"Blanco", "Negro", "Gris", "Rojo", "Azul"};
	final char[] tiposConsumoEnergetico = {'A', 'B', 'C', 'D', 'E', 'F'};

	String color;
	int precioBase;
	char consumoEnergetico;
	int peso;
	
	public Electrodomestico() { 
		this.color = initialColor;
		this.precioBase = initialprecioBase;
	    this.consumoEnergetico = initialconsumoEnergetico;
		this.peso = initialpeso;		
	}
	
	public Electrodomestico( int newPeso, int newPrecioBase) {
		this.color = initialColor;
		this.consumoEnergetico = initialconsumoEnergetico;
		this.peso = newPeso;
		this.precioBase = newPrecioBase;
		
	}
	
	public Electrodomestico(String newColor, int newPrecioBase, char newConsumoEnergetico, int newPeso) {
		if(!comprobarColor(newColor) || !comprobarConsumoEnergetico(newConsumoEnergetico)) {
			System.out.println("Error de ingreso de datos");
		} else {
			this.color = newColor;
			this.precioBase = newPrecioBase;
			this.consumoEnergetico = newConsumoEnergetico;
			this.peso = newPeso;
		}
	}			

	public String getColor() {
		return color;
	}


	public int getPrecioBase() {
		return precioBase;
	}


	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}


	public int getPeso() {
		return peso;
	}
	
	private static boolean comprobarConsumoEnergetico(char letra) {
		if (letra == 'A') {
			return true;
		}
		if (letra == 'B') {
			return true;
		}
		if (letra == 'C') {
			return true;	
		}
		if (letra == 'D') {
			return true;
	    }
		if (letra == 'E') {
		    return true;
		}    
		if (letra == 'F') {
			return true;
        }else {
		return false;
		}
		
	}

	private static boolean comprobarColor(String color) {
		
		if (color == "Blanco") {
			return true;
		}
		if (color == "Negro") {
			return true;
		}
		if (color == "Gris") {
			return true;	
		}
		if (color == "Rojo") {
			return true;
	    }
		if (color == "Azul") {
		    return true;
		}else{
		return false;
		}
	}
	
	public int precioFinal() {
		int sum = precioBase;
		
		if(consumoEnergetico == 'A') { 
			sum += 100;
		}
		if(consumoEnergetico == 'B') {
			sum += 80;
		}
		if(consumoEnergetico == 'C') { 
			sum += 60;
		}
		if(consumoEnergetico == 'D') {
			sum += 50;
		}
		if(consumoEnergetico == 'E') {
			sum += 30;
		}
		if(consumoEnergetico == 'F') {
			sum += 10;
		}
		
		if(peso >=0 && peso <=19) {
			sum += 10;
		}
		if(peso >=20 && peso <=49) {
			sum += 50;
		}
		if(peso >=50 && peso <=79) {
			sum += 80;
		}
		if(peso >=80) {
			sum +=100;
		}
		return sum;
	}
	
	public static void main(String[] args) {}

}

