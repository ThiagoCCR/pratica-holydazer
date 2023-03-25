import java.util.HashMap;
import java.util.Map;

public class HolydaysChecker {

    Map<String, String> HolidaysList = new HashMap<String, String>();

    public HolydaysChecker() {
        HolidaysList.put("01/01/2023", "Confraternização mundial");
        HolidaysList.put("21/02/2023", "Carnaval");
        HolidaysList.put("17/04/2023", "Páscoa");
        HolidaysList.put("21/04/2023", "Tiradentes");
        HolidaysList.put("01/05/2023", "Dia do trabalho");
        HolidaysList.put("08/06/2023", "Corpus Christi");
        HolidaysList.put("07/09/2023", "Independência do Brasil");
        HolidaysList.put("12/10/2023", "Nossa Senhora Aparecida");
        HolidaysList.put("02/11/2023", "Finados");
        HolidaysList.put("25/12/2023", "Natal");
    }

    public void getHolidaysList() {
        System.out.println(HolidaysList);
        // holidays.forEach((key, value) -> System.out.println(key+": "+value));
    }

    public void searchHoliday(String date){
        String holiday = HolidaysList.get(date);
        if(holiday != null){
            System.out.println("O feriado para o dia " + date + " é: " + holiday);
            return;
        }
        System.out.println("Não há feriado neste dia");
    }

}
