package com.martinez.arregloFinal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {

    public void guardarInformacionEnArchivo(String informacion) throws IOException {
        File file = new File("informacion.txt");
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(informacion);
        } finally {
            if (bw != null) {
                bw.close();
            }
        }
        System.out.println("La información se ha guardado en el archivo 'informacion.txt' correctamente.");
    }

    public static void main(String[] args) {
        Arreglos arreglos = new Arreglos();
        Archivo archivos = new Archivo();

        String informacion = arreglos.copiarArreglo() + arreglos.copiarOtroArreglo();

        try {
            archivos.guardarInformacionEnArchivo(informacion);
            System.out.println("Datos guardados correctamente en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos en el archivo: " + e.getMessage());
        }
    }
}

