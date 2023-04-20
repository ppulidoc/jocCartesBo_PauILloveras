package cat.pulidolloveras.IO;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class leerFicher {
    public static void muestraTitulo(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            System.out.println(cadena);
        }
        b.close();
    }
    public static void muestraInstrucciones (String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            System.out.println(cadena);
        }
        b.close();
    }

    public static void main(String[] args) throws IOException {
        muestraTitulo("C:\\Users\\arnau\\IdeaProjects\\jocCartesBo_PauILloveras\\src\\cat\\pulidolloveras\\file\\titol");
        muestraInstrucciones("C:\\Users\\arnau\\IdeaProjects\\jocCartesBo_PauILloveras\\src\\cat\\pulidolloveras\\file\\Instrucciones");

    }
}
