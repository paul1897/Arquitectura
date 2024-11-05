/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.monster.servicios;

/**
 *
 * @author EL NACIONAL
 */
public class ConversionUnidadesServicio {
    
    
    public float centimetrosAPulgadas(float centimetro){
        return (centimetro/2.54f);
    }
    public float pulgadasACentimetros(float pulgada){
        return (pulgada*2.54f);
    }
}
