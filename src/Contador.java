import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Digite um valor:");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite outro valor:");
        int parametroDois = scanner.nextInt();

        try {
            // Chamando o metodo contendo a logica da contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro !");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) throw new ParametrosInvalidosException(); {

        }

        int contagem = parametroDois - parametroUm;
        for (int indice=1; indice <= contagem; indice++){
            System.out.println("Imprimindo o número " + indice);
        }


    }
}
