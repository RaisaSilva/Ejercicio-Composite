package composite.MyComposite;

public class Client {
    public static void main (String [] args){
        Computador comp1 = new Computador("Modelo AB1234");
        Computador comp2 = new Computador("Modelo AC1234");
        Computador comp3 = new Computador("Modelo FD1234");

        comp1.setPrecio(100);
        comp2.setPrecio(100);
        comp3.setPrecio(100);

        Composite laboratorio =new Composite("Laboratorio1 de cuenta");
        laboratorio.add(comp1);
        laboratorio.add(comp2);
        laboratorio.add(comp3);

        Composite laboratorio2 =new Composite("Laboratorio2 de cuenta");
        laboratorio2.add(comp1);
        laboratorio2.add(comp2);
        laboratorio2.add(comp3);

        Composite laboratorio3 =new Composite("Laboratorio3 de cuenta");
        laboratorio3.add(comp1);
        laboratorio3.add(comp2);
        laboratorio3.add(comp3);

        Composite contenedor = new Composite("Contenedor de computadora");
        contenedor.add(laboratorio);
        contenedor.add(laboratorio2);
        contenedor.add(laboratorio3);

        contenedor.precioTotal();
    }

}
