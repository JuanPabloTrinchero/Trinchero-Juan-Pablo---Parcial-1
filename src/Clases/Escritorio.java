package Clases;
public class Escritorio extends Mueble{
    private double alto;
    private double ancho;
    ///-------------------------------------
    public Escritorio(int stock, String name, float precio, double alto, double ancho) {
        super(stock, name, precio);
        this.alto = alto;
        this.ancho = ancho;
    }
    ///-------------------------------------
    public double getAlto() {
        return alto;
    }
    public double getAncho() {
        return ancho;
    }
    ///-------------------------------------
    @Override
    public String toString() {
        return "Escritorio{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                "} " + super.toString();
    }
    ///-------------------------------------
}
