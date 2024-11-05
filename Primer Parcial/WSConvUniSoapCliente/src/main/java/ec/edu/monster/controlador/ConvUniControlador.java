/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.monster.controlador;

import ec.edu.monster.servicio.ConversionUnidadesServicio;

/**
 *
 * @author EL NACIONAL
 */
public class ConvUniControlador {
    
    public float convertirCentimetrosAPulgadas(float centimetros){
        ConversionUnidadesServicio servicio = new ConversionUnidadesServicio(); 
        return servicio.centimetrosAPulgadas(centimetros);
    } 
    public float convertirPulgadasACentimetros(float pulgadas){
      ConversionUnidadesServicio servicio = new ConversionUnidadesServicio(); 
        return servicio.pulgadasACentimetros(pulgadas);
    }

} 
