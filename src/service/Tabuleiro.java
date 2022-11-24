package service;

import model.Carta;
import model.CartaDeAtaque;
import model.Jogador;

import java.util.List;
import java.util.Optional;

public abstract class Tabuleiro {

    protected List<Jogador> jogadores;

    public abstract void inserirJogador(List<Jogador> jogadores);

    public Boolean jogar(Jogador jogador, Carta carta) {
        if (jogador.getPontos() >= carta.getCusto()) {
            jogador.setPontos(jogador.getPontos() - carta.getCusto());
            System.out.println(jogador.getNome() + " joga " + carta.getTipo());
            if (carta instanceof CartaDeAtaque ataque) {
                for (Jogador j : jogadores) {
                    if (j != jogador) {
                        j.setVidas(j.getVidas() - ataque.getPoder());
                        System.out.println("Causa dano de "+ataque.getPoder());
                    }
                }
            }
            return true;
        }
        return false;
    }

    public Optional<Jogador> verificaVencedor() {
        var jogadoresRestantes = jogadores.stream().filter(j -> j.getVidas() > 0).toList();
        if (jogadoresRestantes.size() == 1) {
            System.out.println("========\nVencedor: " + jogadoresRestantes.get(0).getNome());
            return Optional.of(jogadoresRestantes.get(0));
        }
        return Optional.empty();
    }

}
