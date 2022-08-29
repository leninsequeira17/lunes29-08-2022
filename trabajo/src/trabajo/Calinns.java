package trabajo;

import java.util.Scanner;

public class Calinns {
	
final static double Tasainns=0.07;
final static double Tasair=0.156;
final static double Tasapatronal=0.225;
final static double Tasasin=0.01,Tasantiguedad=0.15;
static Scanner Sc= new Scanner(System.in);

public static void main(String[]args) {
	
	double Montoinns,Montoir,Montosin,Montoantiguedad,Montoinnspatronal;
	double Ingresototal,totaldeducciones,Ingresoneto;
	
	System.out.println("ingrese su salario bruto(Basico):c$");
	double ingresobruto=Sc.nextDouble();
	System.out.println("ingrese su antiguedad:");
	int antiguedad =Sc.nextInt();
	
	
	Montoantiguedad=ingresobruto*Tasantiguedad;
	Ingresototal=ingresobruto+Montoantiguedad;
	Montoinns=Ingresototal*Tasainns;
	Montoir=Ingresototal*Tasair;
	Montosin=ingresobruto*Tasasin;
	totaldeducciones=Montoinns+Montoir+Montosin;
	Ingresoneto=Ingresototal-totaldeducciones;
	
	System.out.println("*-*--Ingresos*-*-*");
	System.out.println("Salario bruto:c$"+ingresobruto);
	System.out.println("Antiguedad"+antiguedad + "años");
	System.out.println("*-*-deducciones*-*-*-");
	System.out.println("Tasa del inns:"+Tasainns + "%");
	System.out.println("Monto inns:"+Montoinns + "%");
	System.out.println("Tasa del ir:"+Tasair + "%");
	System.out.println("monto ir:"+Montoir + "%");
	System.out.println("Tasa del sindicato:"+Tasasin + "%");
	System.out.println("monto sindicato:"+Montosin + "%");
	System.out.println("*-*--Calculos totales*-*-*");
	System.out.println("ingresos totales:"+Ingresototal);
	System.out.println("Ingreso Neto:"+Ingresoneto);
	
	
	
	
	
	
	
	
	
	
}


	
	
}


