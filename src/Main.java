import model.Carta;
import model.CartaDeAtaque;
import model.CartaDeAtaqueEspecial;
import model.Jogador;
import service.TabuleiroVersus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao Jogo de Cartas!\n==================================\n");

        {
            System.out.println("Jogo Versus\n==================================");

            Supplier<Jogador> criaJogador = () -> criarJogador(200, 200, 36, 14);
            TabuleiroVersus jogoVersus = new TabuleiroVersus();
            List<Jogador> jogadoresVersus = List.of(criaJogador.get(), criaJogador.get());
            jogoVersus.inserirJogador(jogadoresVersus);
            int rodada = 1;

            System.out.println("\nJogadores na disputa: ");
            System.out.println(jogadoresVersus.get(0).getNome() + " versus " + jogadoresVersus.get(1).getNome());
            System.out.println("\n=> Começa o jogo cada um com 200 vidas: \n");

            do {
//                for (var j:jogadoresVersus) - iniciado em sala

                jogoVersus.jogar(jogadoresVersus.get(0), jogadoresVersus.get(0).getDeck().get(valor(jogadoresVersus.get(0).getDeck().size() - 1)));
                jogoVersus.jogar(jogadoresVersus.get(1), jogadoresVersus.get(1).getDeck().get(valor(jogadoresVersus.get(1).getDeck().size() - 1)));

                System.out.println("Rodada " + rodada + ": " + jogadoresVersus.get(0).getNome() + " tem " + jogadoresVersus.get(0).getVidas() + " vidas e o " + jogadoresVersus.get(1).getNome() + " tem " + jogadoresVersus.get(1).getVidas() + " vidas\n");
                rodada++;
            } while (jogoVersus.verificaVencedor().isEmpty());
        }

    }

    static Jogador criarJogador(int vida, int pontos, int cartasAtaque, int cartasAtaqueEspecial) {
        List<Carta> deck = new ArrayList<>();
        for (int i = 0; i < cartasAtaque; i++)
            deck.add(new CartaDeAtaque("cartaAtaque" + i, "ATAQUE", valor(10), valor(10), 0));
        for (int i = 0; i < cartasAtaqueEspecial; i++)
            deck.add(new CartaDeAtaqueEspecial("cartaAtaqueEspecial" + i, "ATAQUE ESPECIAL", valor(10), valor(20), 0, ""));
        Collections.shuffle(deck);
        return new Jogador(deck, vida, pontos, "jogador" + valor(500));
    }

    static int valor(int max) {
        return (int) Math.floor(Math.random() * max + 1);
    }
}