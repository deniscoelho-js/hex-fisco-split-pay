package core.io.hex.adapter.dto.request;

import core.io.hex.application.core.domain.enums.MeioPagamento;

import java.time.LocalDateTime;

public record NotaFiscalRequest(
        Long valorTotal,
        String cnpj,
        LocalDateTime dataHora,
        MeioPagamento meioPagamento
) {
}
