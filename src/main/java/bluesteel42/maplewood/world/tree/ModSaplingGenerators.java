package bluesteel42.maplewood.world.tree;

import bluesteel42.maplewood.MapleWood;
import bluesteel42.maplewood.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator MAPLE = new SaplingGenerator(
            MapleWood.MOD_ID + ":maple",
            0.1F,
            Optional.empty(),
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.MAPLE_KEY),
            Optional.of(ModConfiguredFeatures.FANCY_MAPLE_KEY),
            Optional.of(ModConfiguredFeatures.MAPLE_BEES_005_KEY),
            Optional.of(ModConfiguredFeatures.FANCY_MAPLE_BEES_005_KEY)
    );
}
