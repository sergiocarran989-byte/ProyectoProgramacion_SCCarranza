package proyecto;

/**
 * Representa el uso de sistemas de climatización.
 */
public class Climatizacion extends FuenteEmision {

    private double horasUso;

    /**
     * Constructor Climatizacion
     * @param horasUso Horas de uso de la climatizacion
     * @param factorEmision El factor de emision
     * @param costeUnitario El coste unitario
     */
    public Climatizacion(double horasUso, double factorEmision, double costeUnitario) {
        super("Climatización", factorEmision, costeUnitario);
        this.horasUso = horasUso;
    }

    /**
     * Metodo para calcular las emisiones de climatizacion
     * @return El total de emisiones segun las horas de uso
     */
    @Override
    public double calcularEmisiones() {
        // Multiplicar las horas de uso por el factor de emision asignado
        return horasUso * factorEmision;
    }

    /**
     * Metodo que calcula el coste basandose en el uso
     * @return El coste total de la climatizacion
     */
    @Override
    public double calcularCoste() {
        // Calcular el coste total multiplicando las horas por el coste unitario
        return horasUso * costeUnitario;
    }
}