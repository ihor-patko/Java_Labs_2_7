package ua.lviv.iot.lab2;

import ua.lviv.iot.lab2.attraction.Attractions;
import ua.lviv.iot.lab2.attraction.carousel.Carousel;
import ua.lviv.iot.lab2.attraction.rollerCoaster.Roller;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Attractions> attractions = new ArrayList();
        Carousel carousel = new Carousel("carousel",42,"adults and children",22,"American",null);
        Carousel carousel2 = new Carousel("carousel",52,"adults and children",24,"Karl",null);
        Roller roller = new Roller("roller",23,"children",15,"Mickey",200);
        attractions.add(carousel);
        attractions.add(roller);
        attractions.add(carousel2);
        System.out.println("Choose an option:\n" +
                "1 - sorting descending\n" +
                "2 - sorting ascending\n" +
                "3 - sorting by number of places\n" +
                "4 - ending the program\n" +
                "");
        Scanner scanner = new Scanner(System.in);
        do {
            int chose = scanner.nextInt();
            if (chose >= 1 && chose <= 4){
                switch (chose) {
                    case 1:
                        System.out.println("Sorted ascending");
                        List<Attractions> sorted = attractions.stream().sorted(Comparator.comparing(Attractions::getCost)).collect(Collectors.toList());
                        System.out.println(sorted
                                .stream()
                                .filter(a -> a.getPermission()
                                        .equals("adults and children"))
                                .collect(Collectors.toList()));

                        break;
                    case 2:
                        System.out.println("Sorted descending");
                        List<Attractions> reverse = attractions.stream().sorted(Collections.reverseOrder(Comparator.comparing(Attractions::getCost))).collect(Collectors.toList());
                        System.out.println(reverse);
                        System.out.println(reverse
                                .stream()
                                .filter(a -> a.getPermission()
                                        .equals("adults and children"))
                                .collect(Collectors.toList()));
                        break;
                    case 3:
                        System.out.println("Sorted by number of seats");
                        System.out.println(
                                attractions.stream().max(Comparator.comparing(Attractions::getSeat))
                        );
                        break;
                    case 4:
                        System.exit(0);
                }
            }
        }while (true);
    }
}

