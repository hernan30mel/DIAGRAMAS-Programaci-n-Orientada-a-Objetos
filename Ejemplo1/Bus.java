package Ejemplo1;

class Bus

{

	double tamano;
	String color;
	String placa;


public static void main(String[] args)
	{
		Bus bus = new Bus();

		 bus.tamano = 50.3;
		 bus.color = "Blanco";
		 bus.placa = "B12I";

		System.out.println(bus);

		System.out.println("el tamano es: "+bus.tamano);

		System.out.println("el color es: "+bus.color);

		System.out.println("la placa es: "+bus.placa);

	}

}
