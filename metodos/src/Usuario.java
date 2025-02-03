public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Qual canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);
        
        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.mudarCanal(15);
        System.out.println("Qual canal: " + smartTv.canal);

        smartTv.subirCanal();
        System.out.println("Qual canal: " + smartTv.canal);

    }
}
