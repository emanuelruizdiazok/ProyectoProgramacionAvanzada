package ar.edu.unlam.pb2.criaturas;

public class AscensoDelViento extends Transformacion {

    public AscensoDelViento(Criatura original) {
        super(original);
    }

    @Override
    public void entrenar() {
        original.modificarEnergia(15);
    }

    @Override
    public void pacificar() {
        original.pacificar();
    }
}
