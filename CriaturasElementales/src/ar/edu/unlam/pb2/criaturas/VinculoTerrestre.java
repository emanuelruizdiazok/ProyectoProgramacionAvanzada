package ar.edu.unlam.pb2.criaturas;

public class VinculoTerrestre extends Transformacion {

    public VinculoTerrestre(Criatura original) {
        super(original);
    }

    @Override
    public void entrenar() {
        original.modificarEnergia(7);
    }

    @Override
    public void pacificar() {
        original.pacificar();
    }
}
