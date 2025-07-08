package br.edu.ifpb.ads.padroes.atv2.service;

import br.edu.ifpb.ads.padroes.atv2.gateway.PagamentoGateway;
import com.google.inject.AbstractModule;

public class GatewayModule extends AbstractModule {
    private final Class<? extends PagamentoGateway> gatewayClass;

    public GatewayModule(Class<? extends PagamentoGateway> gatewayClass) {
        this.gatewayClass = gatewayClass;
    }

    @Override
    protected void configure() {
        bind(PagamentoGateway.class).to(gatewayClass);
    }
}
