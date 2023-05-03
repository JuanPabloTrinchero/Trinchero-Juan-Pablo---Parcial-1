package Clases;

public abstract class Producto {
    private int stock;
    private String name;
    private double precio;
    ///-------------------------------------
    public Producto(int stock, String name, double precio) {
        this.stock = stock;
        this.name = name;
        this.precio = precio;
    }
    ///-------------------------------------
    public int getStock() {
        return stock;
    }
    public String getName() {
        return name;
    }
    public double getPrecio() {
        return precio;
    }
    ///-------------------------------------
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    ///-------------------------------------
    @Override
    public String toString() {
        return "Producto{" +
                "stock=" + stock +
                ", name='" + name + '\'' +
                ", precio=" + precio +
                '}';
    }
    ///-------------------------------------
    public void aumento(Integer porcentaje){
        double precio = this.getPrecio();
        double aumento = (precio/100)*porcentaje;
        this.setPrecio(precio+aumento);
    }
    ///-------------------------------------

}
