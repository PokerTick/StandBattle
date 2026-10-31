package display.stands;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StandList{
    private static final Random random = new Random();

    public static Stand StarPlatinum(){
        Stand stand = new Stand(30, "Star Platinum",20, 70);
        stand.addMove(new Moves("Ora Rush", 35));
        stand.addMove(new Moves("Star Finger", 30));
        return stand;
    }
    public static Stand TheWorld(){
        Stand stand = new Stand(30, "The World",20, 70);
        stand.addMove(new Moves("Muda Rush", 35));
        stand.addMove(new Moves("Kick Barrage", 30));
        return stand;
    }
    public static Stand SilverChariot(){
        Stand stand = new Stand(20, "Silver Chariot",20, 50);
        stand.addMove(new Moves("Fencing Barrage", 20));
        stand.addMove(new Moves("True Slash", 40));
        return stand;
    }

    public static List<Stand> getAllStands(){
        List<Stand> list = new ArrayList<>();
        list.add(StarPlatinum());
        list.add(TheWorld());
        list.add(SilverChariot());
        return list;
    }

    public Stand getRandomStand(){
        List<Stand> all = new ArrayList<>();
        return all.get(random.nextInt(all.size()));
    }
}
