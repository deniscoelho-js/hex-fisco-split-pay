package core.io.hex.adapter.dto.response;

import core.io.hex.application.core.domain.enums.MeioPagamento;

import java.time.LocalDateTime;

public record NotaFiscalResponse(
        Long idNotaFiscal,
        Long valorTotal,
        String notaFiscal
) {

}
