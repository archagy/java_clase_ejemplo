import java.util.Scanner;

public class Menu {
	
	public void showMenu(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Selecciona una opcion: \n");
		opciones();
		boolean bandera = true;
	//	System.out.println(op);
		while(bandera){
			int op = validarNumeroMenu(scan.next());
			if(!(op==0)){
				switch(op){
				case 1:
					int fiboNum ;
					do{
					System.out.print("\nIntroduce un numero mayor a 1 para empezar la serie: ");
				
					fiboNum = validarNumeroFibo(scan.next());
					if(fiboNum>1){
						Fibonacci fibo = new Fibonacci(fiboNum);
						System.out.println("Haz regresado al Menu, Oprime 6 para mostrar las opciones disponibles");
						break;
					}
					}while(fiboNum>=1 || fiboNum==0);
					
					break;
				case 2:
					int trabNum;
					System.out.println("Ingrese numero total de trabajadores: ");
					do{
						trabNum = validarNumeroFibo(scan.next());
						if(trabNum>0){
							SueldoQuincenal sueldo = new SueldoQuincenal(trabNum);
						}
					}while(trabNum==0);
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					opciones();
					break;
				case 7:
					bandera = false;
					System.out.println("Adios!!");
					break;
				}
			}
		
		}
	}
	
	public int validarNumeroMenu(String op){
		if(op.matches("\\d")){
			int num = Integer.parseInt(op);
			if(num >= 1 && num <= 7){
				return num;
			}else{
				System.out.println("Inserte un numero correcto ");
				System.out.print("\nOpcion: ");
		}
		}
		return 0;
	}
	
	public int validarNumeroFibo(String op){
		if(op.matches("\\d+")){
			int num = Integer.parseInt(op);
				return num;
			}else{
				System.out.println("Inserte un numero correcto ");
				System.out.print("\nOpcion: ");
			
		}
		return 0;
	}
	
	public void opciones(){
		System.out.println("1.- Muestra serie de Fibonacci");
		System.out.println("2.- El sueldo que perciben los vendedores de una empresa automotriz");
		System.out.println("3.- programa que escriba la tabla de multiplicar del número 1 al número 10.");
		System.out.println("4.- programa que pida una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.");
		System.out.println("5.- programa que muestre el producto de los 10 primeros números impares.");
		System.out.println("6.- Volver a mostrar el Menu");
		System.out.println("7.- Salir");
		System.out.print("Opcion: ");
	}

}
