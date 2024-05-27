import java.text.ParseException;

public class ParametrosInvalidosException  extends Exception {

        public static <Int> void main(String[] args) {
            int valorUm = 1;
            int valorDois = 0;
            if (valorUm > valorDois) {
                System.out.println("O segundo parametro deve ser maior que o primeiro !");
            }


        }
    }


