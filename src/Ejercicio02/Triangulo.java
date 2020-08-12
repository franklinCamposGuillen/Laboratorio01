
package Ejercicio02;

public class Triangulo {
int lado1;
int lado2;
int lado3;
    
public static int PerimetroTriangulo(int l1,int l2,int l3){
int perimetro= l1+l2+l3;

return  perimetro;    
}   
 
public static double AreaTriangulo(int l1,int l2, int l3 ){

double area;
int semiperimetro = (l1+l2+l3)/2;
area = Math.sqrt(semiperimetro*(semiperimetro-l1)*(semiperimetro-l2)*(semiperimetro-l3));

return area;
}        
    
}
