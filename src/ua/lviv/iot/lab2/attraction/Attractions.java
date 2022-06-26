package ua.lviv.iot.lab2.attraction;

import java.util.Objects;

public class Attractions {
    private String kind;

    private int cost;

    private String permission;

    private int seat;

    public Attractions() {
    }

    public Attractions(String kind, int cost, String permission, int seat) {
        this.kind = kind;
        this.cost = cost;
        this.permission = permission;
        this.seat = seat;
    }


    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Attractions{" +
                "name='" + kind + '\'' +
                ", cost='" + cost + '\'' +
                ", permission='" + permission + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attractions that = (Attractions) o;
        return Objects.equals(kind, that.kind) && Objects.equals(cost, that.cost)&& Objects.equals(permission, that.permission)&& Objects.equals(seat, that.seat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, cost, permission,seat);
    }
}

