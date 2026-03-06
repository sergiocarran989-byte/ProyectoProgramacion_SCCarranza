package proyecto;

/**
 * Clase base para las medidas correctoras.
 */
public abstract class MedidaCorrectoraBase implements MedidaCorrectora {

    protected String descripcion;

    /**
     * Constructor MedidaCorrectoraBase
     * @param descripcion La descripcion de la medida correctora
     */
    public MedidaCorrectoraBase(String descripcion) {
        this.descripcion = descripcion;
    }
}