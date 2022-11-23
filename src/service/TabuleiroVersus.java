package service;

import model.Jogador;

import java.util.List;

public class TabuleiroVersus extends Tabuleiro {

    @Override
    public void inserirJogador(List<Jogador> jogadores) {
        if (jogadores.size() != 2) {
            throw new IllegalArgumentException("Deve haver apenas 2 jogadores");
        }
        for (var j : jogadores)
            if (j.getDeck().size() != 50) throw new IllegalArgumentException("Necessarias 50 cartas");
        this.jogadores = jogadores;
    }

}
