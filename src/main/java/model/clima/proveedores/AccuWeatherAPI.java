package model.clima.proveedores;

import model.clima.Ciudad;
import model.clima.Clima;
import model.clima.UnidadTemperatura;

import java.util.*;

public final class AccuWeatherAPI implements ProveedorClima
{
    public final List<Map<String, Object>> getWeather(String ciudad)
    {
        //Se supone que esta implementacion en realdad utiliza un servicio externo que a partir del decimo
        //llamado diario cuesta dinero, por ello guardo el clima consultado en la ciudad
        return Arrays.asList(new HashMap<String, Object>() {{
            put("DateTime", "2019-05-03T01:00:00-03:00");
            put("EpochDateTime", 1556856000);
            put("WeatherIcon", 33);
            put("IconPhrase", "Clear");
            put("IsDaylight", false);
            put("PrecipitationProbability", 0);
            put("MobileLink", "http://m.accuweather.com/en/ar/villa-vil/7984/");
            put("Link", "http://www.accuweather.com/en/ar/villa-vil/7984");
            put("Temperature", new HashMap<String, Object>(){{
                put("Value", 57);
                put("Unit", "F");
                put("UnitType", 18);
            }});
        }});
    }

    public Clima obtenerClima(Ciudad ciudad)
    {
        //Aqui consultare si hay un clima de la ciudad ya obtenido previamente, para no utilizar una oportunidad mas
        //del servicio pago.
        Clima climaReciente=ciudad.obtenerClimaReciente("HOY-AHORA");
        if (climaReciente==null)
        {
            return climaReciente;
        }
        else
        {
            List<Map<String, Object>> condicionesClimaticas=this.getWeather(ciudad.getNombre()+", "+ciudad.getPais());
            Clima clima=new Clima(condicionesClimaticas.get(0).get("DateTime").toString(),
                    condicionesClimaticas.get(0).get("Unit").toString(),
                    condicionesClimaticas.get(0).get("Value").hashCode(),
                    condicionesClimaticas.get(0).get("PrecipitationProbability").hashCode());
            //Una vez consultado el clima al servicio externo lo almaceno para futuras consultas.
            ciudad.setClimas(clima);
            return clima;
        }

    }
}
