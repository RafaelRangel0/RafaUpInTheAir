package me.rafa.second_listener.hit;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import me.rafa.second_listener.Main;
import me.rafa.second_listener.utils.*;

public class Hit_listener implements Listener {
	private Main plugin;
	
	
	public	Hit_listener (Main plugin)
	{
		this.plugin = plugin;
			Bukkit.getPluginManager().registerEvents(this, plugin);
			
	}
	@EventHandler
	public void onHit(EntityDamageByEntityEvent e) {
		if (e.getEntity() instanceof Player && e.getDamager() instanceof Player){
			
			
			Player p = (Player) e.getDamager();
			/**
			World nether = Bukkit.getServer().getWorld("_nether");
			p.teleport(nether.getSpawnLocation());
			Bukkit.broadcastMessage(Utils.chat("&b"+p.getName() + "&6 has been punished for their wrongdoings"));
			*/
			
			World w = p.getWorld();
			
			
			
			
			Location playerLoc = p.getLocation();
			
			double x = playerLoc.getX();
			double y = 300.0;
			double z = playerLoc.getZ();
			
			
			
			
			Location loc = new Location(w,x,y,z);
			
			p.teleport(loc);
			
			
		}
		
	}
}
