package estabeleciimento;
import equipamento.impressora.Impressora;
import equipamento.impressora.Laserjet;
import equipamento.multifuncional.EquipamentoMultifuncional;
import equipamento.copiadora.Copiadora;
import equipamento.digitalizadora.Digitalizadora;
import equipamento.impressora.Deskjet;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }

}
