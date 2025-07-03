package bluesteel42.maplewood;

import bluesteel42.maplewood.block.ModBlocks;
import bluesteel42.maplewood.entity.ModBoats;
import bluesteel42.maplewood.particle.ModParticles;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.particle.LeavesParticle;
import net.minecraft.world.biome.FoliageColors;


public class MapleWoodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Register Boat Models
        TerraformBoatClientHelper.registerModelLayers(ModBoats.MAPLE_BOATS_ID);
        // Register Leaf Particle Effect
        ParticleFactoryRegistry.getInstance().register(ModParticles.RED_MAPLE_LEAVES, LeavesParticle.CherryLeavesFactory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.YELLOW_MAPLE_LEAVES, LeavesParticle.CherryLeavesFactory::new);
        // Color Green Leaves
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> {
            if (view == null || pos == null) {
                return FoliageColors.DEFAULT;
            }
            return BiomeColors.getFoliageColor(view, pos);
        }, ModBlocks.GREEN_MAPLE_LEAVES);
    }
}
