package core.io.hex.adapter.dto.mapper;

import core.io.hex.adapter.dto.request.NotaFiscalRequest;
import core.io.hex.adapter.dto.response.NotaFiscalResponse;
import core.io.hex.application.core.domain.NotaFiscal;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NotaFiscalMapperDTO {

    NotaFiscal toNotaFiscal(NotaFiscalRequest notaFiscalRequest);

    NotaFiscalResponse toNotaFiscalResponse(NotaFiscal notaFiscal);
}
