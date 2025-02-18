import java.time.LocalDateTime;

public abstract class Event implements Comparable<Event>, Completable{
    public LocalDateTime dateTime;
    public String name;

    public Event(String name, LocalDateTime dateTime){
        this.dateTime = dateTime;
        this.name = name;
    }
    public final String getName(){
        return this.name;
    }
    public LocalDateTime getDateTime(){
        return dateTime;
    }
    public void setDateTime(LocalDateTime dateTime){
        this.dateTime = dateTime;
    }
    public void setName(String name){
        this.name = name;
    }
    public int compareTo(Event e){
        int later = dateTime.compareTo(e.getDateTime());
        return later;
    }
}
