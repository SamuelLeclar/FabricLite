package net.minecraftearthmod.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraftearthmod.MinecraftEarthModModElements;

import net.minecraft.world.GameRules;

import java.lang.reflect.Method;

@MinecraftEarthModModElements.ModElement.Tag
public class DoEarthDimensionGameRule extends MinecraftEarthModModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.BooleanValue> gamerule = GameRules.register("doEarthDimension", GameRules.Category.MISC,
			create(true));
	public DoEarthDimensionGameRule(MinecraftEarthModModElements instance) {
		super(instance, 205);
	}

	public static GameRules.RuleType<GameRules.BooleanValue> create(boolean defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.BooleanValue.class, "func_223568_b", boolean.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.BooleanValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
