package com.gestao_plano.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Gestão de Planos e Pacotes",
                version = "1.0",
                description = "API para gestão de planos e pacotes de telefonia móvel"
        )
)
public class SwaggerConfig {
    // Não é necessário definir um bean para o Docket com springdoc-openapi
}
