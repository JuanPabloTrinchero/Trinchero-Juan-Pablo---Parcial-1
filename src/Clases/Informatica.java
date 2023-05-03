package Clases;
public class Informatica extends Producto{
    private String fabricante;
    ///-------------------------------------
    public Informatica(int stock, String name, float precio, String fabricante) {
        super(stock, name, precio);
        this.fabricante = fabricante;
    }
    ///-------------------------------------
    public String getFabricante() {
        return fabricante;
    }
    ///-------------------------------------
    @Override
    public String toString() {
        return "Informatica{" +
                "fabricante='" + fabricante + '\'' +
                "} " + super.toString();
    }
    ///-------------------------------------
}
