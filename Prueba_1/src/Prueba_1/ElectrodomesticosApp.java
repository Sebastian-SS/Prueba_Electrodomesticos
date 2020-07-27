package Prueba_1;

public class ElectrodomesticosApp {

	public static void main(String[] args) {
		
		Electrodomestico listadoElectrodomestico[] = new Electrodomestico[10];
		
		listadoElectrodomestico[0] = new Electrodomestico(50,500);
		listadoElectrodomestico[1] = new Electrodomestico("Azul",500, 'Z', 12);
		listadoElectrodomestico[2] = new Electrodomestico("Rojo",750, 'B', 22);
		listadoElectrodomestico[3] = new Lavadora();
		listadoElectrodomestico[4] = new Lavadora("Negro", 230, 'C', 49, 15);
		listadoElectrodomestico[5] = new Lavadora("Gris", 230, 'C', 49, 35);
		listadoElectrodomestico[6] = new Television();
		listadoElectrodomestico[7] = new Television("Azul", 1000, 'A', 10, true, 44);
		listadoElectrodomestico[8] = new Television("Rojo", 1000, 'A', 15, true, 37);
		listadoElectrodomestico[9] = new Television("Negro", 1000, 'B', 27, false, 20);
		
		int sumaElectrodomesticos =0;
		int sumaLavadoras =0;
		int sumaTelevision =0;
		
		for(int i=0;i<listadoElectrodomestico.length;i++){
            
 
            if(listadoElectrodomestico[i] instanceof Electrodomestico){
                sumaElectrodomesticos+=listadoElectrodomestico[i].precioFinal();
            }
            if(listadoElectrodomestico[i] instanceof Lavadora){
                sumaLavadoras+=listadoElectrodomestico[i].precioFinal();
            }
            if(listadoElectrodomestico[i] instanceof Television){
                sumaTelevision+=listadoElectrodomestico[i].precioFinal();
            }
		}
	
		System.out.println("La suma del precio de los electrodomesticos es de $"+sumaElectrodomesticos);
		System.out.println("La suma del precio de las lavadoras es de $"+sumaLavadoras);
		System.out.println("La suma del precio de los televisores es de $"+sumaTelevision);
	}}

		
	
		
