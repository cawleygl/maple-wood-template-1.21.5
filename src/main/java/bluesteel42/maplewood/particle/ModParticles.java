package bluesteel42.maplewood.particle;

import bluesteel42.maplewood.MapleWood;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {

    // This DefaultParticleType gets called when you want to use your particle in code.
    public static final SimpleParticleType RED_MAPLE_LEAVES = FabricParticleTypes.simple();
    public static final SimpleParticleType YELLOW_MAPLE_LEAVES = FabricParticleTypes.simple();


    public static void initialize() {
        // Register our custom particle type in the mod initializer.
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MapleWood.MOD_ID, "red_maple_leaves"), RED_MAPLE_LEAVES);
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MapleWood.MOD_ID, "yellow_maple_leaves"), YELLOW_MAPLE_LEAVES);
    }
}
