package examenfinalparte2;

import javax.swing.JOptionPane;
/**
 * 
 * @author ngarciacarrillo
 * @version 06/06/2016-1
 */
public class ExamenFinalParte2 {
   /**
    * @param p Es un boolean que por defecto es false
    */
    public static boolean comprobar = false;

    public static void main(String arg[]) {
   /**
    * @param numTeclado1 Numero solicitado por pantalla
    * @param numTeclado2 Numero solicitado por pantalla
    */
        int numTeclado1 = Integer.parseInt (JOptionPane.showInputDialog("Ingresa un numero"));
        int numTeclado2 = Integer.parseInt (JOptionPane.showInputDialog("Ingresa otro numero"));
        
    /**
     * comprobamos que el numero introducido por pantalla no sea menor que 0
     */
        if (numTeclado1 <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        
        for (int numero = 1; numero <= 99999; numero++) {
            int aux = numero;
            int contador = 0;

            while (aux != 0) {
                aux = aux / 10;
                contador++;
            }
            /**
             * @param numteclado2 se iguala el segundo numero introducido por 
             * pantalla al contador
             */
            
            numTeclado2 = contador;

       
            if (numTeclado2 == numTeclado1) {
                if (numero < 4) {
                    comprobar = true;
                } else {
                    if (numero % 2 == 0) {
                        comprobar = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int k = (numero - 1) / 2;
                        if (k % 2 == 0) {
                            k--;
                        }

                        while (i1 <= k) {
                            if (numero % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = k + 1;
                            }
                        }

                        if (contador1 == 1) {
                            comprobar = true;
                        }
                    }
                }

                if (comprobar == true) {
                    System.out.println(numero);
                }
            }
        }
    }

}
