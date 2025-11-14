package data;

import model.ProduccionCultivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//Leer el archivo linea por linea - separe los datos con .split(";") - cree objetos con los datos - almacene en ArrayList
public class GestorDatos {

    private final String ubicacionArchivo;

    public GestorDatos (String ubicacionArchivo){
        this.ubicacionArchivo = ubicacionArchivo;
    }

    //Creamos método para leer archivo
    public ArrayList<ProduccionCultivos> cargarProduccion(){

        //Creamos ArrayList de objetos de la clase ProduccionCultivos para guardar los datos del archivo.
        ArrayList<ProduccionCultivos> listaCultivos = new ArrayList<>();

        //Abrimos el archivo usando BufferedReader dentro de un bloque try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader(ubicacionArchivo))) {

            //Variable que guardara los valores de una línea leida del archivo
            String lineaArchivo;

            //Ciclo que recorre línea a línea el archivo hasta que encuentra una línea sin datos (null)
            while ((lineaArchivo = br.readLine()) != null){

                //Dividimos la linea leida con ";" como separador y guardamos cada parte en un arreglo
                String[] partes = lineaArchivo.split(";");

                // Validamos que la linea tenga 4 partes (id, nombre, comuna y tonealdas)
                if (partes.length == 4){
                    //convertimos cada parte en el tipo de dato correspondiente o esperado
                    String id = partes[0];                                  //Primer dato: id Centro (esperamos un entero)
                    String nombreCentro = partes[1];                        //Segundo dato: nombre del centro (esperamos un String)
                    String comuna = partes[2];                              //Tercer dato: comuna (esperamos un string)
                    try {
                        double toneladas = Double.parseDouble(partes[3]);   //cuarto dato: toneladas producidas (esperamos un double)
                        // Creamos un objeto de ProduccionCultivo y lo agregamos a la lista
                        listaCultivos.add(new ProduccionCultivos(id, nombreCentro, comuna, toneladas));

                    }catch (NumberFormatException exception){
                        //Mensaje en caso de error al convertir el dato de las toneladas
                        System.out.println("Las toneladas de la linea " + lineaArchivo + " no corresponden a un número");
                    }

                }else {
                    //Si la linea no se compone de 4 partes arroja un mensaje.
                    System.err.println("Existen una linea con error: " + lineaArchivo);
                }
            }
        } catch (IOException e) {
            //En caso de lectura del archivo o que no existiera arrojamos un mensaje
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }

        //Devolvemos la lista con los objetos construidos desde la lectura del archivo
        return  listaCultivos;
    }
}
