package model;

public class CartaDeAtaque extends Carta {

    private final Integer poder;
    private final Integer resistencia;

    public CartaDeAtaque(String nome, String tipo, Integer custo, Integer poder, Integer resistencia) {
        super(nome, tipo, custo);
        this.poder = poder;
        this.resistencia = resistencia;
    }

    public Integer getPoder() {
        return poder;
    }

    public Integer getResistencia() {
        return resistencia;
    }

}
