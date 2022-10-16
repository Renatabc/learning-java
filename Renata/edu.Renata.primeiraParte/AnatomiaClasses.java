public class AnatomiaClasses {
  
  public static void main (String [] args) {
    //System.out.print ("Hello, world!");

    //variavel
    //String meuNome = "Renata";
    //int anoNascimento = 1994;
    //boolean verdadeira = true;
    //boolean falsa = false;
    //anoNascimento = 1995;
    String primeiroNome = "Renata";
    String segundoNome = "Brito";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.print(nomeCompleto);
  }
  //metodo
  public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
  }
}