package ar.edu.unlam.pb2.criaturas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MaestroElemental {

	private String nombre;
	private Integer nivelDeMaestria;
	private Afinidad afinidad;
	private Map<String, Criatura> criaturas;

	public MaestroElemental(String nombre, Integer nivelDeMaestria, Afinidad afinidad) {
		this.nombre = nombre;
		this.nivelDeMaestria = nivelDeMaestria;
		this.afinidad = afinidad;
		this.criaturas = new HashMap<>();
	}

	public void agregarCriatura(Criatura criatura) {
		this.criaturas.put(criatura.getNombre(), criatura);
	}

	public void entrenar(String nombreCriatura) throws FaltaDeMaestriaException {
		Criatura criatura = criaturas.get(nombreCriatura);
		if (criatura == null)
			return;

		if (this.nivelDeMaestria < 10) {
			throw new FaltaDeMaestriaException("Nivel de maestría insuficiente para entrenar la criatura.");
		}

		criatura.entrenar();
	}

	public void pacificar(String nombreCriatura) {
		Criatura criatura = criaturas.get(nombreCriatura);
		if (criatura != null) {
			criatura.pacificar();
		}
	}

	public Criatura getCriatura(String nombre) {
		return this.criaturas.get(nombre);
	}

	public Integer getNivelDeMaestria() {
		return this.nivelDeMaestria;
	}

	public String getNombre() {
		return this.nombre;
	}

	public Afinidad getAfinidad() {
		return this.afinidad;
	}

	public List<Criatura> getCriaturasRegistradas() {
		return new ArrayList<>(this.criaturas.values());
	}
}