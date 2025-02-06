package Apps.Reprodutor;

public class Spotify {


    private Iniciar iniciar;
    private Pausa pausar;
    private AdicionarMusica adicionarMusica;


    public Spotify() {
        this.iniciar = new Iniciar();
        this.pausar = new Pausa();
        this.adicionarMusica = new AdicionarMusica();
    }


    public void iniciar() {
        iniciar.executar();
    }


    public void pausar() {
        pausar.executar();
    }


    // Função para adicionar uma música
    public void adicionarMusica(String musica) {
        adicionarMusica.executar(musica);
    }
}
