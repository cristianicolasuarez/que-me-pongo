package model.clima.proveedores;

import model.clima.Ciudad;
import model.clima.Clima;

import java.util.Date;

public interface ProveedorClima
{
    public Clima obtenerClima(Ciudad ciudad);
}
