import Clases.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ///3)-------------------------------
        System.out.println("********* 3) LISTA DE PRODUCTOS *********");

            /// Crear una instancia de cada clase.
        Silla silla1 = new Silla(1, "Ikea1", 1200, false);
        Escritorio escritorio1 = new Escritorio(1, "Easy1", 2000, 80, 120);
        Impresora impresora1 = new Impresora(1, "HP1", 1500, "HP Industries", 20);
        Notebook notebook1 = new Notebook(1, "Acer1", 5000, "Acer Industries", 500);

            /// Crear a una lista (ArrayList) y agregar todas las instancias.
        ArrayList<Producto> listaProductos = new ArrayList<>();

        listaProductos.add(silla1);         /// Producto 1
        listaProductos.add(escritorio1);    /// Producto 2
        listaProductos.add(impresora1);     /// Producto 3
        listaProductos.add(notebook1);      /// Producto 4

            /// Recorrer la lista mostrando a que clase pertenece cada instancia.
        int index = 1;
        for(Producto miembro : listaProductos){
            if(miembro instanceof Silla){
                System.out.println("El producto "+index+" pertenece a la clase Silla");
                index++;
            }else if(miembro instanceof Escritorio){
                System.out.println("El producto "+index+" pertenece a la clase Escritorio");
                index++;
            }else if(miembro instanceof Impresora){
                System.out.println("El producto "+index+" pertenece a la clase Impresora");
                index++;
            }else{      ///     "if(miembro instanceof Notebook)"
                System.out.println("El producto "+index+" pertenece a la clase Notebook");
                index++;
            }
        }

        System.out.println("*****************************************\n");
        ///---------------------------------

        ///4)-------------------------------
        System.out.println("********* 4) DESCUENTOS A SILLAS E IMPRESORAS *********");
        System.out.println("Un cliente compro una silla - se le aplica un descuento de %30");
        Silla sillaVendida = new Silla(1, "Ikea1", 1200, false);
        Integer descuentoSilla=30;

        System.out.println("- Precio base silla:.............. $"+sillaVendida.getPrecio());
        sillaVendida.descuento(descuentoSilla);
        System.out.println("- Precio con descuento del %"+descuentoSilla+":... $"+sillaVendida.getPrecio());
        System.out.println(".........................................................................");

        System.out.println("Un cliente compro una impresora - se le aplica un descuento de %25");
        Impresora impresoraVendida = new Impresora(1, "HP1", 1500, "HP Industries", 20);
        Integer descuentoImpresora=25;

        System.out.println("- Precio base impresora:.......... $"+impresoraVendida.getPrecio());
        impresoraVendida.descuento(25);
        System.out.println("- Precio con descuento del %"+descuentoImpresora+":... $"+impresoraVendida.getPrecio());

        System.out.println("*******************************************************\n");
        ///---------------------------------

        ///5)-------------------------------

        System.out.println("********* 5) AUMENTOS *********");

        for(Producto miembro : listaProductos){
            if(miembro instanceof Silla){
                System.out.println("SILLA");
                System.out.println("Precio sin aumento:........... $"+miembro.getPrecio());
                miembro.aumento(5);
                System.out.println("Precio con aumento del %5:.... $"+miembro.getPrecio());
            }else if(miembro instanceof Escritorio){
                System.out.println("ESCRITORIO");
                System.out.println("Precio sin aumento:........... $"+miembro.getPrecio());
                miembro.aumento(10);
                System.out.println("Precio con aumento del %10:... $"+miembro.getPrecio());
            }else if(miembro instanceof Impresora){
                System.out.println("IMPRESORA");
                System.out.println("Precio sin aumento:........... $"+miembro.getPrecio());
                miembro.aumento(15);
                System.out.println("Precio con aumento del %15:... $"+miembro.getPrecio());
            }else{      ///     "if(miembro instanceof Notebook)"
                System.out.println("NOTEBOOK");
                System.out.println("Precio sin aumento:........... $"+miembro.getPrecio());
                miembro.aumento(20);
                System.out.println("Precio con aumento del %20:... $"+miembro.getPrecio());
            }
        }

        System.out.println("*******************************\n");
        ///---------------------------------
    }
}