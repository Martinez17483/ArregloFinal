 import java.io.IOException;
import com.martinez.arregloFinal.Arreglos;
import com.martinez.arregloFinal.Archivo;
    public class Main {

        public static void main(String[] args) {
            Arreglos arreglos = new Arreglos();
            Archivo archivo = new Archivo();
            Arreglos arreglos1 = new Arreglos();
            arreglos1.mostrarVentana();

            String informacion = null;
            try {
                informacion = arreglos.copiarArreglo() + arreglos.copiarOtroArreglo();
            } catch (Exception e) {
                System.err.println("Error al obtener la información: " + e.getMessage());
                return;
            }

            try {
                archivo.guardarInformacionEnArchivo(informacion);
                System.out.println("Información guardada correctamente en el archivo.");
            } catch (IOException e) {
                System.err.println("Error al guardar la información en el archivo: " + e.getMessage());
            }
        }
    }
