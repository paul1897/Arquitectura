/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ec.monster.clienteWeb;

import ec.edu.monster.ws.WSConversionUnidades;
import ec.edu.monster.ws.WSConversionUnidades_Service;
import edu.ec.monster.servicio.ConversionUnidadesServicio;
import java.util.Scanner;
/**
 *
 * @author EL NACIONAL
 */
public class ClienteConversionUnidades {

private static final String USERNAME = "MasterMonster";
    private static final String PASSWORD = "Monster9";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar credenciales al usuario
        if (!login(scanner)) {
            return;
        }
        // Crear un objeto del servicio
        WSConversionUnidades_Service service = new WSConversionUnidades_Service();
        WSConversionUnidades port = service.getWSConversionUnidadesPort(); 
        int opcion;
        do {
            // Menú
            System.out.println("---- Menú de Conversión de Unidades ----");
            System.out.println("1. Convertir centímetros a pulgadas");
            System.out.println("2. Convertir pulgadas a centímetros");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor en centímetros: ");
                    float centimetros = scanner.nextFloat();
                    float pulgadasConvertidas = port.centimetrosAPulgadas(centimetros);
                    System.out.println("Centímetros convertidos a pulgadas: " + pulgadasConvertidas);
                    break;
                case 2:
                    System.out.print("Ingrese el valor en pulgadas: ");
                    float pulgadas = scanner.nextFloat();
                    float centimetrosConvertidos = port.pulgadasACentimetros(pulgadas);
                    System.out.println("Pulgadas convertidas a centímetros: " + centimetrosConvertidos);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
            System.out.println();
        } while (opcion != 3);
        scanner.close();
    }
    private static boolean login(Scanner scanner) {
        while (true) {
            System.out.print("Ingrese el nombre de usuario: ");
            String username = scanner.next();
            System.out.print("Ingrese la contraseña: ");
            String password = scanner.next();
            if (!USERNAME.equals(username)) {
                System.out.println("Usuario incorrecto. Inténtalo de nuevo.");
            } else if (!PASSWORD.equals(password)) {
                System.out.println("Contraseña incorrecta. Inténtalo de nuevo.");
            } else {
                return true;
            }
        }
    }
}
