package dani;

/**
 * Representa el uso de sistemas de climatización.
 */
public class Climatizacion extends FuenteEmision {

    private double horasUso;

    public Climatizacion(double horasUso, double factorEmision, double costeUnitario) {
        super("Climatización", factorEmision, costeUnitario);
        this.horasUso = horasUso;
    }
