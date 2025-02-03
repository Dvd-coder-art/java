public class    SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    //Botão de desligar
    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }
    /*-------------*/

    //Gerenciando Volume
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    /*-------------*/

    public void subirCanal(){
        canal++;
    }
    public void descerCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
