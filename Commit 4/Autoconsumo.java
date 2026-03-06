package proyecto;

import java.util.List;

/**
 * Representa la instalación de autoconsumo solar.
 */
public class Autoconsumo extends MedidaCorrectoraBase {

    private double porcentajeReduccion;

    /**
     * Constructor Autoconsumo
     * @param porcentajeReduccion El porcentaje de reduccion
     */
    public Autoconsumo(double porcentajeReduccion) {
        super("Autoconsumo Solar");
        this.porcentajeReduccion = porcentajeReduccion;
    }

    /**
     * Metodo para reducir emisiones filtrando por fuentes de electricidad
     * @return El total de emisiones reducido por el autoconsumo
     */
    @Override
    public double reducirEmisiones(List<FuenteEmision> fuentes) {
        double totalReducido = 0;

        // Recorrer la lista de fuentes y calcular la reduccion si es electricidad
        for (FuenteEmision f : fuentes) {
            if (f instanceof Electricidad) {
                totalReducido += f.calcularEmisiones() * porcentajeReduccion;
            }
        }

        return totalReducido;
    }

    /**
     * Metodo que calcula la reduccion del coste recorriendo la lista de fuentes de emision
     * @return El coste total reducido por el ahorro solar
     */
    @Override
    public double reducirCoste(List<FuenteEmision> fuentes) {
        double totalReducido = 0;

        // Iterar sobre las fuentes para aplicar el porcentaje de ahorro en el coste electrico
        for (FuenteEmision f : fuentes) {
            if (f instanceof Electricidad) {
                totalReducido += f.calcularCoste() * porcentajeReduccion;
            }
        }

        return totalReducido;
    }
}