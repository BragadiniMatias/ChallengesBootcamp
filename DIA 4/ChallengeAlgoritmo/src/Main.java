public class Main {
    public static void main(String[] args) throws TooFastException {
        Particular particular = new Particular("123",4);
        Carga cg = new Carga("1234");
        Remolque r = new Remolque(500);
        cg.ponRemolque(r);

        System.out.println(particular);
        System.out.println(cg);

        particular.acelerar(150);
        cg.acelerar(100);

        System.out.println(particular);
        System.out.println(cg);

        System.out.println("===========================================");
        System.out.println("Acelero el camion a mas de 150km por hora");

        cg.acelerar(150);
        System.out.println(cg);






    }
}
