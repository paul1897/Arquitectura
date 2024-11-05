<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - Conversor de Unidades</title>
    <style>
        body {
            font-family: Arial, sans-serif;
 background-color: #87CEEB; /* Fondo celeste */
 margin: 0;
            padding: 0; /* Cambiado para evitar problemas de espacio */
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh; /* Ocupa toda la altura de la ventana */
        }
        h2 {
            text-align: center;
            color: #333;
        }
        .container {
            max-width: 800px;
            width: 100%;
            background: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            text-align: center;
        }
        img {
            max-width: 100%; /* Mantiene la imagen responsive */
            height: auto;
            margin-bottom: 20px; /* Reduce el margen inferior para mejor visualización */
            border-radius: 8px;
            width: 80%; /* Aumenta el tamaño de la imagen */
        }
        label {
            display: block;
            margin: 10px 0 5px;
            text-align: left;
        }
        input[type="text"],
        input[type="password"] {
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
            width: 100%;
        }
        input[type="submit"]:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>
    <div class="container">
        <img src="https://prod-ripcut-delivery.disney-plus.net/v1/variant/disney/DB00AD90E63015033C355269A0C0AD3A2D716C6B70ACDBACD7E172B7E13F5CBE/scale?width=1200&aspectRatio=1.78&format=webp" alt="Descripción de la imagen">
        <h2>Iniciar Sesión</h2>
        <form action="loginservlet.jsp" method="post">
            <label for="username">Usuarios:</label>
            <input type="text" id="username" name="username" required>
            <label for="password">Contraseña:</label>
            <input type="password" id="password" name="password" required>
            <input type="submit" value="Entrar">
        </form>
    </div>
</body>
</html>
