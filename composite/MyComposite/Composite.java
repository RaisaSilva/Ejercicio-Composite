package composite.MyComposite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Computadora {

    private List<Computadora> listComp = new ArrayList<>();
    private int numComp = 0;

    public Composite(String computador) {
        super(computador);
    }


    @Override
    public int precioTotal() {

        for (Computadora componente: listComp) {
            numComp = numComp +componente.precioTotal();
        }
        System.out.println("Modelo de computadora: "+ getModelo());
        System.out.println("Estimacion del precio total : "+ numComp);
        return numComp;
    }

    @Override
    public void add(Computadora computadora) {
        listComp.add(computadora);

    }

    @Override
    public void remove(Computadora computadora) {
        listComp.remove(computadora);
    }

    @Override
    public void getChild(int position) {
        System.out.println(listComp.get(position).getModelo());
    }
}
