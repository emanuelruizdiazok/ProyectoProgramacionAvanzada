package ar.edu.unlam.pb2.criaturas;

public class BendicionDelRio extends Transformacion {

    public BendicionDelRio(Criatura original) {
        super(original);
    }

    @Override
    public void entrenar() {
        original.modificarEnergia(5);
    }

    @Override
    public void pacificar() {
        original.pacificar();
    }
}
