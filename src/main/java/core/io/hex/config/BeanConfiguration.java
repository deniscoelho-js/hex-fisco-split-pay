package core.io.hex.config;

import core.io.hex.application.core.usecase.SaveNotaFiscalUseCase;
import core.io.hex.application.ports.in.SaveNotaFiscaslInputPort;
import core.io.hex.application.ports.out.SaveNotaFiscaslOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanConfiguration {

    @Bean
    public SaveNotaFiscaslInputPort saveNotaFiscalUseCase(SaveNotaFiscaslOutputPort saveNotaFiscaslOutputPort){
        return new SaveNotaFiscalUseCase(saveNotaFiscaslOutputPort);
    }
}
