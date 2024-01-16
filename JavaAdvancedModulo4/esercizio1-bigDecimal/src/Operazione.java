import java.math.BigDecimal;

public class Operazione {
    private BigDecimal number1;
    private BigDecimal number2;
    private EnumTipo typeOfOperazione;

    public Operazione(BigDecimal number1, BigDecimal number2, EnumTipo typeOfOperazione) {
        this.number1 = number1;
        this.number2 = number2;
        this.typeOfOperazione = typeOfOperazione;
    }
    public BigDecimal sum (BigDecimal num1, BigDecimal num2) {
        return num1.add(num2);
    }
    public BigDecimal subtract (BigDecimal num1, BigDecimal num2) {
        return num1.subtract(num2);
    }
    public BigDecimal multiply (BigDecimal num1, BigDecimal num2) {
        return num1.multiply(num2);
    }
    public BigDecimal division (BigDecimal num1, BigDecimal num2) {
        return num1.divide(num2,10);
    }
    public BigDecimal min (BigDecimal num1, BigDecimal num2) {
        return num1.min(num2);
    }
    public BigDecimal max (BigDecimal num1, BigDecimal num2) {
        return num1.max(num2);
    }

    public BigDecimal eseguiOperazione() {
        System.out.println("l'operazione è una: " + typeOfOperazione + "\nI numeri sono: " + number1 + " , " + number2);
        switch (typeOfOperazione) {
            case SOMMA:
                return sum(number1, number2);

            case SOTTRAZIONE:
                return subtract(number1, number2);

            case MOLTIPLICAZIONE:
                return multiply(number1, number2);

            case DIVISIONE:
                return division(number1, number2);

            case MIN:
                return min(number1, number2);

            case MAX:
                return max(number1, number2);
        }
        return BigDecimal.ZERO;
    }
}

