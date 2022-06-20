package example.fw;

import java.time.LocalDate;
import java.time.LocalTime;

public class timeOrDate {

    public static String commands(String cmd){
        if(cmd == null){
            return ( "Параметр отсутсвует");
        }else if (cmd.equals( "time")){
            return ("Текущее время: " + LocalTime.now());
        } else if (cmd.equals("date")) {
            return ("Текущая дата: " + LocalDate.now());
        }else{
            return ("Параметр введен некорректно");
        }
    }
}
