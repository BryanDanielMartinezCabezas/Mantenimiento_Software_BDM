<?php

namespace App\Http\Controllers;

use App\Models\Persona;
use Illuminate\Http\Request;

class PersonaController extends Controller
{
    // Muestra el formulario de creación
    public function create()
    {
        return view('personas.create');
    }

    // Almacena una nueva persona en la base de datos
    public function store(Request $request)
    {
        // Validación simple
        $request->validate([
            'nombres' => 'required|string|max:255',
            'apellidos' => 'required|string|max:255',
            'correo' => 'required|email|unique:personas',
            'sexo' => 'required|string',
        ]);

        // Crea la persona
        Persona::create($request->all());
        
        // Retorna una respuesta exitosa. 
        // Para JMeter, un 201 es ideal.
        return response('Persona registrada', 201);
    }
}