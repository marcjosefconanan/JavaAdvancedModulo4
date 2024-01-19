import java.time.OffsetDateTime;

public class Compleanno implements Evento {

    private OffsetDateTime dateAndTime;
    private EnumTipo type;
    private String place;
    private Integer capacity;

    public Compleanno(OffsetDateTime dateAndTime, String place, Integer capacity) {
        this.dateAndTime = dateAndTime;
        this.place = place;
        this.capacity = capacity;
        this.type = EnumTipo.COMPLEANNO;
    }

    @Override
    public OffsetDateTime getDataOra() {
        return dateAndTime;
    }

    @Override
    public EnumTipo getTipo() {
        return type;
    }
}
