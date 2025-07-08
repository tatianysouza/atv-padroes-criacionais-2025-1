package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.gateway.PagSeguroGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.PayPalGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.PixGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.StripeGateway;
import br.edu.ifpb.ads.padroes.atv2.service.GatewayModule;
import br.edu.ifpb.ads.padroes.atv2.service.PagamentoService;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        // PayPal
        Injector injectorPayPal = Guice.createInjector(new GatewayModule(PayPalGateway.class));
        PagamentoService servicePayPal = injectorPayPal.getInstance(PagamentoService.class);
        servicePayPal.pagar(100.0);

        // Stripe
        Injector injectorStripe = Guice.createInjector(new GatewayModule(StripeGateway.class));
        PagamentoService serviceStripe = injectorStripe.getInstance(PagamentoService.class);
        serviceStripe.pagar(200.0);

        // PagSeguro
        Injector injectorPagSeguro = Guice.createInjector(new GatewayModule(PagSeguroGateway.class));
        PagamentoService servicePagSeguro = injectorPagSeguro.getInstance(PagamentoService.class);
        servicePagSeguro.pagar(300.0);

        // PIX
        Injector injectorPix = Guice.createInjector(new GatewayModule(PixGateway.class));
        PagamentoService servicePix = injectorPix.getInstance(PagamentoService.class);
        servicePix.pagar(400.0);

    }
}
