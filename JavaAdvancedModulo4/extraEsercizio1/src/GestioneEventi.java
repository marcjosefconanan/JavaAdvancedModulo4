// 3. Polimorfismo
// Utilizza il polimorfismo per trattare gli eventi in modo polimorfico. Crea un metodo
// che accetti una lista di eventi e stampi le informazioni specifiche di ciascun evento,
// indipendentemente dal tipo effettivo.

import java.util.List;

public class GestioneEventi {

    public void printEventInfo(List<Evento> eventi) {
        for (Evento evento : eventi) {
            System.out.println("Tipo: " + evento.getTipo().getNomeTipo());
            System.out.println("Data e Ora: " + evento.getDataOra());
            System.out.println();
        }
    }
}

