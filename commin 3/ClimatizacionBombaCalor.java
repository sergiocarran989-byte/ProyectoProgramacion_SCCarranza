package dani;

import java.util.List;

/**
 * Sustituye climatización tradicional por bomba de calor eficiente.
 */
public class ClimatizacionBombaCalor extends MedidaCorrectoraBase {

    private double eficienciaNueva;

    public ClimatizacionBombaCalor(double eficienciaNueva) {
        super("Bomba de Calor");
        this.eficienciaNueva = eficienciaNueva;
    }

    @Override
    public double reducirEmisiones(List<FuenteEmision> fuentes) {
        return fuentes.stream()
                .filter(f -> f instanceof Climatizacion)
                .mapToDouble(f -> f.calcularEmisiones() * eficienciaNueva)
                .sum();
    }

    @Override
    public double reducirCoste(List<FuenteEmision> fuentes) {
        return fuentes.stream()
                .filter(f -> f instanceof Climatizacion)
                .mapToDouble(f -> f.calcularCoste() * eficienciaNueva)
                .sum();
    }
}
