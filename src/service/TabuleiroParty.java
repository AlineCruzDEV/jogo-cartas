package service;

import model.Jogador;

import java.util.List;

public class TabuleiroParty extends Tabuleiro {

    @Override
    public void inserirJogador(List<Jogador> jogadores) {
        if (jogadores.size() != 5) {
            throw new IllegalArgumentException("Deve haver apenas 5 jogadores");
        }
        for (var j : jogadores)
            if (j.getDeck().size() != 80) throw new IllegalArgumentException("Necessarias 80 cartas");
        this.jogadores = jogadores;
    }

}

