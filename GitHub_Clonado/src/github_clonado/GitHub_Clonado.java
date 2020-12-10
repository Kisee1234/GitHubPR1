
package github_clonado;

public class GitHub_Clonado {


    public static void main(String[] args) {
     int metodosuma;
     int metodomultiplicacion;
     
      metodomultiplicacion = multiplicacion(8,2);   
      metodosuma = suma(6,3);
        System.out.println("El resultado de la multiplicacion es: "+metodomultiplicacion);
    }
    
     public static int multiplicacion (int a, int b){
        int resultado;
        resultado = a * b;
        return resultado;
    }
    
    public static int metodosuma (int a, int b){
        int resultado;
        resultado = a + b;
        return resultado;


}
}

