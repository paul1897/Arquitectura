/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.monster.pruebas;

import ec.edu.monster.servicio.ConversionUnidadesServicio;

/**
 *
 * @author EL NACIONAL
 */
public class PruebaConversionUnidadesServicio {
     public static void main(String[] args) {
                // TODO code application logic here
        ConversionUnidadesServicio servicio = new ConversionUnidadesServicio();
        
        float centimetro = 1.0f;
        float pulgada=1.0f;
        
        float pulgadaConvertido  = servicio.centimetrosAPulgadas(centimetro);
        System.out.println("Centimetro: "+centimetro+"/ Centimetro convertido a pulgada: "+ pulgadaConvertido);
        
        float centimetroConvertido  = servicio.pulgadasACentimetros(pulgada);
        System.out.println("Pulgada: "+pulgada+"/ Pulgada convertida a centimetro: "+ centimetroConvertido);
        
    }


}
