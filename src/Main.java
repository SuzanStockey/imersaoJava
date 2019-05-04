public class Main {

    public static void main(String[] args) {


        Nota nota1 = new Nota();//10.0;
        nota1.valor = 10.0;
        Nota nota2 = new Nota();//6.5;
        nota2.valor = 6.5;
        Double media = calcularMediaNotas(nota1,nota2);
    }

    public static Double calcularMediaNotas(Nota nota1, Nota nota2){
        Double resultado = ( nota1.valor + nota2.valor ) / 2;
        return resultado;
    }
}
