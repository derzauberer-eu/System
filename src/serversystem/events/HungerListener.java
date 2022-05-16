package serversystem.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

import serversystem.config.Config;

public class HungerListener implements Listener {
	
	@EventHandler
	public void onFoodLevelChange(FoodLevelChangeEvent event) {
		if (event.getEntity() instanceof Player && !Config.hasWorldHunger(event.getEntity().getWorld().getName())) {
			event.setCancelled(true);
		}
	}

}
