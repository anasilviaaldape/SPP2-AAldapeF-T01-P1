/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aaldapef.t01.p1;
import java.util.Scanner;
/**
 *
 * @author Aldape
 */
public class SPP2AAldapeFT01P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ana Silvia Aldape Felizardo
        //A01410367
        //IIS
        
        Scanner teclado=new Scanner (System.in);
        //Declaracion de variables
        String mat;
        double cal1;
        double cal2;
        double cal3;
        double cal4;
        double cal5;
        double pro;
        String res;
        
        //Pedir datos
        System.out.println("PROGRAMA 01.");
        System.out.println(" ");
        System.out.println("Introduce tu matrícula:");
        mat= teclado.next();
        System.out.println(" ");
        System.out.println("Calificaciones:");
        System.out.print("Cálculo: ");
        cal1= teclado.nextDouble();
        System.out.print("Estatica: ");
        cal2= teclado.nextDouble();
        System.out.print("Física: ");
        cal3= teclado.nextDouble();
        System.out.print("Procesos de Manufactura: ");
        cal4= teclado.nextDouble();
        System.out.print("Programacion: ");
        cal5= teclado.nextDouble();
        
        //Calculos
        pro= (cal1+cal2+cal3+cal4+cal5)/5;
        System.out.println(" ");
        System.out.println("Promedio= "+pro);
        if(pro >=7){
            System.out.println("APROBADO");}
        else {System.out.println("REPROBADO");}
        }
        
        
        
        
        
        
        
        
    }
    
}
