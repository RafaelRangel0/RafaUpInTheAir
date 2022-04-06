package me.rafa.second_listener;

import org.bukkit.plugin.java.JavaPlugin;

import me.rafa.second_listener.hit.Hit_listener;

	public class Main extends JavaPlugin{
		@Override
		public void onEnable() 
		{
			new Hit_listener(this);
		}
	}
