package model;

import model.Atuendos.Prenda;
import model.clima.Ciudad;

import java.util.List;

public class Usuario
{
    String nombre;
    Ciudad ciudad;
    List<Prenda> prendas;

    public Usuario(String nombre, Ciudad ciudad, List<Prenda> prendas)
    {
        this.nombre=nombre;
        this.ciudad=ciudad;
        this.prendas=prendas;
    }

    public Ciudad getCiudad() { return ciudad; }
}
