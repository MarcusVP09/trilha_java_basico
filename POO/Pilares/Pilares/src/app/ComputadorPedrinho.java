package app;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
        /*NAO SE SABE QUAL APP
         * MAS QUALQUER UM DEVERA ENVIAR E RECEBER MENSAGEM
         */
        String appEscolhido = "msn";
        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FBMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new TLGMessenger();

        smi.enviarMensagem();
        smi.receberMensagem();

        // smi.validarConectadoInternet();
    }
}
