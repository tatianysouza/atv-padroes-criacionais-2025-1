package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.sdk.PayPalSDK;

public class PayPalGateway implements PagamentoGateway {
    private final PayPalSDK sdk = new PayPalSDK();

    @Override
    public void pagar(double valor) {
        sdk.enviarPagamento(valor);
    }
}
