/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema16;
import java.util.*;
/**
 *
 * @author PC
 */
public class PP2Problema16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        comparaNumeros();
    }
    public static double solicitarDatos(String d){ //Solicita datos
        double miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextDouble();
        return miDato;
    }
    public static void comparaNumeros(){
        double a= solicitarDatos("primer numero " + "\n"); //Se solicita el primer dato
        double b= solicitarDatos("primer numero " + "\n"); //Se solicita el segundo dato
        double c= solicitarDatos("primer numero " + "\n"); //Se solicita el tercer dato
        if (a>b && a>c){ //Si a es mayor que b y a es mayor que c
            System.out.print("El numero mayor es " + a);
        } else if (b>a && b>c){ //Si b es mayor que a y b es mayor que c
            System.out.print("El numero mayor es " + b);
        }else if(c>a && c>b){ //Si c es mayor que a y si c es mayor que b
            System.out.print("El numero mayor es " + c);
        }
    }
}
