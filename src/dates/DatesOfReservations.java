package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DatesOfReservations {
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    public Date date01032023 = format.parse("01/03/2023");
    public Date date21042023 = format.parse("21/04/2023");
    public Date date12122025 = format.parse("12/12/2025");
    public DatesOfReservations() throws ParseException {
    }
}