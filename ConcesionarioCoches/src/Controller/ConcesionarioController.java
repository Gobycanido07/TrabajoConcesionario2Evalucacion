package Controller;

import Model.CocheDTO;

import java.util.ArrayList;
import java.util.List;

public class ConcesionarioController {

    private static int INITIAL_SIZE = 5;
    private List<CocheDTO> coches;

    public boolean aniadirCoche(CocheDTO coche) {
        coches.add(coche);
        return true;

    }

    public ConcesionarioController() {
        coches = new ArrayList<>();
    }
}
