package dani;

/**
 * Clase base para las medidas correctoras.
 */
public abstract class MedidaCorrectoraBase implements MedidaCorrectora {

    protected String descripcion;

    public MedidaCorrectoraBase(String descripcion) {
        this.descripcion = descripcion;
    }
}
