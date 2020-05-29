package model.clima.proveedores;

import model.clima.Ciudad;
import model.clima.Clima;

public class ProveedorTest implements ProveedorClima
{
    public Clima obtenerClima(Ciudad ciudad)
    {
        return new Clima("Hoy-Ahora", "C", 26,0 );
    }
}

