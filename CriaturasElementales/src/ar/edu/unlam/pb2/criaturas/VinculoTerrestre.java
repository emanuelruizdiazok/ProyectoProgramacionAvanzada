package ar.edu.unlam.pb2.criaturas;

public class VinculoTerrestre extends Transformacion {

    public VinculoTerrestre(Criatura original) {
        super(original);
    }

    @Override
    public void entrenar() {
        original.entrenar();
        if (original.getEnergia() < 50) {
            original.modificarEnergia(50 - original.getEnergia());
        }
    }

    @Override
    public void pacificar() {
        original.pacificar();
    }
}