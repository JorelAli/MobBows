package io.github.skepter.mobbows;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MobBowsItems {
	
	private static ArrayList<String> bowLores() {
		ArrayList<String> arr = new ArrayList();
		arr.add("Zombie I");
		arr.add("Creeper I");
		arr.add("Creeper II");
		arr.add("Spider I");
		arr.add("Skeleton I");
		arr.add("Blaze I");
		arr.add("Ghast I");
		arr.add("Slime I");
		arr.add("Magma I");
		arr.add("Wither Skeleton I");
		arr.add("Silverfish I");
		arr.add("Zombie Pigman I");
		arr.add("Enderman I");
		arr.add("Ocelot I");
		arr.add("Cow I");
		arr.add("Wolf I");
		arr.add("Pig I");
		arr.add("Chicken I");
		arr.add("Horse I");
		arr.add("Sheep I");
		arr.add("Mooshroom I");
		arr.add("Villager I");
		arr.add("Squid I");
		return null;
	}
	
	/**
	 * Creates a bow. For name, use the mob name (e.g. "Zombie")
	 */
	private static ItemStack createBow(String name, int power) {
		ItemStack is = new ItemStack(Material.BOW, 1);
		ItemMeta meta = is.getItemMeta();
		meta.setDisplayName(name + " Bow");
		meta.setLore(Arrays.asList(new String[] {name + " " + power}));
		is.setItemMeta(meta);
		return is;
	}
	
	public static ItemStack getBow(EntityType entity) {
		return createBow(Utils.entityTypeToString(entity), 1);
	}

	public static ItemStack zombieBow() {
		return createBow("Zombie", 1);
	}

	public static ItemStack creeperBow() {
		ItemStack creeperbow = new ItemStack(Material.BOW, 1);
		ItemMeta im = creeperbow.getItemMeta();
		im.setDisplayName("Creeper Bow");
		String[] creeperbowLore = { ChatColor.GRAY + "Creeper I" };
		im.setLore(Arrays.asList(creeperbowLore));
		creeperbow.setItemMeta(im);
		return creeperbow;
	}

	public static ItemStack spiderBow() {
		ItemStack spiderbow = new ItemStack(Material.BOW, 1);
		ItemMeta im = spiderbow.getItemMeta();
		im.setDisplayName("Spider Bow");
		String[] spiderbowLore = { ChatColor.GRAY + "Spider I" };
		im.setLore(Arrays.asList(spiderbowLore));
		spiderbow.setItemMeta(im);
		return spiderbow;
	}

	public static ItemStack skeletonBow() {
		ItemStack skeletonbow = new ItemStack(Material.BOW, 1);
		ItemMeta im = skeletonbow.getItemMeta();
		im.setDisplayName("Skeleton Bow");
		String[] skeletonbowLore = { ChatColor.GRAY + "Skeleton I" };
		im.setLore(Arrays.asList(skeletonbowLore));
		skeletonbow.setItemMeta(im);
		return skeletonbow;
	}

	public static ItemStack blazeBow() {
		ItemStack blazebow = new ItemStack(Material.BOW, 1);
		ItemMeta im = blazebow.getItemMeta();
		im.setDisplayName("Blaze Bow");
		String[] blazebowLore = { ChatColor.GRAY + "Blaze I" };
		im.setLore(Arrays.asList(blazebowLore));
		blazebow.setItemMeta(im);
		return blazebow;
	}

	public static ItemStack ghastBow() {
		ItemStack ghastbow = new ItemStack(Material.BOW, 1);
		ItemMeta im = ghastbow.getItemMeta();
		im.setDisplayName("Ghast Bow");
		String[] ghastbowLore = { ChatColor.GRAY + "Ghast I" };
		im.setLore(Arrays.asList(ghastbowLore));
		ghastbow.setItemMeta(im);
		return ghastbow;
	}

	public static ItemStack slimeBow() {
		ItemStack slimebow = new ItemStack(Material.BOW, 1);
		ItemMeta im = slimebow.getItemMeta();
		im.setDisplayName("Slime Bow");
		String[] slimebowLore = { ChatColor.GRAY + "Slime I" };

		im.setLore(Arrays.asList(slimebowLore));
		slimebow.setItemMeta(im);
		return slimebow;
	}

	public static ItemStack magmaBow() {
		ItemStack magmabow = new ItemStack(Material.BOW, 1);
		ItemMeta im = magmabow.getItemMeta();
		im.setDisplayName("Magma Bow");
		String[] magmabowLore = { ChatColor.GRAY + "Magma I" };
		im.setLore(Arrays.asList(magmabowLore));
		magmabow.setItemMeta(im);
		return magmabow;
	}

	public static ItemStack witherSkeletonBow() {
		ItemStack witherskeletonbow = new ItemStack(Material.BOW, 1);
		ItemMeta im = witherskeletonbow.getItemMeta();
		im.setDisplayName("Wither Skeleton Bow");
		String[] witherskeletonbowLore = { ChatColor.GRAY + "Wither Skeleton I" };
		im.setLore(Arrays.asList(witherskeletonbowLore));
		witherskeletonbow.setItemMeta(im);
		return witherskeletonbow;
	}

	public static ItemStack silverfishBow() {
		ItemStack silverfishbow = new ItemStack(Material.BOW, 1);
		ItemMeta im = silverfishbow.getItemMeta();
		im.setDisplayName("Silverfish Bow");
		String[] silverfishbowLore = { ChatColor.GRAY + "Silverfish I" };
		im.setLore(Arrays.asList(silverfishbowLore));
		silverfishbow.setItemMeta(im);
		return silverfishbow;
	}

	public static ItemStack witchBow() {
		ItemStack witchbow = new ItemStack(Material.BOW, 1);
		ItemMeta im = witchbow.getItemMeta();
		im.setDisplayName("Witch Bow");
		String[] witchbowLore = { ChatColor.GRAY + "Witch I" };
		im.setLore(Arrays.asList(witchbowLore));
		witchbow.setItemMeta(im);
		return witchbow;
	}

	public static ItemStack pigZombieBow() {
		ItemStack pigzombiebow = new ItemStack(Material.BOW, 1);
		ItemMeta im = pigzombiebow.getItemMeta();
		im.setDisplayName("Zombie Pigman Bow");
		String[] pigzombiebowLore = { ChatColor.GRAY + "Zombie Pigman I" };
		im.setLore(Arrays.asList(pigzombiebowLore));
		pigzombiebow.setItemMeta(im);
		return pigzombiebow;
	}

	public static ItemStack endermanBow() {
		ItemStack endermanbow = new ItemStack(Material.BOW, 1);
		ItemMeta im = endermanbow.getItemMeta();
		im.setDisplayName("Enderman Bow");
		String[] endermanbowLore = { ChatColor.GRAY + "Enderman I" };
		im.setLore(Arrays.asList(endermanbowLore));
		endermanbow.setItemMeta(im);
		return endermanbow;
	}

	public static ItemStack poweredCreeperBow() {
		ItemStack supercreeperbow = new ItemStack(Material.BOW, 1);
		ItemMeta im = supercreeperbow.getItemMeta();
		im.setDisplayName("SuperCharged Creeper Bow");
		String[] supercreeperbowLore = { ChatColor.GRAY + "Creeper II" };
		im.setLore(Arrays.asList(supercreeperbowLore));
		supercreeperbow.setItemMeta(im);
		return supercreeperbow;
	}

	public static ItemStack ocelotBow() {
		ItemStack bow = new ItemStack(Material.BOW, 1);
		ItemMeta im = bow.getItemMeta();
		im.setDisplayName("Ocelot Bow");
		String[] bowLore = { ChatColor.GRAY + "Ocelot I" };
		im.setLore(Arrays.asList(bowLore));
		bow.setItemMeta(im);
		return bow;
	}

	public static ItemStack wolfBow() {
		ItemStack bow = new ItemStack(Material.BOW, 1);
		ItemMeta im = bow.getItemMeta();
		im.setDisplayName("Wolf Bow");
		String[] bowLore = { ChatColor.GRAY + "Wolf I" };
		im.setLore(Arrays.asList(bowLore));
		bow.setItemMeta(im);
		return bow;
	}

	public static ItemStack horseBow() {
		ItemStack bow = new ItemStack(Material.BOW, 1);
		ItemMeta im = bow.getItemMeta();
		im.setDisplayName("Horse Bow");
		String[] bowLore = { ChatColor.GRAY + "Horse I" };
		im.setLore(Arrays.asList(bowLore));
		bow.setItemMeta(im);
		return bow;
	}

	public static ItemStack chickenBow() {
		ItemStack bow = new ItemStack(Material.BOW, 1);
		ItemMeta im = bow.getItemMeta();
		im.setDisplayName("Chicken Bow");
		String[] bowLore = { ChatColor.GRAY + "Chicken I" };
		im.setLore(Arrays.asList(bowLore));
		bow.setItemMeta(im);
		return bow;
	}

	public static ItemStack cowBow() {
		ItemStack bow = new ItemStack(Material.BOW, 1);
		ItemMeta im = bow.getItemMeta();
		im.setDisplayName("Cow Bow");
		String[] bowLore = { ChatColor.GRAY + "Cow I" };
		im.setLore(Arrays.asList(bowLore));
		bow.setItemMeta(im);
		return bow;
	}

	public static ItemStack pigBow() {
		ItemStack bow = new ItemStack(Material.BOW, 1);
		ItemMeta im = bow.getItemMeta();
		im.setDisplayName("Pig Bow");
		String[] bowLore = { ChatColor.GRAY + "Pig I" };
		im.setLore(Arrays.asList(bowLore));
		bow.setItemMeta(im);
		return bow;
	}

	public static ItemStack sheepBow() {
		ItemStack bow = new ItemStack(Material.BOW, 1);
		ItemMeta im = bow.getItemMeta();
		im.setDisplayName("Sheep Bow");
		String[] bowLore = { ChatColor.GRAY + "Sheep I" };
		im.setLore(Arrays.asList(bowLore));
		bow.setItemMeta(im);
		return bow;
	}

	public static ItemStack mooshroomBow() {
		ItemStack bow = new ItemStack(Material.BOW, 1);
		ItemMeta im = bow.getItemMeta();
		im.setDisplayName("Mooshroom Bow");
		String[] bowLore = { ChatColor.GRAY + "Mooshroom I" };
		im.setLore(Arrays.asList(bowLore));
		bow.setItemMeta(im);
		return bow;
	}

	public static ItemStack villagerBow() {
		ItemStack bow = new ItemStack(Material.BOW, 1);
		ItemMeta im = bow.getItemMeta();
		im.setDisplayName("Villager Bow");
		String[] bowLore = { ChatColor.GRAY + "Villager I" };
		im.setLore(Arrays.asList(bowLore));
		bow.setItemMeta(im);
		return bow;
	}

	public static ItemStack squidBow() {
		ItemStack bow = new ItemStack(Material.BOW, 1);
		ItemMeta im = bow.getItemMeta();
		im.setDisplayName("Squid Bow");
		String[] bowLore = { ChatColor.GRAY + "Squid I" };
		im.setLore(Arrays.asList(bowLore));
		bow.setItemMeta(im);
		return bow;
	}
}
