package io.github.DatingSimulation.Quests;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("PrisonQuests has been enabled");
	}
	
	@Override
	public void onDisable() {
		getLogger().info("PrisonQuests has been disabled");
	}
}