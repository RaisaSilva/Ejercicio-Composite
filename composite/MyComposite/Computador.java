package composite.MyComposite;

public class Computador extends Computadora {


    public Computador(String modelo) {
        super(modelo);
    }

    @Override
    public int precioTotal() {
        System.out.println("Componente : ["+ getModelo()+"] Estimacion Total : [" + getPrecio()+"]");
        return this.getPrecio();
    }

    @Override
    public void add(Computadora computadora) {
        System.out.println("Not Applicable");
    }

    @Override
    public void remove(Computadora computadora) {
        System.out.println("Not Applicable");
    }

    @Override
    public void getChild(int position) {
        System.out.println("Not Applicable");
    }
}
