import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println("Welcome to Bar, iremos iniciar seu cadastro");
        Scanner scanner = new Scanner(System.in);
        cliente.capturarInformacoesCliente(scanner);
        /*
        Simplificando mandando para a classe inves de abrir no main

        System.out.print("Seu nome cliente: ");
         Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
         cliente.setNome(nome);
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        cliente.setEndereco(endereco);
        */
        Random random = new Random();
        int numeroAleatorio = random.nextInt(1000);
        cliente.setIdc(numeroAleatorio);
        System.out.println("Nome do cliente: "+ cliente.getNome());
        System.out.println("Endereço do Cliente: "+ cliente.getEndereco());
        System.out.println("Seu código = "+ cliente.getIdc());
    }
}
