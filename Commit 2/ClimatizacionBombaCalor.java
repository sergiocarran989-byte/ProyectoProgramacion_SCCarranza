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
