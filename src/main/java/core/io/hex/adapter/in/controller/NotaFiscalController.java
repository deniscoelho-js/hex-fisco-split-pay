package core.io.hex.adapter.in.controller;

import core.io.hex.adapter.dto.mapper.NotaFiscalMapperDTO;
import core.io.hex.adapter.dto.request.NotaFiscalRequest;
import core.io.hex.adapter.dto.response.NotaFiscalResponse;
import core.io.hex.application.core.domain.NotaFiscal;
import core.io.hex.application.ports.in.SaveNotaFiscaslInputPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fisco")
public class NotaFiscalController {

    private final SaveNotaFiscaslInputPort saveNotaFiscaslInputPort;
    private final NotaFiscalMapperDTO notaFiscalMapperDTO;

    public NotaFiscalController(SaveNotaFiscaslInputPort saveNotaFiscaslInputPort, NotaFiscalMapperDTO notaFiscalMapperDTO) {
        this.saveNotaFiscaslInputPort = saveNotaFiscaslInputPort;
        this.notaFiscalMapperDTO = notaFiscalMapperDTO;
    }

    @PostMapping
    public ResponseEntity<NotaFiscalResponse> salvarNotaFiscal(@RequestBody NotaFiscalRequest notaFiscalRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                notaFiscalMapperDTO.toNotaFiscalResponse(
                        saveNotaFiscaslInputPort.save(
                                notaFiscalMapperDTO.toNotaFiscal(notaFiscalRequest)
                        )
                )
        );
    };
}
