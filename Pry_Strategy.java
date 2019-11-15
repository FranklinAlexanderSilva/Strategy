/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_strategy;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Pry_Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AvionComercial avionComercial = new AvionComercial();
	AvionRapido avionRapido = new AvionRapido();
        Lectura lectura = new Lectura();
        int op,op2;
        boolean estado =true;
        do{
            System.out.println("1) Avión comercial:");
            System.out.println("2) Avion de guerra:");
            System.out.println("3) Salir:");
            op=lectura.ingresarInt("\nSeleccione un avión: ");
        
            switch(op){
                case 1:{
                    System.out.println("\nSeleccionó el avion comercial");
                    avionComercial.setAlgoritmo(new EnTierra());
                    avionComercial.mover();
                    avionComercial.setAlgoritmo(new EnAire());
                    avionComercial.mover();
                    System.out.println("1) disminuir velocidad");
                    System.out.println("2) Aumentar velocidad");
                    System.out.println("3) Velocidad normal");
                    op2=lectura.ingresarInt("\nSeleccione una opción: ");
                    if(op2==1){
                        avionComercial.setAlgoritmo(new EnAireLento());
                        avionComercial.mover();
                    }
                    if(op2==2){
                        avionComercial.setAlgoritmo(new EnAireVeloz());
                        avionComercial.mover();
                    }
                    if(op2==3){
                        avionComercial.setAlgoritmo(new EnAire());
                        avionComercial.mover();
                    }
                    System.out.println();
                }break;
                case 2:{
                    System.out.println("Seleccionó el avion de guerra");
                    avionRapido.setAlgoritmo(new EnTierra());
                    avionRapido.mover();
                    avionRapido.setAlgoritmo(new EnAireVeloz());
                    avionRapido.mover();
                    System.out.println("1) disminuir velocidad");
                    System.out.println("2) Aumentar velocidad");
                    System.out.println("3) Velocidad normal");
                    op2=lectura.ingresarInt("\nSeleccione una opción: ");
                    if(op2==1){
                        avionComercial.setAlgoritmo(new EnAireLento());
                        avionComercial.mover();
                    }
                    if(op2==2){
                        avionComercial.setAlgoritmo(new EnAireVeloz());
                        avionComercial.mover();
                    }
                    if(op2==3){
                        avionComercial.setAlgoritmo(new EnAire());
                        avionComercial.mover();
                    }
                    System.out.println();
                }break;
                case 3:{
                    System.out.println("*** Adios ***");
                    estado = false;
                }break;
                default:{
                    System.out.println("opcion no valida");
                }
            }
        }while(estado == true);
    }
}