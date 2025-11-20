package ar.edu.unlam.pb2.criaturas;

public class CriaturaSalvaje extends Criatura {

    public CriaturaSalvaje(String nombre, Integer energia, Afinidad afinidad) {
        super(nombre, energia, afinidad);
    }

    @Override
    public void entrenar() {
        if (energia + 30 > 200) {
            throw new EnergiaExcedidaException("La energía excede el máximo permitido para una criatura salvaje.");
        }
        modificarEnergia(30);
    }

    @Override
    public void pacificar() {
        this.inestable = false;
        modificarEnergia(-20);
    }
}
