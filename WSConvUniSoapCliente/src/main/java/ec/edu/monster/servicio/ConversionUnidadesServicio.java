/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.monster.servicio;

/**
 *
 * @author EL NACIONAL
 */
public class ConversionUnidadesServicio {

    public float centimetrosAPulgadas(float centimetros) {
        ec.edu.monster.ws.WSConversionUnidades_Service service = new ec.edu.monster.ws.WSConversionUnidades_Service();
        ec.edu.monster.ws.WSConversionUnidades port = service.getWSConversionUnidadesPort();
        return port.centimetrosAPulgadas(centimetros);
    }

    public float pulgadasACentimetros(float pulgadas) {
        ec.edu.monster.ws.WSConversionUnidades_Service service = new ec.edu.monster.ws.WSConversionUnidades_Service();
        ec.edu.monster.ws.WSConversionUnidades port = service.getWSConversionUnidadesPort();
        return port.pulgadasACentimetros(pulgadas);
    }


}

