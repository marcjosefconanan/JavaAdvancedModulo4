import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class OperazioneTest {

    @Test
    void testSum() {
        //1. Andare a richiamare l'istanza
        Operazione operazione = new Operazione(BigDecimal.valueOf(5), BigDecimal.valueOf(3), EnumTipo.SOMMA);
        //2. Andare a richiamare il metod.
        BigDecimal result = operazione.eseguiOperazione();
        //3. Inserire nel motodo dei valori di ingresso che facciamo passare il test
        assertEquals(BigDecimal.valueOf(8), result);
    }

    @org.junit.jupiter.api.Test
    void testSubtract() {
        Operazione operazione = new Operazione(BigDecimal.valueOf(5), BigDecimal.valueOf(3), EnumTipo.SOTTRAZIONE);
        BigDecimal result = operazione.eseguiOperazione();
        assertEquals(BigDecimal.valueOf(2), result);
    }

    @org.junit.jupiter.api.Test
    void testMultiply() {
        Operazione operazione = new Operazione(BigDecimal.valueOf(5), BigDecimal.valueOf(3), EnumTipo.MOLTIPLICAZIONE);
        BigDecimal result = operazione.eseguiOperazione();
        assertEquals(BigDecimal.valueOf(15), result);
    }

    @org.junit.jupiter.api.Test
    void testDivision() {
        Operazione operazione = new Operazione(BigDecimal.valueOf(6), BigDecimal.valueOf(3), EnumTipo.DIVISIONE);
        assertEquals(BigDecimal.valueOf(2), operazione.division(new BigDecimal(6),new BigDecimal(3)));
    }

    @org.junit.jupiter.api.Test
    void testMin() {
        Operazione operazione = new Operazione(BigDecimal.valueOf(5), BigDecimal.valueOf(3), EnumTipo.MIN);
        BigDecimal result = operazione.eseguiOperazione();
        assertEquals(BigDecimal.valueOf(3), result);
    }

    @org.junit.jupiter.api.Test
    void testMax() {
        Operazione operazione = new Operazione(BigDecimal.valueOf(5), BigDecimal.valueOf(3), EnumTipo.MAX);
        BigDecimal result = operazione.eseguiOperazione();
        assertEquals(BigDecimal.valueOf(5), result);
    }

}
