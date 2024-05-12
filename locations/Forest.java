package locations;
import player.*;
import obstacle.*;

public class Forest extends BattleLocation {
    public Forest(Player player) {
        super(player, "Forest", new Wolf(), "Wood", 3, 4);
    }
}
