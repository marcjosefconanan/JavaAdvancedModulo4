// 1. Interfaccia Evento
// Crea un'interfaccia chiamata Evento che definisca i metodi comuni a tutti gli eventi,
// come getDataOra(), getTipo(), ecc. Gli eventi possono includere riunioni,
// promemoria, o altri tipi a tua scelta.
import java.time.OffsetDateTime;

public interface Evento {
    OffsetDateTime getDataOra();
    EnumTipo getTipo();
}


