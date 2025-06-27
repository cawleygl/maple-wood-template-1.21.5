package bluesteel42.maplewood.world.tree;

import bluesteel42.maplewood.MapleWood;
import bluesteel42.maplewood.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator PINE = new SaplingGenerator(
            MapleWood.MOD_ID + ":pine",
            0.5F,
            Optional.of(ModConfiguredFeatures.MAPLE_KEY),
            Optional.empty(),
            Optional.empty(),
            Optional.empty(),
            Optional.empty(),
            Optional.empty()
    );
}
