package proyecto;

/**
 * Representa el consumo eléctrico de la empresa.
 */
public class Electricidad extends FuenteEmision {

    private double consumoKWh;

    /**
     * Constructor Electricidad
     * @param consumoKWh Consumo electrico en kilovatios hora
     * @param factorEmision El factor de emision
     * @param costeUnitario El coste unitario
     */
    public Electricidad(double consumoKWh, double factorEmision, double costeUnitario) {
        super("Electricidad", factorEmision, costeUnitario);
        this.consumoKWh = consumoKWh;
    }

    /**
     * Metodo para calcular las emisiones electricas
     * @return El total de emisiones segun el consumo en kWh
     */
    @Override
    public double calcularEmisiones() {
        // Multiplicar el consumo en kWh por el factor de emision
        return consumoKWh * factorEmision;
    }

    /**
     * Metodo que calcula el coste de la electricidad
     * @return El coste total basado en el consumo
     */
    @Override
    public double calcularCoste() {
        // Calcular el coste total multiplicando el consumo por el coste unitario
        return consumoKWh * costeUnitario;
    }
}