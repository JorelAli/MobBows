package io.github.skepter.mobbows;

import java.util.Random;

import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class MobBowsListener implements Listener {
	
	//HasPermission
	private boolean hp(Player p, String pm) {
		String perm = "MobBows." + pm;
		if ((p.hasPermission(perm)) || (p.isOp())) {
			return true;
		}
		return false;
	}

	//Check
	private boolean c(Player p, String s) {
		ItemStack is = p.getItemInHand();
		if ((is.hasItemMeta()) && (is.getItemMeta().hasLore()) && (is.getItemMeta().getLore().contains(s))) {
			return true;
		}
		return false;
	}

	@EventHandler
	public void onShoot(EntityShootBowEvent event) {
		if ((event.getEntity() instanceof Player)) {
			Player player = (Player) event.getEntity();
			World world = player.getWorld();
			Location loc = player.getLocation();
			Vector locvel = player.getEyeLocation().getDirection().multiply(2);
			if (player.getItemInHand().getType() == Material.BOW) {
				for (String s : MobBowsItems.bowLores()) {
					if (c(player, s)) {
						event.setCancelled(true);
						if ((c(player, "Zombie I")) && (hp(player, "zombie"))) {
							Entity entity = world.spawnEntity(loc, EntityType.ZOMBIE);
							entity.setVelocity(locvel);
							return;
						}
						if ((c(player, "Creeper I")) && (hp(player, "creeper"))) {
							Entity entity = world.spawnEntity(loc, EntityType.CREEPER);
							entity.setVelocity(locvel);
							return;
						}
						if ((c(player, "Creeper II")) && (hp(player, "poweredcreeper"))) {
							Creeper entity = (Creeper) world.spawnEntity(loc, EntityType.CREEPER);
							entity.setPowered(true);
							entity.setVelocity(locvel);
							return;
						}
						if ((c(player, "Spider I")) && (hp(player, "spider"))) {
							Entity entity = world.spawnEntity(loc, EntityType.SPIDER);
							entity.setVelocity(locvel);
							return;
						}
						if ((c(player, "Skeleton I")) && (hp(player, "skeleton"))) {
							Skeleton skeleton = (Skeleton) world.spawnEntity(loc, EntityType.SKELETON);
							EntityEquipment skeletonInventory = skeleton.getEquipment();
							ItemStack bow = new ItemStack(Material.BOW);
							skeletonInventory.setItemInHand(bow);
							skeleton.setVelocity(locvel);
							return;
						}
						if ((c(player, "Blaze I")) && (hp(player, "blaze"))) {
							Entity entity = world.spawnEntity(loc, EntityType.BLAZE);
							entity.setFireTicks(100000);
							entity.setVelocity(locvel);
							return;
						}
						if ((c(player, "Ghast I")) && (hp(player, "ghast"))) {
							Entity entity = world.spawnEntity(loc, EntityType.GHAST);
							entity.setVelocity(locvel);
							return;
						}
						if ((c(player, "Slime I")) && (hp(player, "slime"))) {
							Entity entity = world.spawnEntity(loc, EntityType.SLIME);
							entity.setVelocity(locvel);
							return;
						}
						if ((c(player, "Magma I")) && (hp(player, "magma"))) {
							Entity entity = world.spawnEntity(loc, EntityType.MAGMA_CUBE);
							entity.setVelocity(locvel);
							return;
						}
						if ((c(player, "Wither Skeleton I")) && (hp(player, "witherskeleton"))) {
							Skeleton skeleton = (Skeleton) world.spawnEntity(loc, EntityType.SKELETON);
							skeleton.setSkeletonType(Skeleton.SkeletonType.WITHER);
							EntityEquipment skeletonInventory = skeleton.getEquipment();
							ItemStack sword = new ItemStack(Material.STONE_SWORD);
							skeletonInventory.setItemInHand(sword);
							skeleton.setVelocity(locvel);
							return;
						}
						if ((c(player, "Silverfish I")) && (hp(player, "silverfish"))) {
							Entity entity = world.spawnEntity(loc, EntityType.SILVERFISH);
							entity.setVelocity(locvel);
							return;
						}
						if ((c(player, "Zombie Pigman I")) && (hp(player, "zombiepigman"))) {
							PigZombie entity = (PigZombie) world.spawnEntity(loc, EntityType.PIG_ZOMBIE);
							EntityEquipment pigzombie = entity.getEquipment();
							ItemStack sword = new ItemStack(Material.GOLD_SWORD);
							pigzombie.setItemInHand(sword);
							entity.setVelocity(locvel);
							return;
						}
						if ((c(player, "Enderman I")) && (hp(player, "enderman"))) {
							Entity entity = world.spawnEntity(loc, EntityType.ENDERMAN);
							entity.setVelocity(locvel);
							return;
						}
						if ((c(player, "Ocelot I")) && (hp(player, "ocelot"))) {
							Entity entity = world.spawnEntity(loc, EntityType.OCELOT);
							entity.setVelocity(locvel);
							return;
						}
						if ((c(player, "Wolf I")) && (hp(player, "wolf"))) {
							Entity entity = world.spawnEntity(loc, EntityType.WOLF);
							entity.setVelocity(locvel);
							return;
						}
						if ((c(player, "Pig I")) && (hp(player, "pig"))) {
							Entity entity = world.spawnEntity(loc, EntityType.PIG);
							entity.setVelocity(locvel);
							return;
						}
						if ((c(player, "Cow I")) && (hp(player, "cow"))) {
							Entity entity = world.spawnEntity(loc, EntityType.COW);
							entity.setVelocity(locvel);
							return;
						}
						if ((c(player, "Chicken I")) && (hp(player, "chicken"))) {
							Entity entity = world.spawnEntity(loc, EntityType.CHICKEN);
							entity.setVelocity(locvel);
							return;
						}
						if ((c(player, "Horse I")) && (hp(player, "horse"))) {
							Entity entity = world.spawnEntity(loc, EntityType.HORSE);
							entity.setVelocity(locvel);
							return;
						}
						if ((c(player, "Mooshroom I")) && (hp(player, "mooshroom"))) {
							Entity entity = world.spawnEntity(loc, EntityType.MUSHROOM_COW);
							entity.setVelocity(locvel);
							return;
						}
						if ((c(player, "Sheep I")) && (hp(player, "sheep"))) {
							Sheep entity = (Sheep) world.spawnEntity(loc, EntityType.SHEEP);
							Random random = new Random();
							entity.setColor(DyeColor.getByData((byte) random.nextInt(15)));
							entity.setVelocity(locvel);
							return;
						}
						if ((c(player, "Villager I")) && (hp(player, "villager"))) {
							Entity entity = world.spawnEntity(loc, EntityType.VILLAGER);
							Random random = new Random();
							((Villager) entity).setProfession(Villager.Profession.getProfession(random.nextInt(4)));
							entity.setVelocity(locvel);
							return;
						}
						if ((c(player, "Squid I")) && (hp(player, "squid"))) {
							Entity entity = world.spawnEntity(loc, EntityType.SQUID);
							entity.setVelocity(locvel);
							return;
						}
					}
				}
			}
		}
	}
}
