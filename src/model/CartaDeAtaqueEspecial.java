package model;

public class CartaDeAtaqueEspecial extends CartaDeAtaque {

    private final String efeito;

    public CartaDeAtaqueEspecial(String nome, String tipo, Integer custo, Integer poder, Integer resistencia,
                                 String efeito) {
        super(nome, tipo, custo, poder, resistencia);
        this.efeito = efeito;
    }

    public String getEfeito() {
        return efeito;
    }

}
