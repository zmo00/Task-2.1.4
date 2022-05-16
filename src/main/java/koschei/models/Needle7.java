package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    @Autowired
    private Deth8 deth8;

    @Override
    public String toString() {

        //Для теста
        return ", смерть Кощея на игле :( ";

        //Для Application
//        return ", смерть Кощея на игле :( " + deth8.toString();
    }
}
