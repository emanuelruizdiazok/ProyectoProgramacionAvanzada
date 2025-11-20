package ar.edu.unlam.pb2.criaturas;

public class CriaturaAncestral extends Criatura {

    public CriaturaAncestral(String nombre, Integer energia, Afinidad afinidad) {
        super(nombre, energia, afinidad);
    }

    @Override
    public void entrenar() {
        modificarEnergia(50);
    }

    @Override
    public void pacificar() {
        this.inestable = false;
        modificarEnergia(10);
    }
}

