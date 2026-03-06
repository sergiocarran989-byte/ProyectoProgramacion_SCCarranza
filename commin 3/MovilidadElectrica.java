package dani;

import java.util.List;

/**
 * Sustituye vehículos de combustión por eléctricos.
 */
public class MovilidadElectrica extends MedidaCorrectoraBase {

    private double porcentajeReduccion;

    public MovilidadElectrica(double porcentajeReduccion) {
        super("Movilidad Eléctrica");
        this.porcentajeReduccion = porcentajeReduccion;
    }

    @Override
    public double reducirEmisiones(List<FuenteEmision> fuentes) {
        return fuentes.stream()
                .filter(f -> f instanceof Transporte)
                .mapToDouble(f -> f.calcularEmisiones() * porcentajeReduccion)
                .sum();
    }

    @Override
    public double reducirCoste(List<FuenteEmision> fuentes) {
        return fuentes.stream()
                .filter(f -> f instanceof Transporte)
                .mapToDouble(f -> f.calcularCoste() * porcentajeReduccion)
                .sum();
    }
}