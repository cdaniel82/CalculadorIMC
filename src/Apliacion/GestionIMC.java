package Apliacion;

import Libreria.IMC;

public class GestionIMC {
    public static void main(String[] args){
        float estatura = 1.73F;
        float peso = 93;
        
        IMC i = new IMC();
        i.setAltura(estatura);
        i.setPeso(peso);
        
        mostarDatosIMC(i);
        System.out.println("Su IMC es: " + i.obtenerIMC(estatura, peso));
        System.out.println("Su Clasificacion es: " + i.obtenerClasificacion());
    }
    
    public static void mostarDatosIMC(IMC i){
        System.out.println(i.obtenerDatos());
    }
}
