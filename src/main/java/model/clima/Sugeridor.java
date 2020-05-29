package model.clima;

import model.Atuendos.Atuendo;
import model.Atuendos.Prenda;
import model.clima.proveedores.ProveedorClima;

import java.util.List;

public class Sugeridor
{
    private static ProveedorClima unProveedor;

    private static final Sugeridor instance = new Sugeridor();

    private Sugeridor() {}

    public static Sugeridor getInstance() { return instance; }

    public static  void setearProveedor(ProveedorClima nuevoProveedor)
    { unProveedor=nuevoProveedor; }

    List<Atuendo> obtenerSugerenciasAtuendo(List<Prenda> prendas, Ciudad unaCiudad)
    {
        //Primero obtengo el clima de la ciudad en cuestrion donde vive el usuario o en donde usara el atuendo
        Clima unClima=unProveedor.obtenerClima(unaCiudad);
        //Aca deberia filtrat las prendas aptas para el clima de la ciudad.
        //De momento el usuario debera informar que prendas tiene disponibles.
        //Agrupara las sugerencias en atuendos (que son varias prendas, POR AHORA UNA DE CADA TIPO, pero puede cambiar.
        return null;

    }
}
