import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
    private Socket clientSocket;
    private Scanner scanner;
    private PrintWriter saida;

    public Client(){
        scanner = new Scanner(System.in);
    }

    public void start() throws IOException{
        clientSocket = new Socket (Server.ADRESS,Server.PORT);
        saida = new PrintWriter(clientSocket.getOutputStream(),true);
        System.out.println("Cliente "+ Server.ADRESS + ":"+Server.PORT+" conectado ao Servidor!");
        messageLoop();
    }

    private void messageLoop() throws IOException{
        String msg;
        System.out.println("Aguardando a digitacao de uma mensagem! ");
        do{
            System.out.print("Digite uma mensagem (ou <sair> para finalizar): ");
            msg = "Nome: João Paulo de Souza Rodrigues CPF: 104.606.967-50 Data de nascimento: 30/07/2001 Ingresso: Vasco v Flamengo Meia-Entrada: Sim (Estudante) Gratuidade: Não Setor: Setor Sul (Vasco) Tipo: Superior Preço: R$40,00";
            saida.println(msg);
        }while(!msg.equalsIgnoreCase("sair"));
    }

    public static void main(String args[]){
        System.out.println("v*v*v* CONSOLE DO CLIENTE *v*v*v*");
        try{
            Client client = new Client();
            client.start();
        }
        catch(IOException ex){
            System.out.println("Erro ao iniciar o cliente: "+ex.getMessage());
        }
        System.out.println("Cliente finalizado! ");
    }
}
