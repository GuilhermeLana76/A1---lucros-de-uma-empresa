import java.util.Scanner;
import empresaPOO.Calculo;

public class Empresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        empresaPOO.Calculo calculo = new Calculo(0.0, 0.0);

            int nClientes;

            //Recebendo a quantidade de clientes
            System.out.print("Informe o número de clientes: ");
            nClientes = scanner.nextInt();

            double totalGastos = 0;

            //Recebendo os gastos de cada cliente
            for (int i = 1; i <= nClientes; i++) {

                System.out.println("Cliente " + i);
                System.out.print("Informe o gasto com bebidas do " + i + "° cliente: R$");
                double gastoBebidas = scanner.nextDouble();

                System.out.print("Informe o gasto com comidas do " + i + "° cliente: R$");
                double gastoComidas = scanner.nextDouble();

                double total = gastoBebidas + gastoComidas;
                totalGastos += total;

                System.out.println("Gasto total de bebidas e comidas do " + i + "° cliente: R$ " + total);

            //Calculando e imprimindo a media de cada cliente
                calculo.setMediaCliente(total);
               
            }

            //Imprimindo a media geral de todos os Clientes.
            calculo.setMediaGeral(totalGastos, nClientes);

            //Fechando o Scanner
            scanner.close();
        }
    }