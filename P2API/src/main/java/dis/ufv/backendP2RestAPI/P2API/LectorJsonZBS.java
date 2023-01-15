/*
 * Autor: Hemant García Puente - B8
 * Ingeniería Informática, Ciberseguridad y Hacking Ético
 * Curso - 3ºB
 * Profesor: Carlos Emilio Rabazo
 *
 * Esta clase la vamos a utilizar para la lectura del fichero JSON ZonasBasicasSalud
 *
 * */




package dis.ufv.backendP2RestAPI.P2API;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;




public class LectorJsonZBS {

    public ArrayList <ZonaBasicaSalud> leerFicheroJson(String fichero){
        try{
            //Crear una instancia Gson
            Gson gson = new Gson();
            //Lee el fichero que le pasamos y lo carga en un reader
            Reader reader = Files.newBufferedReader(Paths.get(fichero));
            //Convierte el array JSON a un arraylist de users
            ArrayList <ZonaBasicaSalud> listaCentros = gson.fromJson(reader, new TypeToken<ArrayList<ZonaBasicaSalud>>() {}.getType());
            reader.close();//Cerramos el reader
            return listaCentros;
        }catch (Exception ex){
            ex.printStackTrace();
            return new ArrayList<>(); //En caso de no leer nada, devuelve un array vacío
        }
    }//leeFicheroJson


    public ArrayList <ZonaBasicaSalud60Mayores> leerFicheroJson2(String fichero){
        try{
            //Crear una instancia Gson
            Gson gson = new Gson();
            //Lee el fichero que le pasamos y lo carga en un reader
            Reader reader = Files.newBufferedReader(Paths.get(fichero));
            //Convierte el array JSON a un arraylist de users
            ArrayList <ZonaBasicaSalud60Mayores> listaCentros = gson.fromJson(reader, new TypeToken<ArrayList<ZonaBasicaSalud60Mayores>>() {}.getType());
            reader.close();//Cerramos el reader
            return listaCentros;
        }catch (Exception ex){
            ex.printStackTrace();
            return new ArrayList<>(); //En caso de no leer nada, devuelve un array vacío
        }
    }//leeFicheroJson



}//Class LectorJson