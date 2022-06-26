package ua.lviv.iot.lab3.entity.rollerСoaster;

import ua.lviv.iot.lab3.entity.Attractions;

public class Roller extends Attractions {
    private String name;

    private int length;

    public Roller(String kind, int cost, String permission, int seat, String name,int length) {
        super(kind, cost, permission, seat);
        this.name = name;
        this.length = length;

    }


}
