
package Ejercicio03;

import java.util.Scanner;

public class EstadoAlumno {
public static void main(String[]args){

Scanner entrada= new Scanner(System.in);
int i;
int notas []= new int [2];
String nombres[]= new String[2];
String  resultados[]= new String[4];
resultados[0]= "sobresaliente";
resultados[1]="notable";
resultados[2]="bien";
resultados[3]="suspenso";
String estado= "";

    for(i=0; i<2; i++){
        System.out.println("ingrese el nombre del "+(i+1)+"º alumno");
        nombres[i]= entrada.nextLine();
    
    } 
    
    for( i =0; i<2; i++){
        System.out.println("ingrese la nota del "+ (i+1)+"º  alumno");
        
        notas [i]= entrada.nextInt();
}
    for(i=0; i<2; i++){
        if(0<notas[i] && notas[i]<10.49){
          estado= resultados[3];}
        else if(10.50 <notas[i]&& notas[i]<13.9){
        estado= resultados[2];}
        
        else if(14 <notas[i]&& notas[i]<17.99){
            estado= resultados[1];
        }
        else if (18 < notas[i]&& notas[i]< 20){
            estado= resultados[0];
    }
     System.out.println("el elumno "+nombres[i]+" de nota "+notas[i]+ " tiene como resultado  "+ estado);   
    }

    
    
    
    
}
       
    
    
    
    
}
