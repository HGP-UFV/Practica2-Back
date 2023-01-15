/*
 * Autor: Hemant García Puente - B8
 * Ingeniería Informática, Ciberseguridad y Hacking Ético
 * Curso - 3ºB
 * Profesor: Carlos Emilio Rabazo Márquez
 *
 * En esta clase vamos a crear un controlador. Este es el que se encarga de gestionar las peticiones HTTP: Get, Post, etc... y actuar de forma adecuada.
 * Creamos una clase, porque un controlador es una clase también.
 *
 * */

package dis.ufv.backendP2RestAPI.P2API;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ZBSController{

    //PRIMER FICHERO

    //Para mostrar toda la información del fichero que está entre comillas
    @GetMapping("/centros")
    public ArrayList<ZonaBasicaSalud> centros(){
        ArrayList<ZonaBasicaSalud> listaCentros = new LectorJsonZBS().leerFicheroJson("src/main/resources/Covid19-TIA_ZonasBásicasSaludMOD.json");
        return listaCentros;
    }//ArrayList centros



    //Para mostrar centros, según nombre de la Zona
    @GetMapping("/centros/porNombreZona/{nombreZonaCentro}")
    public ResponseEntity<ZonaBasicaSalud> getPorNombre(@PathVariable String nombreZonaCentro){
        ArrayList<ZonaBasicaSalud> listaCentros = new LectorJsonZBS().leerFicheroJson("src/main/resources/Covid19-TIA_ZonasBásicasSaludMOD.json");

        //Comprobamos que existe el centro solicitado
        ZonaBasicaSalud existe = null;
        for(ZonaBasicaSalud centro : listaCentros){
            if(centro.getZona_basica_salud().equalsIgnoreCase(nombreZonaCentro)){
                existe = centro;//Si existe lo recogemos en nuestro objeto que guardará los datos de interés
            }//if
        }//for

        return new ResponseEntity<>(existe, HttpStatus.OK);

    }//getPorNombre


    //PRIMER FICHERO






    //SEGUNDO FICHERO


    //Para mostrar toda la información del fichero que está entre comillas
    @GetMapping("/centrosMayores")
    public ArrayList<ZonaBasicaSalud60Mayores> centrosMayores(){
        ArrayList<ZonaBasicaSalud60Mayores> listaCentrosMayores = new LectorJsonZBS().leerFicheroJson2("src/main/resources/Covid19-TIA_ZonasBásicasSalud_Mayores60.json");
        return listaCentrosMayores;
    }//ArrayList centros



    //Para mostrar centros, según nombre de la Zona
    @GetMapping("/centrosMayores/porNombreZona/{nombreZonaCentro}")
    public ResponseEntity<ZonaBasicaSalud60Mayores> getPorNombreCentroMayores(@PathVariable String nombreZonaCentro){
        ArrayList<ZonaBasicaSalud60Mayores> listaCentrosMayores = new LectorJsonZBS().leerFicheroJson2("src/main/resources/Covid19-TIA_ZonasBásicasSalud_Mayores60.json");

        //Comprobamos que existe el centro solicitado
        ZonaBasicaSalud60Mayores existe = null;
        for(ZonaBasicaSalud60Mayores centro : listaCentrosMayores){
            if(centro.getZona_basica_salud().equalsIgnoreCase(nombreZonaCentro)){
                existe = centro;//Si existe lo recogemos en nuestro objeto que guardará los datos de interés
            }//if
        }//for

        return new ResponseEntity<>(existe, HttpStatus.OK);

    }//getPorNombre

    //SEGUNDO FICHERO




}//Class ZBS Controller