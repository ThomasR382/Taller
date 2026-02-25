
import java.util.Scanner;

public class metodos {

    Scanner sc = new Scanner(System.in);

    public objproducto[][] Llenarmatriz(objproducto[][] m) {
        objproducto o = new objproducto();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Ingrese el ID del producto");
                o.setID(sc.nextInt());
                System.out.println("Ingrese el nombre del producto");
                o.setNombre(sc.next());
                System.out.println("Ingrese el precio del producto");
                o.setPrecio(sc.nextDouble());
                System.out.println("Ingrese el Stock del Producto");
                o.setStock(sc.nextInt());
                m[i][j] = o;

            }
        }
        return m;
    }

    public objproducto[][] SumarStock(objproducto[][] m1, objproducto[][] m2, objproducto[][] mt) {

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {

                for (int j2 = 0; j2 < m2.length; j2++) {
                    for (int k = 0; k < m2.length; k++) {
                        if (m1[i][j].getID() == m2[j2][k].getID()) {
                            mt[i][j].setStock(m1[i][j].getStock() + m2[j2][k].getStock());

                        }

                    }
                }
            }
        }
        return mt;
    }
}
