package com.endes;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ControladorDNI controlador = new ControladorDNI();
        
        boolean esValido1 = controlador.esValido("81440286T");
        System.out.println("81440286T -->" + esValido1 );
        
        boolean esValido2 = controlador.esValido("81440286R");
        System.out.println("81440286R -->" + esValido2 );
        
        String dniAleatorio = controlador.generarAleatorioDNI();
        System.out.println("DNI generado aleatoriamente " + dniAleatorio);
        
        boolean esValido3 = controlador.esValido("02325204L");
        System.out.println("02325204L -->" + esValido3 );
        
    }
}
