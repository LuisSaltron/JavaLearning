package com.lucho.curso.clase.abstracta;

public abstract class FiguraGeometrica {
	protected String tipoFigura;

	public FiguraGeometrica(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

	public abstract void dibujar();

	/**
	 * @return the tipoFigura
	 */
	public String getTipoFigura() {
		return tipoFigura;
	}

	/**
	 * @param tipoFigura the tipoFigura to set
	 */
	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FiguraGeometrica [tipoFigura=");
		builder.append(tipoFigura);
		builder.append("]");
		return builder.toString();
	}
}
