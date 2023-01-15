package dis.ufv.backendP2RestAPI.P2API;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ZBSControllerTest {

    @Test
    public void centros() {
        ArrayList<ZonaBasicaSalud> lista = new ArrayList<>();

        assertEquals(new ArrayList<>(), lista);
    }



    @Test
    public void centrosMayores() {
        ArrayList<ZonaBasicaSalud60Mayores> lista = new ArrayList<>();
        assertEquals(new ArrayList<>(), lista);
    }


}//Test