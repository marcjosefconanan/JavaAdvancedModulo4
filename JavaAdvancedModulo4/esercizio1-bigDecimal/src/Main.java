//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum
//Crei un metodo per calcolare l'operazione richiesta  e ritorni il risultato.
//Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Operazione op1 = new Operazione(BigDecimal.valueOf(5),BigDecimal.valueOf(6),EnumTipo.SOMMA);
        Operazione op2 = new Operazione(BigDecimal.valueOf(5),BigDecimal.valueOf(6),EnumTipo.DIVISIONE);
        Operazione op3 = new Operazione(BigDecimal.valueOf(5),BigDecimal.valueOf(6),EnumTipo.MOLTIPLICAZIONE);
        Operazione op4 = new Operazione(BigDecimal.valueOf(5),BigDecimal.valueOf(6),EnumTipo.SOTTRAZIONE);
        Operazione op5 = new Operazione(BigDecimal.valueOf(5),BigDecimal.valueOf(6),EnumTipo.MIN);
        Operazione op6 = new Operazione(BigDecimal.valueOf(5),BigDecimal.valueOf(6),EnumTipo.MAX);


        System.out.println(op1.eseguiOperazione());
        System.out.println(op2.eseguiOperazione());
        System.out.println(op3.eseguiOperazione());
        System.out.println(op4.eseguiOperazione());
        System.out.println(op5.eseguiOperazione());
        System.out.println(op6.eseguiOperazione());
    }
}