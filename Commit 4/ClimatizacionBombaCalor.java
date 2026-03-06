package proyecto;

import java.util.List;

/**
 * Sustituye climatización tradicional por bomba de calor eficiente.
 */
public class ClimatizacionBombaCalor extends MedidaCorrectoraBase {

    private double eficienciaNueva;

    /**
     * Constructor ClimatizacionBombaCalor
     * @param eficienciaNueva Eficiencia de la bomba de calor
     */
    public ClimatizacionBombaCalor(double eficienciaNueva) {
        super("Bomba de Calor");
        this.eficienciaNueva = eficienciaNueva;
    }

    
    /**
     * Metodo para reducir emisiones
     * @return El total de emisiones reducido
     */
    @Override
    public double reducirEmisiones(List<FuenteEmision> fuentes) {
        double totalReducido = 0;

        // Recorrer la lista de fuentes de emisiones y calcular la reduccion
        for (FuenteEmision f : fuentes) {
            if (f instanceof Climatizacion) {
                totalReducido += f.calcularEmisiones() * eficienciaNueva;
            }
        }

        return totalReducido;
    }

    /**
     * Metodo que calcula la reduccion del coste recorriendo la lista de fuentes de emision
     * @return El coste reducido
     */
    @Override
    public double reducirCoste(List<FuenteEmision> fuentes) {
        double totalReducido = 0;

        for (FuenteEmision f : fuentes) {
            if (f instanceof Climatizacion) {
                totalReducido += f.calcularCoste() * eficienciaNueva;
            }
        }

        return totalReducido;
    }
}