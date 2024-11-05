<%@ page import="ec.edu.monster.ws.WSConversionUnidades" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="javax.xml.namespace.QName" %>
<%@ page import="javax.xml.ws.Service" %>
<%@ page import="java.net.URL" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Conversor de Unidades</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #87CEEB; /* Fondo celeste */
            margin: 0;
            padding: 20px;
            color: #333;
        }
        h2 {
            color: #2c3e50;
        }
        .container {
            max-width: 600px;
            margin: auto;
            background: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            text-align: center;
        }
        .image-container {
            margin-bottom: 20px;
        }
        img {
            max-width: 100%;
            border-radius: 8px;
        }
        form {
            margin-top: 20px;
        }
        label {
            display: block;
            margin: 10px 0 5px;
        }
        input[type="number"] {
            width: calc(100% - 22px);
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="submit"] {
            background-color: #3498db;
            color: white;
            border: none;
            padding: 10px 15px;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background-color: #2980b9;
        }
        .result {
            margin-top: 20px;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="image-container">
            <img src="https://prod-ripcut-delivery.disney-plus.net/v1/variant/disney/DB00AD90E63015033C355269A0C0AD3A2D716C6B70ACDBACD7E172B7E13F5CBE/scale?width=1200&aspectRatio=1.78&format=webp" alt="Descripción de la imagen">
        </div>
        <h2>Bienvenido al Conversor de Unidades</h2>
        
        <form method="post">
            <h3>Centímetros a Pulgadas</h3>
            <label for="centimetros">Centímetros:</label>
            <input type="number" id="centimetros" name="centimetros" step="any" placeholder="Ingrese centímetros">
            
            <h3>Pulgadas a Centímetros</h3>
            <label for="pulgadas">Pulgadas:</label>
            <input type="number" id="pulgadas" name="pulgadas" step="any" placeholder="Ingrese pulgadas">
            
            <input type="submit" value="Convertir">
        </form>

        <%
            // Procesar el formulario al enviar
            String cmStr = request.getParameter("centimetros");
            String inStr = request.getParameter("pulgadas");
            float result = 0.0f; // Usar float

            try {
                URL url = new URL("http://localhost:8080/WS_CONUNI_SOAP_JAVA/WSConversionUnidades?wsdl");
                QName qname = new QName("http://ws.monster.edu.ec/", "WSConversionUnidades");
                Service service = Service.create(url, qname);
                WSConversionUnidades port = service.getPort(WSConversionUnidades.class);
                
                // Convertir de centímetros a pulgadas
                if (cmStr != null && !cmStr.isEmpty()) {
                    float centimetros = Float.parseFloat(cmStr); // Convertir a float
                    result = port.centimetrosAPulgadas(centimetros);
                    out.println("<div class='result'>" + centimetros + " cm = " + result + " pulgadas</div>");
                }

                // Convertir de pulgadas a centímetros
                if (inStr != null && !inStr.isEmpty()) {
                    float pulgadas = Float.parseFloat(inStr); // Convertir a float
                    result = port.pulgadasACentimetros(pulgadas);
                    out.println("<div class='result'>" + pulgadas + " pulgadas = " + result + " cm</div>");
                }
            } catch (Exception e) {
                e.printStackTrace();
                out.println("<div class='result'>Error al consumir el servicio: " + e.getMessage() + "</div>");
            }
        %>
    </div>
</body>
</html>
