import java.time.OffsetDateTime;
public class Riunione implements Evento{
    private OffsetDateTime dateAndTime;
    private String type;
    private String place;
    private Integer capacity;

    public Riunione(OffsetDateTime dateAndTime, String place, Integer capacity,String type) {
        this.dateAndTime= dateAndTime;
        this.place = place;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public OffsetDateTime getDataOra() {
        return dateAndTime;
    }
    @Override
    public String getTipo() {
        return "Riunione";
    }
}
