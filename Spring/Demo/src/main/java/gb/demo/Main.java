package gb.demo;

import gb.demo.Office.Director;
import gb.demo.Office.Office;
import gb.demo.Office.Reception;
import gb.demo.Office.Worker;
import gb.demo.configuration.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
//        Office office = new Office();
//        Director director = new Director();
//        Reception reception = new Reception();
//        Worker worker = new Worker();
//        office.setDirector(director);
//        office.setReception(reception);
//        office.setWorker(worker);

        System.out.println(context);
        // something with office

    }
}
