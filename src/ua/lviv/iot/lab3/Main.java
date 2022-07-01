package ua.lviv.iot.lab3;

import ua.lviv.iot.lab3.entity.Attractions;
import ua.lviv.iot.lab3.entity.carousel.Carousel;
import ua.lviv.iot.lab3.entity.rollerСoaster.Roller;
import ua.lviv.iot.lab3.service.impl.AttractionServiceImpl;

import java.util.*;
import java.util.stream.Collectors;

public class Main extends Attractions {
    public static void main(String[] args) {
        List<Attractions> attractions = new ArrayList();
        Carousel carousel = new Carousel("carousel",42,"adults and children",22,"American",null);
        Carousel carousel2 = new Carousel("carousel",52,"adults and children",24,"Karl",null);
        Roller roller = new Roller("roller",23,"children",15,"Mickey",200);
        attractions.add(carousel);
        attractions.add(roller);
        attractions.add(carousel2);
        System.out.println(Attractions.sortByNumberKidsABS(attractions));
        System.out.println(Attractions.sortByNumberKidsDESC(attractions));
        System.out.println(Attractions.sortByPermissionABS(attractions,"adults and children"));
        System.out.println(Attractions.sortByPermissionDESC(attractions,"adults and children"));

    }

}
