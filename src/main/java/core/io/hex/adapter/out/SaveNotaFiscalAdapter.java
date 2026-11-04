package core.io.hex.adapter.out;

import core.io.hex.adapter.out.repository.NotaFiscalRepository;
import core.io.hex.adapter.out.repository.mapper.NotaFiscalMapper;
import core.io.hex.application.core.domain.NotaFiscal;
import core.io.hex.application.ports.out.SaveNotaFiscaslOutputPort;
import org.springframework.stereotype.Component;

@Component
public class SaveNotaFiscalAdapter implements SaveNotaFiscaslOutputPort {

    private final NotaFiscalRepository notaFiscalRepository;

    private final NotaFiscalMapper notaFiscalMapper;

    public SaveNotaFiscalAdapter(NotaFiscalRepository notaFiscalRepository, NotaFiscalMapper notaFiscalMapper) {
        this.notaFiscalRepository = notaFiscalRepository;
        this.notaFiscalMapper = notaFiscalMapper;
    }

    @Override
    public NotaFiscal save(NotaFiscal notaFiscal) {
        return notaFiscalMapper.toNotaFiscal(
                notaFiscalRepository.save(
                        notaFiscalMapper.toNotaFiscalEntity(notaFiscal)
                )
        );
    }
}
