package bluesteel42.maplewood;

import bluesteel42.maplewood.block.ModBlocks;
import bluesteel42.maplewood.particle.ModParticles;
import bluesteel42.standard_wood_initializer.StandardWoodInitializer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.particle.LeavesParticle;
import net.minecraft.world.biome.FoliageColors;

public class MapleWoodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        StandardWoodInitializer.initializeWoodTypeClient();
        // Color Leaves
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> {
            if (view == null || pos == null) {
                return FoliageColors.getColor(0.5, 1.0);
            }
            return BiomeColors.getFoliageColor(view, pos);
        }, ModBlocks.GREEN_MAPLE_LEAVES);
        // Register Leaf Particle Effect
        ParticleFactoryRegistry.getInstance().register(ModParticles.GREEN_MAPLE_LEAVES, LeavesParticle.TintedLeavesFactory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.RED_MAPLE_LEAVES, LeavesParticle.CherryLeavesFactory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.YELLOW_MAPLE_LEAVES, LeavesParticle.CherryLeavesFactory::new);
    }
}
