public class Inciso4 {
    public static void main(String[] args) {
        double val1 = 25;
        double val2 = 20;
        double val3 = 1000;

        System.out.println(highestValue(val1, val2, val3));

    }
    public static double highestValue(double val1, double val2, double val3){
        double temporal = Math.max(val1, val2);
        double highestVal = Math.max(temporal, val3);
        return highestVal;
        }
    }


