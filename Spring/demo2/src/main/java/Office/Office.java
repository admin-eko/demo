package Office;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Office {
    @Autowired
    private Director director;
    @Autowired
    private Worker worker;
    @Autowired
    private Reception reception;

    public void createOffer() {
        // something with director
    }

    public void takeItems() {
        // something with worker
    }

    private void takeCall() {
        // something with reception
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Reception getReception() {
        return reception;
    }

    public void setReception(Reception reception) {
        this.reception = reception;
    }
}