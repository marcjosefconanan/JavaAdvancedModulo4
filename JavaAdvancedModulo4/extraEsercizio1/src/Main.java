import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

//Sistema di gestione Eventi: Interface, Polimorfismo, Date, Testing
//Immagina di dover sviluppare un sistema di gestione degli eventi che tenga traccia di diversi tipi di
//eventi, come riunioni e promemoria. Il sistema deve consentire di ordinare gli eventi in base alla
//loro data e ora e fornire un meccanismo per filtrare gli eventi futuri. La traccia include l'utilizzo di
//concetti come interfacce, polimorfismo, la classe OffsetDateTime di Java per gestire date e orari, e
//la scrittura di test JUnit per verificare il corretto funzionamento del sistema.
//Requisiti:
//1. Interfaccia Evento:
//o Crea un'interfaccia chiamata Evento che definisca i metodi comuni a tutti gli eventi,
//come getDataOra(), getTipo(), ecc. Gli eventi possono includere riunioni,
//promemoria, o altri tipi a tua scelta.
//2. Classi che implementano l'interfaccia Evento:
//o Implementa almeno due classi che implementano l'interfaccia Evento, ad esempio
//Riunione e Promemoria. Ogni classe dovrebbe fornire una propria implementazione
//dei metodi dell'interfaccia.
//3. Polimorfismo:
//o Utilizza il polimorfismo per trattare gli eventi in modo polimorfico. Crea un metodo
//che accetti una lista di eventi e stampi le informazioni specifiche di ciascun evento,
//indipendentemente dal tipo effettivo.
//4. Utilizzo di OffsetDateTime:
//o Usa la classe OffsetDateTime di Java per gestire la data e l'ora degli eventi. Ogni
//evento dovrebbe avere una data e un'ora associate.
//5. Metodi di ordinamento e filtraggio:
//o Implementa metodi che consentano di ordinare gli eventi in base alla data e all'ora.
//Inoltre, crea un meccanismo per ottenere una lista filtrata di eventi che si
//verificheranno in futuro.
//6. Testing:
//o Scrivi test JUnit per verificare il corretto funzionamento delle classi e dei metodi,
//inclusi i metodi di ordinamento e di filtraggio degli eventi. Assicurati di coprire
//diversi casi di test, inclusi casi normali e casi limite.
//Suggerimenti:
//• Puoi considerare l'uso di liste o collezioni per gestire gli eventi nel tuo sistema.
//• Assicurati di utilizzare adeguatamente le interfacce e il polimorfismo per trattare gli eventi
//in modo flessibile.
//Questa traccia dovrebbe darti una base solida per esplorare e applicare i concetti di polimorfismo,
//interfacce, gestione del tempo con OffsetDateTime e scrittura di test JUnit in un contesto pratico
public class Main {
    public static void main(String[] args) {
        Compleanno compleannoEvent = new Compleanno(OffsetDateTime.now(), "Home", 20);
        Riunione riunioneEvent = new Riunione(OffsetDateTime.now().plusDays(2), "Office", 10);

        List<Evento> eventList = new ArrayList<>();
        eventList.add(compleannoEvent);
        eventList.add(riunioneEvent);

        GestioneEventi gestioneEventi = new GestioneEventi();
        gestioneEventi.printEventInfo(eventList);
    }
}

