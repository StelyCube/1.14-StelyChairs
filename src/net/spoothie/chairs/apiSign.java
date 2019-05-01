package net.spoothie.chairs;

import java.util.ArrayList;

import org.bukkit.Material;

public class apiSign {
	
	ArrayList<Material> sign = new ArrayList<Material>();
	
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
		if(sign.contains(material)) {
			return true;
		}
		return false;
	}

}
