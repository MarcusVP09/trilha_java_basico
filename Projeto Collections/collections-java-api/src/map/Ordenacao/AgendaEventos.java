package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento= new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
       // Set<LocalDate> dateSet = eventosMap.keySet();
       // Collection<Evento> values = eventoMap.values();
       LocalDate dataAtual = LocalDate.now();
       LocalDate proximaData = null;
       Evento proximEvento = null;
       Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
       for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
        if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
            proximaData = entry.getKey();
            proximEvento = entry.getValue();
            
            System.out.println("O proximo evento: " + proximEvento + " acontecerá na data " + proximaData);
            break;
        }
       }
    

    }


    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2002, Month.JANUARY, 10), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 25), "Evento 4", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 26), "Evento 5", "Atração 5");

        agendaEventos.exibirAgenda();


        agendaEventos.obterProximoEvento();

        //System.out.println(LocalDate.now());
       // System.out.println("O proximo evento será na data: " + obterProximoEvento());
    }

}
