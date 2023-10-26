import java.util.Scanner;
public class Cliente {

    private String nome;
    private int idade;
    private int idc;
    private String endereco;

    public String getNome(){

        return nome;
    }
    public void setNome(String nome){

        this.nome = nome;
    }
    public int getIdade(){

        return idade;
    }
    public void setIdade(int idade) {

        this.idade = idade;
    }

    public int getIdc(){

        return idc;
    }

    public void setIdc(int idc) {

        this.idc = idc;
    }
/*
    public String getEndereco() {hhhh

        return endereco;
   }
 */


    public void setEndereco(String endereco) {

        this.endereco = endereco;
    }
    public String getEndereco(){
        return endereco;
    }
    /*   public void cadastrarEndereco(String endereco){
           setEndereco(endereco);
       }
       public  void imprimirEndereco(){
           System.out.println(this.endereco);
       }
        public String retornarNomeCliente(){
           return thiendereco; to ficando losoc 
       }
      /*
      Simplicando!

      public void cadastrarNome(String nome){
           setNome(nome);
       }
       public void ImprimirNome(){
           System.out.println(this.nome);
       }
        */
    public void capturarInformacoesCliente(Scanner scanner) {
        System.out.print("Seu nome cliente: ");
        String nome = scanner.nextLine();
        setNome(nome);

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        setEndereco(endereco);
    }
}
