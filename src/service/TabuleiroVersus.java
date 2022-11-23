package service;

import model.Carta;
import model.Jogador;

import java.util.List;
import java.util.Optional;

public class TabuleiroVersus implements Tabuleiro {


    private List<Jogador> jogadores;

    @Override
    public void inserirJogador(List<Jogador> jogadores) {

        if (jogadores.size() != 2){
            throw new IllegalArgumentException("Deve haver apenas 2 jogadores");
        }

        this.jogadores = jogadores;

    }

    @Override
    public Boolean jogar(Jogador jogador, Carta carta) {

        if(jogador.getPontos() >=  carta.getCusto()){

        } else {

        }

        return null;
    }

    @Override
    public Optional<Jogador> verificaVencedor() {
        if(jogadores.get(0).getVidas() == 0){
            return Optional.of(jogadores.get(1));
        } else if(jogadores.get(1).getVidas() == 0) {
            return Optional.of(jogadores.get(0));
        } else {
            return Optional.empty();
        }
    }

}
