package Ejemplo16;

class Laptop

{

	String marca;
	double peso;
	String color;


public static void main(String[] args)
	{
		Laptop laptop = new Laptop();

		 laptop.marca = "Lenovo";
		 laptop.peso = 34.6;
		 laptop.color = "Gris";

		System.out.println(laptop);

		System.out.println("la marca es: "+laptop.marca);

		System.out.println("el peso en kg es: "+laptop.peso);

		System.out.println("el color es: "+laptop.color);

	}

}
