import java.time.LocalDateTime;

public class Deadline extends Event implements Completable{
    private boolean complete = false;

    public Deadline(String name, LocalDateTime deadline) {
        super(name, deadline);
    }
    public void complete(){
        this.complete = true;
    }
    public boolean isComplete(){
        return complete;
    }

}
