package Clases;

import Interfaces.Descuento;

public class Impresora extends Informatica implements Descuento {
    private int impresionesXMinito;
    ///-------------------------------------
    public Impresora(int stock, String name, float precio, String fabricante, int impresionesXMinito) {
        super(stock, name, precio, fabricante);
        this.impresionesXMinito = impresionesXMinito;
    }
    ///-------------------------------------
    public int getImpresionesXMinito() {
        return impresionesXMinito;
    }
    ///-------------------------------------
    @Override
    public String toString() {
        return "Impresora{" +
                "impresionesXMinito=" + impresionesXMinito +
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
