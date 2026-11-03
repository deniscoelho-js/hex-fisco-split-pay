package core.io.hex.application.core.usecase;

import core.io.hex.application.core.domain.NotaFiscal;
import core.io.hex.application.ports.in.SaveNotaFiscaslInputPort;
import core.io.hex.application.ports.out.SaveNotaFiscaslOutputPort;

public class SaveNotaFiscalUseCase implements SaveNotaFiscaslInputPort {

    private final SaveNotaFiscaslOutputPort saveNotaFiscaslOutputPort;

    public SaveNotaFiscalUseCase(SaveNotaFiscaslOutputPort saveNotaFiscaslOutputPort) {
        this.saveNotaFiscaslOutputPort = saveNotaFiscaslOutputPort;
    }

    @Override
    public NotaFiscal save(NotaFiscal notaFiscal) {
        return saveNotaFiscaslOutputPort.save(notaFiscal);
    }
}

