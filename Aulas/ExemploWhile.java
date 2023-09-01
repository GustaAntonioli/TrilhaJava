import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {

public static void main(String[] args) {
    double mesada = 50.0;
    
    while ( mesada > 0 ) {
        double valorDoce = valorAleatorio();

        // Condição para não deixar o valor negativo.
        if (valorDoce > mesada) {
            valorDoce = mesada;
        }
    System.out.printf("Você adicionou um doce de R$ %.2f\n", valorDoce, " Reais ao carrinho");
    mesada  = mesada - valorDoce;
    }
    System.out.println("Sobrou R$ " + mesada + " de sua mesada");
    System.out.println("Você gastou toda sua mesada em doces!!!");
    }

private static double valorAleatorio() {
    return ThreadLocalRandom.current().nextDouble(2, 8);
}
}