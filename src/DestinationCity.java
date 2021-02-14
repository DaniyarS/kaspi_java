import java.util.*;

public class DestinationCity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        List<List<String>> cities = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            List<String> cityPair = new ArrayList<>();
            String city1 = sc.next();
            String city2 = sc.next();

            cityPair.add(city1);
            cityPair.add(city2);

            cities.add(cityPair);
        }

        String dest = destCity(cities);

        System.out.println(dest);
    }

    public static String destCity(List<List<String>> paths) {
        if (paths.size() == 1) return paths.get(0).get(1);

        ArrayList<String> city = new ArrayList<>();
        for (List<String> cityPair : paths) {
            city.add(cityPair.get(1));
        }

        System.out.println(city);

        for (List<String> cityPair : paths) {
            if (Collections.frequency(city, cityPair.get(1)) >= 2) city.remove(cityPair.get(1));
        }

        return city.get(0);
    }
}
