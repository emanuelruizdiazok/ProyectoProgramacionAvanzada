package ar.edu.unlam.pb2.criaturas;

public abstract class Criatura {
	protected String nombre;
	protected int energia;
	protected Afinidad afinidad;
	protected boolean inestable;

	public Criatura(String nombre, int energia, Afinidad afinidad) {
		this.nombre = nombre;
		this.energia = energia;
		this.afinidad = afinidad;
		this.inestable = false;
	}

	public abstract void entrenar(); //SE VA A AGREGAR LA LOGICA DESPUES

	public abstract void pacificar();

	public String getNombre() {
		return nombre;
	}

	public int getEnergia() {
		return energia;
	}

	public Afinidad getAfinidad() {
		return afinidad;
	}

	public boolean esInestable() {
		return inestable;
	}

	public void setInestable(boolean inestable) {
		this.inestable = inestable;
	}

	public void modificarEnergia(int delta) {
		this.energia += delta;
		if (this.energia < 0)
			this.energia = 0;
	}
}