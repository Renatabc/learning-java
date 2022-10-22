/*Exercício de criação de código com as seguintes funcionalidades de uma Smart TV:
  1- Ligar e desligar;
  2- Mudar de canal;
  3- Aumentar e diminuir o volume.*/


public class SmartTv{
  boolean ligada = false;
  int canal = 1;
  int volume = 50;

  public void ligar(){
    ligada= true;
  }

  public void desligar(){
    ligada= false;
  }

  public void mudarCanal(int novoCanal){
    canal = novoCanal;
  }

  public void aumentarVolume(){
    volume++;
  }

  public void diminuirVolume(){
    volume--;
  }
}