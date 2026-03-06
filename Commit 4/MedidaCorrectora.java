package proyecto;

import java.util.List;

/**
 * Interfaz que define el comportamiento de una medida correctora.
 */
public interface MedidaCorrectora {

    /**
     * Metodo para calcular la reduccion de emisiones aplicada a una lista de fuentes
     * @param fuentes La lista de fuentes de emision
     * @return El total de emisiones reducido
     */
    double reducirEmisiones(List<FuenteEmision> fuentes);

    /**
     * Metodo que calcula la reduccion del coste aplicada a una lista de fuentes
     * @param fuentes La lista de fuentes de emision
     * @return El total del coste reducido
     */
    double reducirCoste(List<FuenteEmision> fuentes);
}