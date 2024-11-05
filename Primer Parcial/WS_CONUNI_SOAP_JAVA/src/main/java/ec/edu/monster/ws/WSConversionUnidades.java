/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ec.edu.monster.ws;

import ec.edu.monster.servicios.ConversionUnidadesServicio;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 * 
 * @author EL NACIONAL
 */
@WebService(serviceName = "WSConversionUnidades")
public class WSConversionUnidades {

    /** 
     * This is a sample web service operation
     */
      @WebMethod(operationName = "centimetrosAPulgadas")
    public float centimetrosAPulgadas(@WebParam(name = "centimetros") float centimetros) {
        ConversionUnidadesServicio conversionUnidades = new ConversionUnidadesServicio();
        float pulgadasConvertido = conversionUnidades.centimetrosAPulgadas(centimetros);
        return pulgadasConvertido;
    }

    @WebMethod(operationName = "pulgadasACentimetros")
    public float pulgadasACentimetros(@WebParam(name = "pulgadas") float pulgadas) {
        ConversionUnidadesServicio conversionUnidades = new ConversionUnidadesServicio();
        float centimetrosConvertido = conversionUnidades.pulgadasACentimetros(pulgadas);
        return centimetrosConvertido;
    }

}
