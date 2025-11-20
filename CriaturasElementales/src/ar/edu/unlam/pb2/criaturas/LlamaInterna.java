package ar.edu.unlam.pb2.criaturas;

public class LlamaInterna extends Transformacion {

    public LlamaInterna(Criatura original) {
        super(original);
    }

    @Override
    public void entrenar() {
        original.modificarEnergia(10);
    }

    @Override
    public void pacificar() {
        original.pacificar();
    }
}
