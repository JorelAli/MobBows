package io.github.skepter.mobbows;

import org.bukkit.plugin.java.JavaPlugin;

public class MobBows extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new MobBowsListener(), this);
		getCommand("mb").setExecutor(new MBCommandExecutor(this));
		MobBowsRecipes.registerRecipes();
		getLogger().info("MobBows" + getDescription().getVersion() + " activated!");
	}

	@Override
	public void onDisable() {
		getLogger().info("MobBows" + getDescription().getVersion() + " de-activated!");
	}
}
