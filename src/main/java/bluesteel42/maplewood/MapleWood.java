package bluesteel42.maplewood;

import bluesteel42.maplewood.block.ModBlocks;
import bluesteel42.maplewood.entity.ModBoats;
import bluesteel42.maplewood.item.ModItems;
import bluesteel42.maplewood.particle.ModParticles;
import bluesteel42.maplewood.registries.ModRegistries;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MapleWood implements ModInitializer {
	public static final String MOD_ID = "maple-wood";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModBlocks.initialize();
		ModItems.initialize();
		ModBoats.initialize();
		ModParticles.initialize();
		ModRegistries.registerStrippables();
		ModRegistries.registerCompostables();
		ModRegistries.registerFlammables();
		ModRegistries.registerTrades();
		LOGGER.info("Hello Fabric world!");
	}
}