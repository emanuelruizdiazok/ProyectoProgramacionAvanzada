package ar.edu.unlam.pb2.criaturas;

public class BendicionDelRio extends Transformacion {

    public BendicionDelRio(Criatura original) {
        super(original);
    }

    @Override
    public void entrenar() {
        Integer energiaActual = original.getEnergia();
        Integer energiaDuplicada = energiaActual * 2;
        if (energiaDuplicada > 180) {
            energiaDuplicada = 180;
        }
        original.modificarEnergia(energiaDuplicada - energiaActual);
    }

    @Override
    public void pacificar() {
        original.pacificar();
    }
}