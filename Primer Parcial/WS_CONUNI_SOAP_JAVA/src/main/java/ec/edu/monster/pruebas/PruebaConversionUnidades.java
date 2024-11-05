/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.monster.pruebas;

import ec.edu.monster.servicios.ConversionUnidadesServicio;

/**
 *
 * @author EL NACIONAL
 */
public class PruebaConversionUnidades {
      public static void main(String[] args) {
        //DATOS
        float pulgadas=1.0f;
        float centimetros=1.0f;
        //PROCESO
        ConversionUnidadesServicio service = new ConversionUnidadesServicio();
        float pulgadasConvertidas = service.centimetrosAPulgadas(centimetros);
        float centimetrosConvertidos = service.pulgadasACentimetros(pulgadas);
        //REPORTE
                //REPORTE
        System.out.println("centimetro: "+centimetros);
        System.out.println("pulgadas: "+pulgadas);
        System.out.println("Centimetros convertidos a pulgadas: "+pulgadasConvertidas);
        System.out.println("Pulgadas convertidas a acentimetros: "+centimetrosConvertidos);
    }

}
