package homework4;

import homework4.Warrior.DistanceAttackerArcher;
import homework4.Warrior.Warrior;

import java.util.List;
import java.util.ArrayList;

public class Team<T extends Warrior> {
    private List<T> team ;
    private String nameTeam ;

    public Team(String name) {
        this.nameTeam = name;
        this.team = new ArrayList<>();
    }

    public Team<T> addWarrior(T warrior) {
        team.add(warrior);
        return this;
    }

    public int getMaxDistance() {
        int distance = 0;
        for (T item : team) {
            if (!(item instanceof DistanceAttackerArcher)) {
                continue;
            }

            DistanceAttackerArcher temp = (DistanceAttackerArcher) item;

            if (temp.getDistance() > distance) {
                distance = temp.getDistance();
            }
        }
        return distance;
    }

    public int getTeamDamage() {
        int sum = 0;
        for (T item : team) {
            sum += item.getMaxDamage();
        }
        return sum;
    }

    public int getMinProtection() {

        int protection = team.get(0).getProtection();

        for (T teamMember : team) {
            if (teamMember.getProtection() < protection) {
                protection = teamMember.getProtection();
            }
        }
        return protection;
    }

    @Override
    public String toString() {
        StringBuilder allTeam = new StringBuilder();
        for (T item : team) {
            allTeam.append(item.toString() + "\n");
        }
        return String.format("Team{ team= %s, maxDistance = %d, maxDamage = %d, minProtection = %d \n%s}",
                nameTeam, getMaxDistance(),  getTeamDamage(), getMinProtection(), allTeam);
    }
}
