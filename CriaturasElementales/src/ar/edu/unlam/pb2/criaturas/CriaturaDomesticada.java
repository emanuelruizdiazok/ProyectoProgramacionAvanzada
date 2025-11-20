package ar.edu.unlam.pb2.criaturas;

public class CriaturaDomesticada extends Criatura {

    public CriaturaDomesticada(String nombre, Integer energia, Afinidad afinidad) {
        super(nombre, energia, afinidad);
    }

    @Override
    public void entrenar() {
        modificarEnergia(20);
    }

    @Override
    public void pacificar() {
        this.inestable = false;
    }
}
