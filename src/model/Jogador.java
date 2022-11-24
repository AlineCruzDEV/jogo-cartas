package model;

import java.util.List;

public class Jogador {

    private List<Carta> deck;

    private Integer vidas;

    private Integer pontos;

    private String nome;

    public Jogador(List<Carta> deck, Integer vidas, Integer pontos, String nome) {
        this.deck = deck;
        this.vidas = vidas;
        this.pontos = pontos;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carta> getDeck() {
        return deck;
    }

    public void setDeck(List<Carta> deck) {
        this.deck = deck;
    }

    public Integer getVidas() {
        return vidas;
    }

    public void setVidas(Integer vidas) {
        this.vidas = vidas;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

}
