package ar.edu.unlam.pb2.criaturas;

public class LlamaInterna extends Transformacion {

    public LlamaInterna(Criatura original) {
        super(original);
    }

    @Override
    public void entrenar() {
        if (original.getAfinidad() == Afinidad.FUEGO) {
            original.modificarEnergia(30);
        } else {
            original.setInestable(true);
        }
    }

    @Override
    public void pacificar() {
        original.pacificar();
    }
}