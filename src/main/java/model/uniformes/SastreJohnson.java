package model.uniformes;

import model.Atuendos.Borrador;
import model.Atuendos.Color;
import model.Atuendos.Material;
import model.Atuendos.Prenda;
import model.Atuendos.TipoPrenda;

public class SastreJohnson implements Sastre {
	@Override
	public Prenda fabricarParteSuperior() {		
		return new Borrador(TipoPrenda.CAMISA)
				.especificarMaterial(Material.ALGODON)
				.especificarColorPrimario(new Color(255, 255, 255))
				.crearPrenda();
	}

	@Override
	public Prenda fabricarParteInferior() {
		return new Borrador(TipoPrenda.PANTALON)
				.especificarMaterial(Material.LINO)
				.especificarColorPrimario(new Color(0, 0, 0))
				.crearPrenda();
	}

	@Override
	public Prenda fabricarCalzado() {
		return new Borrador(TipoPrenda.ZAPATO)
				.especificarMaterial(Material.CUERO)
				.especificarColorPrimario(new Color(0, 0, 0))
				.crearPrenda();
	}
}
