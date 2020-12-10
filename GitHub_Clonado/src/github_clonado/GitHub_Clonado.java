
package github_clonado;

public class GitHub_Clonado {


    public static void main(String[] args) {
     int metodosuma;
     int metodomultiplicacion;
     
      metodomultiplicacion = multiplicacion(8,2);   
      metodosuma = suma(6,3);
        System.out.println("El resultado de la multiplicacion es: "+metodomultiplicacion);
         System.out.println("El resultado de la multiplicacion es: "+metodosuma);
    }
    
     public static int multiplicacion (int a, int b){
        int resultado;
        resultado = a * b;
        return resultado;
    }
    
    public static int suma (int a, int b){
        int resultado;
        resultado = a + b;
        return resultado;


}
}

