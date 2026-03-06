package dani;

/**
 * Clase abstracta que representa una fuente de emisión de CO2.
 * Define el comportamiento común para todas las fuentes.
 */
public abstract class FuenteEmision {

    protected String descripcion;
    protected double factorEmision;
    protected double costeUnitario;

    /**
     * Constructor base.
     */
    public FuenteEmision(String descripcion, double factorEmision, double costeUnitario) {
        this.descripcion = descripcion;
        this.factorEmision = factorEmision;
        this.costeUnitario = costeUnitario;
    }

    /**
     * Calcula las emisiones de CO2.
     * @return toneladas de CO2 emitidas
     */
    public abstract double calcularEmisiones();

    /**
     * Calcula el coste económico asociado.
     * @return coste en euros
     */
    public abstract double calcularCoste();
}