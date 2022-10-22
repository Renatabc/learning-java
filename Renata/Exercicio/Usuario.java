public class Usuario{
  public static void main(String[] args) throws Exception{
    SmartTv smartTv = new SmartTv();

    System.out.print("TV ligada? " + smartTv.ligada);
    System.out.print("Canal atual: " + smartTv.canal);
    System.out.print("Volume atual: " + smartTv.volume);

    smartTv.ligar();
    System.out.print("Novo Status -> TV ligada? " + smartTv.ligada);

    smartTv.mudarCanal(34);
    System.out.print("Novo Status -> Canal atual: " + smartTv.canal);

    smartTv.diminuirVolume();
    System.out.print("Novo Status -> Volume atual: " + smartTv.volume);
  }
}