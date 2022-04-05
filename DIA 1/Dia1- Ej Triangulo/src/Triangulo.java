public class Triangulo {
    int lado1, lado2, lado3;

    public Triangulo() {
    }

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public String tipoTriangulo(){
        if (lado1 == lado2 && lado2 ==lado3){
            return "Equilatero";
        } else if (lado1 != lado2 && lado2 !=lado3 && lado1 !=lado3){
            return "Escaleno";
        } else{
            return "Isosceles";
        }
    }

}
