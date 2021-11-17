/**
Clase que exhibe el funcionamiento del paso de parametros en los metodos de Java por medio de ejemplos.
@author Raudry_Rico_Emilio_Arsenio
@version 1.0
*/
public class Parametros {
    /**
     Metodo main el cual permite ejecutar el programa.
     @param String[] Argumentos.
     */
    public static void main(String[] args){
	int numero = 5; //Declaracion e inicializacion de primitivo.
	int[] sucesion; //Declaracion de un array de enteros.
	sucesion = new int[]{0, 1, 2, 3, 4}; //Contenido del array de enteros
     
	System.out.println("\nValor original de la variable numero: " + numero); //Imprimimos el valor original del primitivo.
	System.out.println("\nRegreso del paso por valor: " + sucesor(numero)); //Ejecutamos el metodo sucesor en el primitivo.
	System.out.println("\nValor original de la variable numero tras el paso por valor: " + numero); //Imprimimos nuevamente el valor del primitivo, el cual es el mismo, mostrando el funcionamiento del Paso por Valor.
	numero = sucesor(numero);
	System.out.println("\nValor alterado de la variable numero: " + numero); //Modificacion del primitivo original al asignarle este el valor obtenido del metodo sucesor.
	
	System.out.println("\nValores originales del arreglo: \n"); //Imprimimos los valores del array original.
	for(int j=0; j<sucesion.length; j++){
	    System.out.println(sucesion[j]);
	}
	
	incrementar(sucesion); //Ejecutamos el metodo incrementar, para alterar cada elemento del array por su sucesor.

	System.out.println("\nValores del arreglo tras el Paso por Referencia: \n"); //Imprimimos nuevamente los valores del array, pero con los valores alterados por el metodod incrementar, exhibiendo el funcionamiento del Paso por Referencia
	for(int j=0; j<sucesion.length; j++){
	    sucesion[j] = sucesor(sucesion[j]);
	    System.out.println(sucesion[j]);
	}
    }
    /**
     Metodo que permite obtener el sucesor de un entero.
     @param numero Entero al cual sacar su sucesor.
     @return int Sucesor de numero.
     */
    public static int sucesor(int numero){
	return numero + 1;
    }

    /**
     Metodo que altera cada entero del arreglo por su sucesor.
     @param sucesion Arreglo de enteros. 
     */
    public static void incrementar(int[] sucesion){
	for(int i=0; i<sucesion.length; i++){
	    sucesion[i] = sucesor(sucesion[i]);
	}
    }
}
