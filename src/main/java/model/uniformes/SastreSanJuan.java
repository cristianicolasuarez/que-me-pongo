package model.uniformes;

import model.Atuendos.Borrador;
import model.Atuendos.Color;
import model.Atuendos.Material;
import model.Atuendos.Prenda;
import model.Atuendos.TipoPrenda;

public class SastreSanJuan implements Sastre {
	@Override
	public Prenda fabricarParteSuperior() {		
		return new Borrador(TipoPrenda.CHOMBA)
				.especificarMaterial(Material.PIQUE)
				.especificarColorPrimario(new Color(0, 143, 57))
				.crearPrenda();
	}

	@Override
	public Prenda fabricarParteInferior() {
		return new Borrador(TipoPrenda.PANTALON)
				.especificarMaterial(Material.ACETATO)
				.especificarColorPrimario(new Color(130, 130, 130))
				.crearPrenda();
	}

	@Override
	public Prenda fabricarCalzado() {
		return new Borrador(TipoPrenda.ZAPATILLA)
				.especificarMaterial(Material.CUERINA)
				.especificarColorPrimario(new Color(255, 255, 255))
				.crearPrenda();
	}
}
