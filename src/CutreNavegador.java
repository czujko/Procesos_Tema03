import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.Scanner;

public class CutreNavegador {

    public static void main(String[] args) {
        String acumulador = "";
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce la URL");
            String direccion = sc.next().toLowerCase(Locale.ROOT);
            direccion = (direccion.substring(0, 8).equals("https://")) ? direccion : "https://" + direccion;

            URL miurl = new URL(direccion);
            InputStream inputStream = miurl.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                acumulador = acumulador + linea;
            }
            br.close();
            inputStream.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*int posicion = acumulador.indexOf("<img src=\"");
        int posicion2 = acumulador.indexOf(">");
        String titulo = acumulador.substring(posicion + 9, posicion2);
        System.out.println("Título: " + titulo);*/

        int posicion=acumulador.indexOf("<img src=\"")+10;
        int posicion2=acumulador.indexOf("\"", posicion);
        String imagen=acumulador.substring(posicion, posicion2);
        System.out.println("---------------------");
        System.out.println(imagen);


    }
}
