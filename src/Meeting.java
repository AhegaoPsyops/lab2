import java.time.Duration;
import java.time.LocalDateTime;

public class Meeting extends Event implements Completable{
    String location;
    LocalDateTime start;
    LocalDateTime endDateTime;
    boolean complete = false;
    public Meeting(String name, LocalDateTime start, LocalDateTime end, String location) {
        super(name, start);
        this.start = start;
        this.endDateTime = end;
        this.location = location;

    }
    public void complete(){
        complete = true;
    }
    public boolean isComplete(){
        return complete;
    }
    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }
    public Duration getDuration() {
        return Duration.between(start, endDateTime);
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setEndDateTime(LocalDateTime end){
        this.endDateTime = end;
    }
}
