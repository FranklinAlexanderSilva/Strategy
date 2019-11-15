/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_strategy;

/**
 *
 * @author frank
 */
import java.util.Scanner;
public class Lectura {
    public static String ingresarString(String mensaje){
		Scanner lectura = new Scanner(System.in);
		String valor;
		System.out.println(mensaje);
		valor=lectura.nextLine();
		return valor;
	}
	public static double ingresarDouble(String mensaje){
		Scanner lectura = new Scanner(System.in);
		double valor;
		System.out.println(mensaje);
		valor=lectura.nextInt();
		return valor;
	}
	public static int ingresarInt(String mensaje){
		Scanner lectura = new Scanner(System.in);
		int valor;
		System.out.println(mensaje);
		valor=lectura.nextInt();
		return valor;
	}
	public static float ingresarFloat(String mensaje){
		Scanner lectura = new Scanner(System.in);
		float valor;
		System.out.println(mensaje);
		valor=lectura.nextFloat();
		return valor;
	}
	public static boolean ingresarBoolean(String mensaje){
		Scanner lectura = new Scanner(System.in);
		boolean valor;
		System.out.println(mensaje);
		valor=lectura.nextBoolean();
		return valor;
	}
	public static int leerEnteroDesde(String mensaje ,int desde){
		Scanner lectura= new Scanner (System.in);
		int valor;
		System.out.println(mensaje);
		valor= lectura.nextInt();
	while(valor<desde){
		
		System.out.println("FUERA DE RANGO  "+desde);
		System.out.println(mensaje);
		valor= lectura.nextInt();
	}
	return valor;	
	}
	public static int leerEnteroDesdeHasta(String mensaje ,int desde,int hasta){
		Scanner lectura= new Scanner (System.in);
		int valor;
		System.out.println(mensaje);
		valor= lectura.nextInt();
		
	while(valor<desde && valor>hasta){
		if(hasta>desde)
		System.out.println("FUERA DE RANGO ENTRE "+desde+ "HASTA "+hasta);
		System.out.println(mensaje);
		valor= lectura.nextInt();
	}
	return valor;	
	}
}