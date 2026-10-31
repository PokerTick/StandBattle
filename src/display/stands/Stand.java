package display.stands;

import java.util.ArrayList;
import java.util.List;

public class Stand {
    private final List<Moves> moves = new ArrayList<>();
    private  final String name;
    private int defence;
    private int healthpoint;
    private int speed;
    private int power;

    public Stand(int defence, String name, int power, int speed) {
        this.defence = defence;
        this.name = name;
        this.healthpoint = 100;
        this.power = power;
        this.speed = speed;
    }

    public void addMove(Moves move){
        moves.add(move);
    }

    public List<Moves> getMoves(){
        return moves;
    }

    public String getName() {
        return name;
    }

    public int getDefence() {
        return defence;
    }

    public int getHealthpoint() {
        return healthpoint;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPower() {
        return power;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setHealthpoint(int healthpoint) {
        this.healthpoint = healthpoint;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
