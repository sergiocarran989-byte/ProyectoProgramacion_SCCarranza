package proyecto;

import java.util.List;

/**
 * Sustituye vehículos de combustión por eléctricos.
 */
public class MovilidadElectrica extends MedidaCorrectoraBase {

    private double porcentajeReduccion;

    /**
     * Constructor MovilidadElectrica
     * @param porcentajeReduccion El porcentaje de reduccion aplicado
     */
    public MovilidadElectrica(double porcentajeReduccion) {
        super("Movilidad Eléctrica");
        this.porcentajeReduccion = porcentajeReduccion;
    }

    /**
     * Metodo para reducir emisiones filtrando por fuentes de transporte
     * @return El total de emisiones reducido por el cambio a vehiculos electricos
     */
    @Override
    public double reducirEmisiones(List<FuenteEmision> fuentes) {
        double totalReducido = 0;

        // Recorrer la lista de fuentes de emisiones y calcular la reduccion si es transporte
        for (FuenteEmision f : fuentes) {
            if (f instanceof Transporte) {
                totalReducido += f.calcularEmisiones() * porcentajeReduccion;
            }
        }

        return totalReducido;
    }

    /**
     * Metodo que calcula la reduccion del coste recorriendo la lista de fuentes de emision
     * @return El coste reducido por la eficiencia en movilidad
     */
    @Override
    public double reducirCoste(List<FuenteEmision> fuentes) {
        double totalReducido = 0;

        // Iterar sobre las fuentes para aplicar el ahorro en transporte
        for (FuenteEmision f : fuentes) {
            if (f instanceof Transporte) {
                totalReducido += f.calcularCoste() * porcentajeReduccion;
            }
        }

        return totalReducido;
    }
}