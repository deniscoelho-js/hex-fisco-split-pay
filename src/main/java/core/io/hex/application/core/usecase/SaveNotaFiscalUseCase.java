package core.io.hex.application.core.usecase;

import core.io.hex.application.core.domain.NotaFiscal;
import core.io.hex.application.ports.in.SaveNotaFiscaslInputPort;
import core.io.hex.application.ports.out.SaveNotaFiscaslOutputPort;

import java.util.UUID;

public class SaveNotaFiscalUseCase implements SaveNotaFiscaslInputPort {

    private final SaveNotaFiscaslOutputPort saveNotaFiscaslOutputPort;

    public SaveNotaFiscalUseCase(SaveNotaFiscaslOutputPort saveNotaFiscaslOutputPort) {
        this.saveNotaFiscaslOutputPort = saveNotaFiscaslOutputPort;
    }

    private String gerarNotaFiscal() {
        return UUID.randomUUID().toString();
    }

    @Override
    public NotaFiscal save(NotaFiscal notaFiscal) {

        NotaFiscal novaNotaFiscal = new NotaFiscal(
                notaFiscal.valorTotal(),
                notaFiscal.cnpj(),
                notaFiscal.dataHora(),
                notaFiscal.meioPagamento(),
                gerarNotaFiscal()
        );

        return saveNotaFiscaslOutputPort.save(novaNotaFiscal);
    }
}

