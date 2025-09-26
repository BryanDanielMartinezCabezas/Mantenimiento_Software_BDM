<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Registrar Persona</title>
</head>
<body>
    <h1>Formulario de Registro</h1>
    <form action="/personas" method="POST">
        @csrf <label for="nombres">Nombres:</label><br>
        <input type="text" id="nombres" name="nombres" required><br><br>

        <label for="apellidos">Apellidos:</label><br>
        <input type="text" id="apellidos" name="apellidos" required><br><br>

        <label for="correo">Correo:</label><br>
        <input type="email" id="correo" name="correo" required><br><br>

        <label for="sexo">Sexo:</label><br>
        <input type="text" id="sexo" name="sexo" required><br><br>

        <button type="submit">Registrar</button>
    </form>
</body>
</html>