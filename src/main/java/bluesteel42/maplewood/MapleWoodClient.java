package bluesteel42.maplewood;

import bluesteel42.maplewood.entity.ModBoats;
import bluesteel42.maplewood.particle.ModParticles;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.LeavesParticle;


public class MapleWoodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Register Boat Models
        TerraformBoatClientHelper.registerModelLayers(ModBoats.MAPLE_BOATS_ID);
        // Register Leaf Particle Effect
        ParticleFactoryRegistry.getInstance().register(ModParticles.MAPLE_LEAVES, LeavesParticle.CherryLeavesFactory::new);
    }
}
