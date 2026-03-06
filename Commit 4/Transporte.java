package proyecto;

/**
 * Representa el consumo de combustible en transporte.
 */
public class Transporte extends FuenteEmision {
    
    private double litrosCombustible;
    
    /**
     * Constructor Transporte
     * @param litrosCombustible Litros de combustible consumidos
     * @param factorEmision El factor de emision
     * @param costeUnitario El coste unitario
     */
    public Transporte(double litrosCombustible, double factorEmision, double costeUnitario) {
        super("Transporte", factorEmision, costeUnitario);
        this.litrosCombustible = litrosCombustible;
    }

    /**
     * Metodo para calcular emisiones basadas en el combustible
     * @return El total de emisiones por consumo de combustible
     */
    @Override
    public double calcularEmisiones() {
        // Multiplicar los litros por el factor de emision
        return litrosCombustible * factorEmision;
    }

    /**
     * Metodo que calcula el coste del combustible consumido
     * @return El coste total del transporte
     */
    @Override
    public double calcularCoste() {
        // Calcular el coste total multiplicando litros por coste unitario
        return litrosCombustible * costeUnitario;
    }
}