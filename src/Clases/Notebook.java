package Clases;
public class Notebook extends Informatica{
    private int memoria;
    ///-------------------------------------
    public Notebook(int stock, String name, float precio, String fabricante, int memoria) {
        super(stock, name, precio, fabricante);
        this.memoria = memoria;
    }
    ///-------------------------------------
    public int getMemoria() {
        return memoria;
    }
    ///-------------------------------------
    @Override
    public String toString() {
        return "Notebook{" +
                "memoria=" + memoria +
                "} " + super.toString();
    }
    ///-------------------------------------
}
