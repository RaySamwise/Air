import com.skillbox.airport.Airport;

public class Main
{
    public static void main(String[] args)
    {
        Airport jfk =  Airport.getInstance();
        System.out.println("Всего самолетов: " + jfk.getAllAircrafts().size());

     //   System.out.println(jfk.getTerminals());

    }
}
