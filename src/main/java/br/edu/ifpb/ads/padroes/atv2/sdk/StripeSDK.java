package br.edu.ifpb.ads.padroes.atv2.sdk;

public class StripeSDK {
    public void charge(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado via Stripe.");
    }
}
