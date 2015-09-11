import java.util.Scanner;

public class SueldoQuincenal {
	private Scanner scan = new Scanner(System.in);
	
	public SueldoQuincenal(int traNum){
		System.out.println("Ingrese El nombre de los trabajadores");
		String[] nombres = new String[traNum];
		int[] carrosVendidos = new int[traNum];
		double[] salarios = new double[traNum];
		double salario,salarioTotal=0;
		System.out.println("Defina el salario minimo: ");
		salario = validarNumeroDouble(scan.next());
		//Scanner scan = new Scanner(System.in);
		for(int i=0; i < traNum; i++){
			double precioTotalCarro = 0;
			
			
			System.out.println("Nombre del trabajador "+(i+1)+" : ");
			nombres[i] = scan.next();
			System.out.println("Ingrese cuantos carros vendio: ");
			carrosVendidos[i] = validarNumeroEntero(scan.next());
			//for anidado
			for(int j=0; j < carrosVendidos[i]; j++){
				System.out.println("Ingrese el precio del carro: "+(j+1));
				precioTotalCarro += validarNumeroDouble(scan.next());
			}
			salarios[i] = calcularSalario(precioTotalCarro,salario,carrosVendidos[i]);
			
		}
		
		System.out.println("\t\t\tNomina Quincuenal");
		for(int k=0; k < traNum;k++){
			System.out.printf("Nombre: "+nombres[k]+"\t\t Salario: %.2f\n",salarios[k]);
			salarioTotal += salarios[k];
		}
		System.out.printf("\nSalario Total: %.2f\n",salarioTotal);
		System.out.println("Haz regresado al Menu, Oprime 6 para mostrar las opciones disponibles");
	}
	
	
	
		public double calcularSalario(double valorTotal, double salario, int carrosVendidos){
			double aplicado = (valorTotal*(2.0f/100.0f));
			aplicado+=salario;
			aplicado+=carrosVendidos*100;
			return aplicado;
		}
		
		public int validarNumeroEntero(String op){
			boolean bandera = true;
			do{
			if(op.matches("\\d+")){
				int num = Integer.parseInt(op);
					bandera = false;
					return num;
				}else{
					System.out.println("Inserte un numero correcto ");
					System.out.print("\nOpcion: ");
				//	Scanner scan = new Scanner(System.in);
					op = scan.next();
					
			}
			}while(bandera);
			return 0;
		}
		
		public double validarNumeroDouble(String op){
			boolean bandera = true;
			do{
			if(op.matches("\\d+(.\\d+)?")){
				double num =Double.parseDouble(op);
					bandera = false;
					return num;
				}else{
					System.out.println("Inserte un numero correcto ");
					System.out.print("\nOpcion: ");
				//	Scanner scan = new Scanner(System.in);
					op = scan.next();
					
			}
			}while(bandera);
			return 0;
		}
	
}
