package Clases;
import Interfaces.Descuento;
public class Silla extends Mueble implements Descuento {
    private boolean tieneRuedas;
    ///-------------------------------------
    public Silla(int stock, String name, double precio, boolean tieneRuedas) {
        super(stock, name, precio);
        this.tieneRuedas = tieneRuedas;
    }
    ///-------------------------------------
    public boolean isTieneRuedas() {
        return tieneRuedas;
    }
    ///-------------------------------------
    @Override
    public String toString() {
        return "Silla{" +
                "tieneRuedas=" + tieneRuedas +
                "} " + super.toString();
    }
    ///-------------------------------------
    @Override
    public void descuento(Integer porcentaje){
        double precio = this.getPrecio();
        double descuento = (precio/100)*porcentaje;
        this.setPrecio(precio-descuento);
    }
    ///-------------------------------------
}
