
package boletin72;

/**
 *
 * @author miglezlor
 */
public class Boletin72 {


    public static void main(String[] args) {

        short num1, num2;
        Comparar72 obx= new Comparar72();
        num1=obx.pedirNumero();
        num2=obx.pedirNumero();
        
        obx.compararNumeros(num1, num2);
    }
    
}
