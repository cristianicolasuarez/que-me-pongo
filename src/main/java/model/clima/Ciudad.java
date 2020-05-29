package model.clima;

import java.util.List;

public class Ciudad
{
    String nombre;
    String pais;
    List<Clima> climas;

    public Ciudad(String nombre, String pais, List<Clima>climas)
    {
        this.nombre=nombre;
        this.pais=pais;
        this.climas=climas;
    }

    public List<Clima> getClimas() { return climas; }

    public String getNombre() { return nombre; }

    public String getPais() { return pais; }

    public void setClimas(Clima clima) { climas.add(clima); }

    public Clima obtenerClimaReciente(String dia)
    {
        /*
        Aca se deberia analizar segun alguna regla si existe algun clima guardado que sea reciente
        (por ejemplo 6 horas antes) para devolverlo y asi evitar que se hagan consultas extras al servicio externo
         */
        return null;
    }
}
