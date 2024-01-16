import java.time.OffsetDateTime;
public class Compleanno implements Evento{

    private OffsetDateTime dateAndTime;
    private String type;
    private String place;
    private Integer capacity;

    public Compleanno(OffsetDateTime dateAndTime, String type, String place, Integer capacity) {
        this.dateAndTime = dateAndTime;
        this.type = type;
        this.place = place;
        this.capacity = capacity;
    }

    @Override
    public OffsetDateTime getDataOra() {
        return dateAndTime;
    }
    @Override
    public String getTipo() {
        return "Compleanno";
    }
}
