package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.sdk.PixSDK;

public class PixGateway implements PagamentoGateway {
    private final PixSDK sdk = new PixSDK();

    @Override
    public void pagar(double valor) {
        sdk.transferir(valor);
    }
}
