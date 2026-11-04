package core.io.hex.adapter.out.repository.mapper;

import core.io.hex.adapter.out.repository.entity.NotaFiscalEntity;
import core.io.hex.application.core.domain.NotaFiscal;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NotaFiscalMapper {

    NotaFiscal toNotaFiscal(NotaFiscalEntity notaFiscalEntity);

    NotaFiscalEntity toNotaFiscalEntity(NotaFiscal notaFiscal);
}
