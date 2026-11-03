package core.io.hex.adapter.out.repository.entity;

import core.io.hex.application.core.domain.enums.MeioPagamento;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotaFiscalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long idNotaFiscal;
    private Long valorTotal;
    private String cnpj;
    private LocalDateTime dataHora;
    private MeioPagamento meioPagamento;
    private String notaFiscal;
}
