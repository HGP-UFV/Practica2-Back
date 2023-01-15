package dis.ufv.backendP2RestAPI.P2API;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LectorJsonZBSTest {

    //Objetos para las pruebas de lectura de ficheros JSON
    LectorJsonZBS prueba1 = new LectorJsonZBS(); //Para el primer método, referente al fichero JSON
    LectorJsonZBS prueba2 = new LectorJsonZBS(); //Para el segundo método, referente al fichero JSON de Mayores 60

    @Test
    public void leerFicheroJson() {
        ArrayList<ZonaBasicaSalud> lista = new ArrayList<>();
        assertEquals(lista, prueba1.leerFicheroJson("P2API/src/main/resources/Covid19-TIA_ZonasBásicasSaludMOD.json"));
    }//leerFicheroJSON

    @Test
    public void leerFicheroJson2() {
        ArrayList<ZonaBasicaSalud60Mayores> lista = new ArrayList<>();
        assertEquals(lista, prueba1.leerFicheroJson("P2API/src/main/resources/Covid19-TIA_ZonasBásicasSalud_Mayores60.json"));
    }//leerFicheroJSON2



}//Test