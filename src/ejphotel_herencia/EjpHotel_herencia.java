
package ejphotel_herencia;

import ejphotel_herencia.Entidades.Hotel;
import ejphotel_herencia.Entidades.Hotel1;
import ejphotel_herencia.Entidades.Hotel2;
import ejphotel_herencia.Entidades.Hotel3;
import ejphotel_herencia.Entidades.Hotel4;
import ejphotel_herencia.Entidades.Hotel5;
import java.util.ArrayList;
import java.util.List;

public class EjpHotel_herencia {

    public static void main(String[] args) {
        
        List<Hotel> hoteles = new ArrayList();
        
        Hotel1 h1 = new Hotel1(1500d, 9d, 10);
        Hotel1 h2 = new Hotel2(2500d, 12d, 15);
        Hotel1 h3 = new Hotel3(3500d, 15d, 20);
        Hotel1 h4 = new Hotel4(5000d, 20d, 30);
        Hotel1 h5 = new Hotel5(10000d, 30d, 50);
        
        hoteles.add(h1);
        hoteles.add(h2);
        hoteles.add(h3);
        hoteles.add(h4);
        hoteles.add(h5);
        
        for (Hotel aux : hoteles) {

            if (aux instanceof Hotel5) {
                Hotel5 object = (Hotel5) aux;
                System.out.println("Soy un hotel 5.");
                continue;
            }

            if (aux instanceof Hotel4) {
                Hotel4 object = (Hotel4) aux;
                System.out.println("Soy un hotel 4.");
                continue;
            }

            if (aux instanceof Hotel3) {
                Hotel3 object = (Hotel3) aux;
                System.out.println("Soy un hotel 3.");
                continue;
            }

            if (aux instanceof Hotel2) {
                Hotel2 object = (Hotel2) aux;
                System.out.println("Soy un hotel 2.");
                continue;
            }

            if (aux instanceof Hotel1) {
                Hotel1 object = (Hotel1) aux;
                System.out.println("Soy un hotel 1.");
            }
        }
    }
}

