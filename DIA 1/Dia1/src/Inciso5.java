public class Inciso5 {
        public static void main(String[] args) {
            double val1 = 3;
            double val2 = 2;
            double val3 = 1;

            System.out.println(minValue(val1, val2, val3));

        }
        public static double minValue(double val1, double val2, double val3){
            double temporal = Math.min(val1, val2);
            return Math.min(temporal, val3);
        }
    }

