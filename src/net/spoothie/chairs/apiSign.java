package net.spoothie.chairs;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;

public class apiSign {
	
	ArrayList<Material> sign = new ArrayList<Material>();
	
	public apiSign() {
		AllSign();
	}
	
	public ArrayList<Material> AllSign() {
		for(Material signm : Material.values())
			if(signm.name().contains("SIGN")) {
				if(!sign.contains(signm)) {
					sign.add(signm);
				}
			}
		return sign;
	}

	public boolean contain(Material material) {
		if(!sign.isEmpty()) {
			if(sign.contains(material)) {
				Bukkit.broadcastMessage("Debug : "+ material.name());
				return true;
			}
		}else {
			AllSign();
		}
		return false;
	}

}
