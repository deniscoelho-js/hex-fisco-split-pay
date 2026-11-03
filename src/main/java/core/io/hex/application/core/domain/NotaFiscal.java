package core.io.hex.application.core.domain;

import core.io.hex.application.core.domain.enums.MeioPagamento;

import java.time.LocalDateTime;

public record NotaFiscal (
     Long valorTotal,
     String cnpj,
     LocalDateTime dataHora,
     MeioPagamento meioPagamento,
     String notaFiscal
){}