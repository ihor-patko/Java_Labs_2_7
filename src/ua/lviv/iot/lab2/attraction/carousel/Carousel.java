package ua.lviv.iot.lab2.attraction.carousel;

import ua.lviv.iot.lab2.attraction.Attractions;

public class Carousel extends Attractions {
    private String name;

    private String description;

    public Carousel(String kind, int cost, String permission, int seat, String name,String description) {
        super(kind, cost, permission, seat);
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}