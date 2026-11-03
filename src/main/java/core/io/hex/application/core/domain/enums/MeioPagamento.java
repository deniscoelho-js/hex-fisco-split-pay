package core.io.hex.application.core.domain.enums;

public enum MeioPagamento {
    PIX(0,"PIX"), DINHEIRO(1, "DINHEIRO"), CREDITO(2, "CREDITO"), DEBITO(3, "DEBITO");

    private Integer codigo;
    private String descricao;

    MeioPagamento(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
}
