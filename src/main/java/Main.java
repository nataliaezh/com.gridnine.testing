import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author natalya_ezhkova@mail.ru
 */
public class Main {
        public static void main(String[] args) {
                FlightBuilder flightBuilder = new FlightBuilder();
                System.out.println(FlightBuilder.createFlights().toString());
                System.out.println("--------------------------------------------");
                String str = FlightBuilder.createFlights().toString();

                String[] parts = str.split(",");
                String firstFlight = parts[0];
                int first = firstFlight.length();
                String secondFlight = parts[1];
                int second = secondFlight.length();
                String thirdFlight = parts[2];
                int third = thirdFlight.length();
                String forthFlight = parts[3];
                int forth = forthFlight.length();
                String fifthFlight = parts[4];
                int fivth = fifthFlight.length();
                String sixthFlight = parts[5];
                int sixth = sixthFlight.length();

                // System.out.println(fifthFlight);
                List<String> flights = new ArrayList<>();
                flights.add(firstFlight);
                flights.add(secondFlight);
                flights.add(thirdFlight);
                flights.add(forthFlight);
                flights.add(fifthFlight);
                flights.add(sixthFlight);

                List<Integer> lengths = new ArrayList<>();
                lengths.add(first);
                lengths.add(second);
                lengths.add(third);
                lengths.add(forth);
                lengths.add(fivth);
                lengths.add(sixth);


        }

        public static void theLongestFlight(ArrayList<String> flights) {
                System.out.println("Самый длительный перелет: " + Collections.max(flights));
        }

        public static void theShortestFlight(ArrayList<String> flights) {
                Collections.max(flights);
                System.out.println("Самый короткий перелет: " + Collections.min(flights));
        }

}