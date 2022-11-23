package service;

import model.Carta;
import model.Jogador;

import java.util.List;
import java.util.Optional;

public interface Tabuleiro {

    public void inserirJogador(List<Jogador> jogador);

    public Boolean jogar(Jogador jogador, Carta carta);

    public Optional<Jogador> verificaVencedor();

}
