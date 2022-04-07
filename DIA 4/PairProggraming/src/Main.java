import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Cliente cl1 = new Cliente("Anakin", "001");
        Factura f = new Factura(cl1,"compra variada",'A');
        Producto pr1 = new Electrodomestico("Tele",10000,"01");
        Producto pr2 = new Electrodomestico("Pava Electrica",9000,"02");
        Producto cm1 = new Comida("Banana",200,"01");
        Producto cm2 = new Comida("Galletita",30,"02");
        Producto cm3 = new Comida("Naranja",40,"03");
        Producto cm4 = new Comida("Asado",1500,"04");
        Producto cm5 = new Comida("Cremon",30,"05");

        f.agregarProducto(pr1);
        f.agregarProducto(pr2);
        f.agregarProducto(cm1);
        f.agregarProducto(cm2);
        f.agregarProducto(cm3);
        f.agregarProducto(cm4);
        f.agregarProducto(cm5);

        f.promedioPrecioProdcutos();
        f.calcularMonto();

        System.out.println("El monto de la factura "+f.getNumeroFactura()+"es: "+f.getMonto());
        System.out.println("El precio promedio de los productos es: "+f.getPromedioProductos());


    }

}