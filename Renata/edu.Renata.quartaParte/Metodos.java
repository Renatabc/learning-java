public class Metodos{
  //exemplo 1
  public double somar(int num1, int num2){
    //finalidade do método aqui
    return ... ;
  }

  //exemplo 2
  public void imprimir(String texto){
    //finalidade do método aqui
    //não precisa de return, pois não retorna nenhum resultado
  }

  //throws Exception: o método, ao ser utilizado, poderá gerar uma exceção
  public double dividir(int dividendo, int divisor) throws Exception{}

  //não pode ser visto por outras classes no programa
  private void metodoPrivado(){}
}