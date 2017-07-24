package io.github.skepter.mobbows;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class MBCommandExecutor implements CommandExecutor {
	
	public MBCommandExecutor(MobBows plugin) {
	}

	private void a(Player p, ItemStack i) {
		p.getInventory().addItem(new ItemStack[] { i });
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if ((sender instanceof Player)) {
			Player player = (Player) sender;
			ChatColor gold = ChatColor.GOLD;
			ChatColor green = ChatColor.GREEN;
			ChatColor red = ChatColor.RED;
			String wrongsyntax1 = gold + "[MobBows] " + green + "Use " + red + "/mb <Player> <Mob>";
			String wrongsyntax2 = gold + "[MobBows] " + green + "Use " + red + "/mb list" + green
					+ " to see the list of items";
			String noperms = gold + "[MobBows] " + green + "You do not have the '" + red + "MobBows.give'" + green
					+ " permission";
			String itemNoExist = gold + "[MobBows] " + red + "That item does not exist";
			String items = gold + "[MobBows] " + green + "Available items: " + red
					+ "zombie, creeper, spider, skeleton, blaze, ghast, slime, magmacube, witherskeleton, silverfish, witch, zombiepigman, enderman, poweredcreeper, ocelot, wolf, chicken, horse, cow, pig, mooshroom, villager, squid";
			if ((player.hasPermission("MobBows.give")) || (player.isOp())) {
				if (command.getName().equalsIgnoreCase("mb")) {
					if ((args.length > 2) || (args.length == 0)) {
						player.sendMessage(wrongsyntax1);
						player.sendMessage(wrongsyntax2);
						return true;
					}
					if (args[0].equalsIgnoreCase("list")) {
						player.sendMessage(items);
						return true;
					}
					if (args.length == 2) {
						Player t = Bukkit.getPlayerExact(args[0]);
						String gave = gold + "[MobBows] " + green + "You were given a " + args[1] + " bow";
						String arg = args[1];
						String str1;
						switch ((str1 = arg).hashCode()) {
							case -1416758976:
								if (str1.equals("witherskeleton")) {
								}
								break;
							case -1022586720:
								if (str1.equals("ocelot")) {
								}
								break;
							case -895953179:
								if (str1.equals("spider")) {
								}
								break;
							case -696355290:
								if (str1.equals("zombie")) {
									break;
								}
								break;
							case -440023555:
								if (str1.equals("mooshroom")) {
								}
								break;
							case 110990:
								if (str1.equals("pig")) {
								}
								break;
							case 3655250:
								if (str1.equals("wolf")) {
								}
								break;
							case 93819586:
								if (str1.equals("blaze")) {
								}
								break;
							case 98317825:
								if (str1.equals("ghast")) {
								}
								break;
							case 99466205:
								if (str1.equals("horse")) {
								}
								break;
							case 103655975:
								if (str1.equals("magma")) {
								}
								break;
							case 109403483:
								if (str1.equals("sheep")) {
								}
								break;
							case 109526728:
								if (str1.equals("slime")) {
								}
								break;
							case 109687090:
								if (str1.equals("squid")) {
								}
								break;
							case 746007989:
								if (str1.equals("chicken")) {
								}
								break;
							case 1028669806:
								if (str1.equals("creeper")) {
								}
								break;
							case 1049731762:
								if (str1.equals("zombiepigman")) {
								}
								break;
							case 1386475846:
								if (str1.equals("villager")) {
								}
								break;
							case 1731036562:
								if (str1.equals("enderman")) {
								}
								break;
							case 1962769125:
								if (str1.equals("silverfish")) {
								}
								break;
							case 2027747405:
								if (!str1.equals("skeleton")) {
									break label1306;
									a(t, MobBowsItems.zombieBow());
									t.sendMessage(gave);
									break label1329;
									a(t, MobBowsItems.creeperBow());
									t.sendMessage(gave);
									break label1329;
									a(t, MobBowsItems.spiderBow());
									t.sendMessage(gave);
									break label1329;
								} else {
									a(t, MobBowsItems.skeletonBow());
									t.sendMessage(gave);
									break label1329;
									a(t, MobBowsItems.blazeBow());
									t.sendMessage(gave);
									break label1329;
									a(t, MobBowsItems.ghastBow());
									t.sendMessage(gave);
									break label1329;
									a(t, MobBowsItems.slimeBow());
									t.sendMessage(gave);
									break label1329;
									a(t, MobBowsItems.magmaBow());
									t.sendMessage(gave);
									break label1329;
									a(t, MobBowsItems.witherSkeletonBow());
									t.sendMessage(gave);
									break label1329;
									a(t, MobBowsItems.silverfishBow());
									t.sendMessage(gave);
									break label1329;
									a(t, MobBowsItems.pigZombieBow());
									t.sendMessage(gave);
									break label1329;
									a(t, MobBowsItems.endermanBow());
									t.sendMessage(gave);
									break label1329;
									a(t, MobBowsItems.ocelotBow());
									t.sendMessage(gave);
									break label1329;
									a(t, MobBowsItems.wolfBow());
									t.sendMessage(gave);
									break label1329;
									a(t, MobBowsItems.pigBow());
									t.sendMessage(gave);
									break label1329;
									a(t, MobBowsItems.chickenBow());
									t.sendMessage(gave);
									break label1329;
									a(t, MobBowsItems.horseBow());
									t.sendMessage(gave);
									break label1329;
									a(t, MobBowsItems.sheepBow());
									t.sendMessage(gave);
									break label1329;
									a(t, MobBowsItems.mooshroomBow());
									t.sendMessage(gave);
									break label1329;
									a(t, MobBowsItems.villagerBow());
									t.sendMessage(gave);
									break label1329;
									a(t, MobBowsItems.squidBow());
									t.sendMessage(gave);
								}
								break;
						}
						label1306: player.sendMessage(itemNoExist);
					}
				}
			} else {
				player.sendMessage(noperms);
				return true;
			}
		}
		label1329: return false;
	}
}
