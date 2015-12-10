package boletin11;

import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class Boletin11 {


    public static void main(String[] args) {
        long TInicio, TFinal = 0, tiempo;
        TInicio= System.currentTimeMillis();
        JOptionPane.showInputDialog("ESCRIBE A SEGUINTE MENSAXE: A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática.");
        TFinal= System.currentTimeMillis();
        tiempo= (TFinal-TInicio)/1000;
        System.out.println("Tiempo que tardaste en segundos: " +tiempo);
    }
    
}