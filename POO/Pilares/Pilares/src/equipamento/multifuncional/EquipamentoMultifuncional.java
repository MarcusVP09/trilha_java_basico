package equipamento.multifuncional;

import equipamento.copiadora.Copiadora;
import equipamento.digitalizadora.Digitalizadora;
import equipamento.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    public void imprimir() {
        System.out.println("Imprimindo via equipamanto multifuncional");
    }

    public void digitalizar() {
        System.out.println("Digitalizando via equipamanto multifuncional");
    }

     public void copiar() {
        
        System.out.println("Copiando via equipamanto multifuncional");
    }

}
