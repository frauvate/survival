package locations;
import player.*;
import obstacle.*;

public class Castle extends BattleLocation {
    public Castle(Player player) {
        super(player, "Castle", new Vampire(), "Food", 2, 5);
    }
}