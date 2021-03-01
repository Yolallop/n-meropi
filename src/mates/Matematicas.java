package mates;



/**
 * declaracion de la clase Matematicas
 * @author Yolanda Llop
 */
public class Matematicas{

	/**
	 * Método para calcular el numero pi 
	 * @param 
	 */
	public static void calcularPi(int dardos) {

		/**
		 *Inicializar pi, zona interior del circulo, zona ecterioir de circulo que en este caso es una parte del cuadrado
		 */

		double pi = 0;
		double interior = 0;
		double exterior = 0;
	
		
		//genera coordenadas, pi, cada dardo
		
	for( int i=0 ; i<= dardos; i++) {
		double x = Math.random()*1; //generar coordenadas x
		double y = Math.random()*1; // generar cordenadas y 
		/**
		 *Se realiza pitagoras ya que al hacer un cuarto de un cuadrant, y el valor que da es el mismo para valor parancada sitio el radio tiene que ser menor o igual a 1  
		 */

		if((Math.pow(x,2) + (Math.pow(y,2)))<=1) {
			
			interior+=1; 
		}
		/**
		 * En el caso del que el radio sea mayor que 1 genera el else
		 */

		else exterior+=1;
			
			
		}
		/**
		 * 
		 */

	pi = (4* interior)/dardos;
	System.out.println(pi);

			
			
		}
}
