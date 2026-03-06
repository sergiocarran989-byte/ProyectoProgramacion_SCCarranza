package dani;

import java.util.List;

/**
 * Interfaz que define el comportamiento de una medida correctora.
 */
public interface MedidaCorrectora {

    double reducirEmisiones(List<FuenteEmision> fuentes);

    double reducirCoste(List<FuenteEmision> fuentes);
}