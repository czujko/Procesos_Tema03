import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        InetAddress inet;
        String[] direcciones = {"www.google.es", "www.xataka.com", "www.calasparra.org"};
        try {
            for (int i = 0; i < args.length; i++) {
                inet = InetAddress.getByName(args[i]);
                System.out.println(inet.getCanonicalHostName());
                System.out.println(inet.getHostAddress());
            }
            //System.out.println(inet.getCanonicalHostName());
            //System.out.println(inet.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
