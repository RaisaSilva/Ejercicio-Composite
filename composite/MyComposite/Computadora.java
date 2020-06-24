package composite.MyComposite;

abstract class Computadora {
    private String modelo;
    private int precio;

    public Computadora(String modelo){
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract  int precioTotal();
    public abstract  void add(Computadora computadora);
    public abstract  void remove(Computadora computadora);
    public abstract  void getChild(int position);

}
