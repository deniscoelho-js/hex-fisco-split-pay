package core.io.hex.application.ports.out;

import core.io.hex.application.core.domain.NotaFiscal;

public interface SaveNotaFiscaslOutputPort {
    NotaFiscal save(NotaFiscal notaFiscal);
}
