package io.github.skepter.mobbows;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class MobBowsRecipes {
	
	public static void registerRecipes() {
		ShapedRecipe recipezombie = new ShapedRecipe(MobBowsItems.zombieBow());
		recipezombie.shape(new String[] { " ST", "SZT", " ST" });
		recipezombie.setIngredient('S', Material.STICK);
		recipezombie.setIngredient('T', Material.STRING);
		recipezombie.setIngredient('Z', Material.ROTTEN_FLESH);
		Bukkit.getServer().addRecipe(recipezombie);

		ShapedRecipe recipecreeper = new ShapedRecipe(MobBowsItems.creeperBow());
		recipecreeper.shape(new String[] { " ST", "SZT", " ST" });
		recipecreeper.setIngredient('S', Material.STICK);
		recipecreeper.setIngredient('T', Material.STRING);
		recipecreeper.setIngredient('Z', Material.SULPHUR);
		Bukkit.getServer().addRecipe(recipecreeper);

		ShapedRecipe recipespider = new ShapedRecipe(MobBowsItems.spiderBow());
		recipespider.shape(new String[] { " ST", "SZT", " ST" });
		recipespider.setIngredient('S', Material.STICK);
		recipespider.setIngredient('T', Material.STRING);
		recipespider.setIngredient('Z', Material.SPIDER_EYE);
		Bukkit.getServer().addRecipe(recipespider);

		ShapedRecipe recipeskeleton = new ShapedRecipe(MobBowsItems.skeletonBow());
		recipeskeleton.shape(new String[] { " ST", "SZT", " ST" });
		recipeskeleton.setIngredient('S', Material.STICK);
		recipeskeleton.setIngredient('T', Material.STRING);
		recipeskeleton.setIngredient('Z', Material.ARROW);

		Bukkit.getServer().addRecipe(recipeskeleton);

		ShapedRecipe recipeblaze = new ShapedRecipe(MobBowsItems.blazeBow());
		recipeblaze.shape(new String[] { " ST", "SZT", " ST" });
		recipeblaze.setIngredient('S', Material.STICK);
		recipeblaze.setIngredient('T', Material.STRING);
		recipeblaze.setIngredient('Z', Material.BLAZE_ROD);
		Bukkit.getServer().addRecipe(recipeblaze);

		ShapedRecipe recipeghast = new ShapedRecipe(MobBowsItems.ghastBow());
		recipeghast.shape(new String[] { " ST", "SZT", " ST" });
		recipeghast.setIngredient('S', Material.STICK);
		recipeghast.setIngredient('T', Material.STRING);
		recipeghast.setIngredient('Z', Material.GHAST_TEAR);
		Bukkit.getServer().addRecipe(recipeghast);

		ShapedRecipe recipeslime = new ShapedRecipe(MobBowsItems.slimeBow());
		recipeslime.shape(new String[] { " ST", "SZT", " ST" });
		recipeslime.setIngredient('S', Material.STICK);
		recipeslime.setIngredient('T', Material.STRING);
		recipeslime.setIngredient('Z', Material.SLIME_BALL);
		Bukkit.getServer().addRecipe(recipeslime);

		ShapedRecipe recipemagma = new ShapedRecipe(MobBowsItems.magmaBow());
		recipemagma.shape(new String[] { " ST", "SZT", " ST" });
		recipemagma.setIngredient('S', Material.STICK);
		recipemagma.setIngredient('T', Material.STRING);
		recipemagma.setIngredient('Z', Material.MAGMA_CREAM);
		Bukkit.getServer().addRecipe(recipemagma);

		ShapedRecipe recipeWitherskeleton = new ShapedRecipe(MobBowsItems.witherSkeletonBow());
		recipeWitherskeleton.shape(new String[] { " ST", "SZT", " ST" });
		recipeWitherskeleton.setIngredient('S', Material.STICK);
		recipeWitherskeleton.setIngredient('T', Material.STRING);
		ItemStack is = new ItemStack(Material.SKULL_ITEM);
		is.setDurability((short) 1);
		recipeWitherskeleton.setIngredient('Z', is.getData());
		Bukkit.getServer().addRecipe(recipeWitherskeleton);

		ShapedRecipe recipesilverfish = new ShapedRecipe(MobBowsItems.silverfishBow());
		recipesilverfish.shape(new String[] { " ST", "SZT", " ST" });
		recipesilverfish.setIngredient('S', Material.STICK);
		recipesilverfish.setIngredient('T', Material.STRING);
		recipesilverfish.setIngredient('Z', Material.SMOOTH_BRICK);
		Bukkit.getServer().addRecipe(recipesilverfish);

		ShapedRecipe recipewitch = new ShapedRecipe(MobBowsItems.witchBow());
		recipewitch.shape(new String[] { " ST", "SZT", " ST" });
		recipewitch.setIngredient('S', Material.STICK);
		recipewitch.setIngredient('T', Material.STRING);
		recipewitch.setIngredient('Z', Material.POTION);
		Bukkit.getServer().addRecipe(recipewitch);

		ShapedRecipe recipepigzombie = new ShapedRecipe(MobBowsItems.pigZombieBow());
		recipepigzombie.shape(new String[] { " ST", "SZT", " ST" });
		recipepigzombie.setIngredient('S', Material.STICK);
		recipepigzombie.setIngredient('T', Material.STRING);
		recipepigzombie.setIngredient('Z', Material.GOLD_NUGGET);
		Bukkit.getServer().addRecipe(recipepigzombie);

		ShapedRecipe recipeenderman = new ShapedRecipe(MobBowsItems.endermanBow());
		recipeenderman.shape(new String[] { " ST", "SZT", " ST" });
		recipeenderman.setIngredient('S', Material.STICK);
		recipeenderman.setIngredient('T', Material.STRING);
		recipeenderman.setIngredient('Z', Material.ENDER_PEARL);
		Bukkit.getServer().addRecipe(recipeenderman);

		ShapedRecipe recipesupercreeper = new ShapedRecipe(MobBowsItems.poweredCreeperBow());
		recipesupercreeper.shape(new String[] { "ZST", "SZT", "ZST" });
		recipesupercreeper.setIngredient('S', Material.STICK);
		recipesupercreeper.setIngredient('T', Material.STRING);
		recipesupercreeper.setIngredient('Z', Material.TNT);
		Bukkit.getServer().addRecipe(recipesupercreeper);

		ShapedRecipe recipeocelot = new ShapedRecipe(MobBowsItems.ocelotBow());
		recipeocelot.shape(new String[] { " ST", "SZT", " ST" });
		recipeocelot.setIngredient('S', Material.STICK);
		recipeocelot.setIngredient('T', Material.STRING);
		recipeocelot.setIngredient('Z', Material.RAW_FISH);
		Bukkit.getServer().addRecipe(recipeocelot);

		ShapedRecipe recipewolf = new ShapedRecipe(MobBowsItems.wolfBow());
		recipewolf.shape(new String[] { " ST", "SZT", " ST" });
		recipewolf.setIngredient('S', Material.STICK);
		recipewolf.setIngredient('T', Material.STRING);
		recipewolf.setIngredient('Z', Material.BONE);
		Bukkit.getServer().addRecipe(recipewolf);

		ShapedRecipe recipehorse = new ShapedRecipe(MobBowsItems.horseBow());
		recipehorse.shape(new String[] { " ST", "SZT", " ST" });
		recipehorse.setIngredient('S', Material.STICK);
		recipehorse.setIngredient('T', Material.STRING);
		recipehorse.setIngredient('Z', Material.HAY_BLOCK);
		Bukkit.getServer().addRecipe(recipehorse);

		ShapedRecipe recipechicken = new ShapedRecipe(MobBowsItems.chickenBow());
		recipechicken.shape(new String[] { " ST", "SZT", " ST" });
		recipechicken.setIngredient('S', Material.STICK);
		recipechicken.setIngredient('T', Material.STRING);
		recipechicken.setIngredient('Z', Material.FEATHER);
		Bukkit.getServer().addRecipe(recipechicken);

		ShapedRecipe recipeCow = new ShapedRecipe(MobBowsItems.cowBow());
		recipeCow.shape(new String[] { " ST", "SZT", " ST" });
		recipeCow.setIngredient('S', Material.STICK);
		recipeCow.setIngredient('T', Material.STRING);
		recipeCow.setIngredient('Z', Material.RAW_BEEF);
		Bukkit.getServer().addRecipe(recipeCow);

		ShapedRecipe recipepig = new ShapedRecipe(MobBowsItems.pigBow());
		recipepig.shape(new String[] { " ST", "SZT", " ST" });
		recipepig.setIngredient('S', Material.STICK);
		recipepig.setIngredient('T', Material.STRING);
		recipepig.setIngredient('Z', Material.PORK);
		Bukkit.getServer().addRecipe(recipepig);

		ShapedRecipe recipesheep = new ShapedRecipe(MobBowsItems.sheepBow());
		recipesheep.shape(new String[] { " ST", "SZT", " ST" });
		recipesheep.setIngredient('S', Material.STICK);
		recipesheep.setIngredient('T', Material.STRING);
		recipesheep.setIngredient('Z', Material.WOOL);
		Bukkit.getServer().addRecipe(recipesheep);

		ShapedRecipe recipemooshroom = new ShapedRecipe(MobBowsItems.mooshroomBow());
		recipemooshroom.shape(new String[] { " ST", "SZT", " ST" });
		recipemooshroom.setIngredient('S', Material.STICK);
		recipemooshroom.setIngredient('T', Material.STRING);
		recipemooshroom.setIngredient('Z', Material.RED_MUSHROOM);
		Bukkit.getServer().addRecipe(recipemooshroom);
		recipemooshroom.setIngredient('S', Material.STICK);
		recipemooshroom.setIngredient('T', Material.STRING);
		recipemooshroom.setIngredient('Z', Material.BROWN_MUSHROOM);
		Bukkit.getServer().addRecipe(recipemooshroom);

		ShapedRecipe recipevillager = new ShapedRecipe(MobBowsItems.villagerBow());
		recipevillager.shape(new String[] { " ST", "SZT", " ST" });
		recipevillager.setIngredient('S', Material.STICK);
		recipevillager.setIngredient('T', Material.STRING);
		recipevillager.setIngredient('Z', Material.EMERALD);
		Bukkit.getServer().addRecipe(recipevillager);

		ShapedRecipe recipesquid = new ShapedRecipe(MobBowsItems.squidBow());
		recipesquid.shape(new String[] { "ZST", "SZT", "ZST" });
		recipesquid.setIngredient('S', Material.STICK);
		recipesquid.setIngredient('T', Material.STRING);
		recipesquid.setIngredient('Z', Material.INK_SACK);
		Bukkit.getServer().addRecipe(recipesquid);
	}
}
