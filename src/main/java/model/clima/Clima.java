package model.clima;

import java.util.Date;

public class Clima
{
    //Dia como string debido a la implementacion brindada por el enunciado, seria mas como que fuera Date.
    String dia;
    // La unidad como string por la implementacion brindada, yo huiera puesto un enum.
    String unidadTemperatura;
    int temperatura;
    int probbilidadPrecipitaciones;

    public Clima(String dia, String unidadTemperatura, int temperatura, int probabilidadPrecipitaciones)
    {
        this.dia=dia;
        this.unidadTemperatura=unidadTemperatura;
        this.temperatura=temperatura;
        this.probbilidadPrecipitaciones=probabilidadPrecipitaciones;
    }

}
