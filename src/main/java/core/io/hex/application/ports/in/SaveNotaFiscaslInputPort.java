package core.io.hex.application.ports.in;

import core.io.hex.application.core.domain.NotaFiscal;

public interface SaveNotaFiscaslInputPort {
    NotaFiscal save(NotaFiscal notaFiscal);
}
