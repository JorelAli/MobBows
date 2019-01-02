package io.github.Skepter;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandExecutor;

public class MBCommandExecutor implements CommandExecutor {
	public MBCommandExecutor(final MobBows plugin) {
	}

	private void a(final Player p, final ItemStack i) {
		p.getInventory().addItem(new ItemStack[]{i});
	}

	public boolean onCommand(final CommandSender sender, final Command command, final String label,
			final String[] args) {
		if (sender instanceof Player) {
			final Player player = (Player) sender;
			final ChatColor gold = ChatColor.GOLD;
			final ChatColor green = ChatColor.GREEN;
			final ChatColor red = ChatColor.RED;
			final String wrongsyntax1 = gold + "[MobBows] " + green + "Use " + red + "/mb <Player> <Mob>";
			final String wrongsyntax2 = gold + "[MobBows] " + green + "Use " + red + "/mb list" + green
					+ " to see the list of items";
			final String noperms = gold + "[MobBows] " + green + "You do not have the '" + red + "MobBows.give'" + green
					+ " permission";
			final String itemNoExist = gold + "[MobBows] " + red + "That item does not exist";
			final String items = gold + "[MobBows] " + green + "Available items: " + red
					+ "zombie, creeper, spider, skeleton, blaze, ghast, slime, magmacube, witherskeleton, silverfish, witch, zombiepigman, enderman, poweredcreeper, ocelot, wolf, chicken, horse, cow, pig, mooshroom, villager, squid";
			if (!player.hasPermission("MobBows.give") && !player.isOp()) {
				player.sendMessage(noperms);
				return true;
			}
			if (command.getName().equalsIgnoreCase("mb")) {
				if (args.length > 2 || args.length == 0) {
					player.sendMessage(wrongsyntax1);
					player.sendMessage(wrongsyntax2);
					return true;
				}
				if (args[0].equalsIgnoreCase("list")) {
					player.sendMessage(items);
					return true;
				}
				if (args.length == 2) {
					final Player t = Bukkit.getPlayerExact(args[0]);
					final String gave = gold + "[MobBows] " + green + "You were given a " + args[1] + " bow";
					final String arg = args[1];
					final String s;
					switch (s = arg) {
						case "witherskeleton" : {
							this.a(t, MobBowsItems.witherSkeletonBow());
							t.sendMessage(gave);
							return false;
						}
						case "ocelot" : {
							this.a(t, MobBowsItems.ocelotBow());
							t.sendMessage(gave);
							return false;
						}
						case "spider" : {
							this.a(t, MobBowsItems.spiderBow());
							t.sendMessage(gave);
							return false;
						}
						case "zombie" : {
							this.a(t, MobBowsItems.zombieBow());
							t.sendMessage(gave);
							return false;
						}
						case "mooshroom" : {
							this.a(t, MobBowsItems.mooshroomBow());
							t.sendMessage(gave);
							return false;
						}
						case "pig" : {
							this.a(t, MobBowsItems.pigBow());
							t.sendMessage(gave);
							return false;
						}
						case "wolf" : {
							this.a(t, MobBowsItems.wolfBow());
							t.sendMessage(gave);
							return false;
						}
						case "blaze" : {
							this.a(t, MobBowsItems.blazeBow());
							t.sendMessage(gave);
							return false;
						}
						case "ghast" : {
							this.a(t, MobBowsItems.ghastBow());
							t.sendMessage(gave);
							return false;
						}
						case "horse" : {
							this.a(t, MobBowsItems.horseBow());
							t.sendMessage(gave);
							return false;
						}
						case "magma" : {
							this.a(t, MobBowsItems.magmaBow());
							t.sendMessage(gave);
							return false;
						}
						case "sheep" : {
							this.a(t, MobBowsItems.sheepBow());
							t.sendMessage(gave);
							return false;
						}
						case "slime" : {
							this.a(t, MobBowsItems.slimeBow());
							t.sendMessage(gave);
							return false;
						}
						case "squid" : {
							this.a(t, MobBowsItems.squidBow());
							t.sendMessage(gave);
							return false;
						}
						case "chicken" : {
							this.a(t, MobBowsItems.chickenBow());
							t.sendMessage(gave);
							return false;
						}
						case "creeper" : {
							this.a(t, MobBowsItems.creeperBow());
							t.sendMessage(gave);
							return false;
						}
						case "zombiepigman" : {
							this.a(t, MobBowsItems.pigZombieBow());
							t.sendMessage(gave);
							return false;
						}
						case "villager" : {
							this.a(t, MobBowsItems.villagerBow());
							t.sendMessage(gave);
							return false;
						}
						case "enderman" : {
							this.a(t, MobBowsItems.endermanBow());
							t.sendMessage(gave);
							return false;
						}
						case "silverfish" : {
							this.a(t, MobBowsItems.silverfishBow());
							t.sendMessage(gave);
							return false;
						}
						case "skeleton" : {
							this.a(t, MobBowsItems.skeletonBow());
							t.sendMessage(gave);
							return false;
						}
						default :
							break;
					}
					player.sendMessage(itemNoExist);
				}
			}
		}
		return false;
	}
}