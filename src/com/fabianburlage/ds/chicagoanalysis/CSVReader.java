package com.fabianburlage.ds.chicagoanalysis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.fabianburlage.ds.chicagoanalysis.model.ElasticWorkerArray;
import com.fabianburlage.ds.chicagoanalysis.model.Worker;


public class CSVReader {

    /**
     *
     * @param args
     */

    public static void main(String[] args){

        String dataCsvFileLocation = "/Users/fb/Downloads/data.csv";
        String csvSeparator = ",";
        String line = "";

        ElasticWorkerArray workers = new ElasticWorkerArray();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(dataCsvFileLocation))){
            // Acá va a estar el código que lee el archivo y puede fallar
            while((line = bufferedReader.readLine()) != null){
                line += " ";
                String[] person = line.split(csvSeparator);
                Worker personObject = new Worker(
                        person[1],
                        person[0],
                        person[3],
                        person[2],
                        person[4],
                        person[5],
                        person[6],
                        person[7],
                        person[8]);
                workers.addWorker(personObject);


            }

            Facts facts = new Facts(workers.getWorkerArray());


        } catch(FileNotFoundException fileNotFoundException){
            System.out.println("The file provided is not valid");
        }
        catch(IOException ioException){

        // Acá vamos a poner el código que se ejecuta si leer el archivo falla
        ioException.printStackTrace();


        }





    } // MAIN METHOD ENDS------------------------------------------------------

} // CLASS CSV ENDS------------------------------------------------------------
