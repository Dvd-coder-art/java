package Iphone;

import Apps.Reprodutor.Spotify;

//Classe Main para testar as funcionalidades
public class Aparelho {
 public static void main(String[] args) {
     // Criando uma instância do Spotify
     Spotify player = new Spotify();
     
     // Testando os métodos
     player.iniciar();  // Inicia a reprodução
     player.adicionarMusica("Shape of You - Ed Sheeran"); // Adiciona a música
     player.pausar();  // Pausa a reprodução
     
 }
}

