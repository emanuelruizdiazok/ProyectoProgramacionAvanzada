package ar.edu.unlam.pb2.criaturas;

public abstract class Transformacion extends Criatura {
    protected Criatura original;

    public Transformacion(Criatura original) {
        super(original.getNombre(), original.getEnergia(), original.getAfinidad());
        this.original = original;
    }

    @Override
    public abstract void entrenar();

    @Override
    public abstract void pacificar();
}