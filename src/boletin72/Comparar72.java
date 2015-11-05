
package boletin72;

import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Comparar72 {
    
    public short pedirNumero(){
        short num;
        String res=JOptionPane.showInputDialog("Introduce o número");
        num=Short.parseShort(res);
        return num;
    }
    public void compararNumeros (short num1, short num2){
        if (num1>=num2)
            System.out.println("O resultado da resta é: "+(num1-num2)+" e a suma é: "+(num1+num2));
        else
            System.out.println("O resultado da suma é: "+(num1+num2));
    }
}
