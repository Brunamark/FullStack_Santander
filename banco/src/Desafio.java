import java.util.Scanner;
public class Desafio {

  public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);
    int numeroConta = scanner.nextInt();
    scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
    String nomeTitular = scanner.nextLine();
    
    double saldo = scanner.nextDouble();
    scanner.close();
    
    ContaBancaria contaBanco = new ContaBancaria();
    contaBanco.setNumero(numeroConta);
    contaBanco.setTitular(nomeTitular);
    contaBanco.setSaldo(saldo);

    System.out.println("Informacoes:");
    System.out.println("Conta: "+contaBanco.getNumero());
    System.out.println("Titular: "+contaBanco.getTitular());
    System.out.println("Saldo: R$ "+contaBanco.getSaldo());
  }
}

class ContaBancaria {
  int numero;
  String titular;
  double saldo;

  public void Bancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
}