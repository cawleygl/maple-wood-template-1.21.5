package bluesteel42.maplewood.world.tree;

import bluesteel42.maplewood.MapleWood;
import bluesteel42.maplewood.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator GREEN_MAPLE = new SaplingGenerator(
            MapleWood.MOD_ID + ":green_maple",
            0.25F,
            Optional.empty(),
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.POINTED_GREEN_MAPLE_KEY),
            Optional.of(ModConfiguredFeatures.ROUND_GREEN_MAPLE_KEY),
            Optional.of(ModConfiguredFeatures.POINTED_GREEN_MAPLE_BEES_005_KEY),
            Optional.of(ModConfiguredFeatures.ROUND_GREEN_MAPLE_BEES_005_KEY)
    );
    public static final SaplingGenerator RED_MAPLE = new SaplingGenerator(
            MapleWood.MOD_ID + ":red_maple",
            0.25F,
            Optional.empty(),
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.POINTED_RED_MAPLE_KEY),
            Optional.of(ModConfiguredFeatures.ROUND_RED_MAPLE_KEY),
            Optional.of(ModConfiguredFeatures.POINTED_RED_MAPLE_BEES_005_KEY),
            Optional.of(ModConfiguredFeatures.ROUND_RED_MAPLE_BEES_005_KEY)
    );
    public static final SaplingGenerator YELLOW_MAPLE = new SaplingGenerator(
            MapleWood.MOD_ID + ":yellow_maple",
            0.25F,
            Optional.empty(),
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.POINTED_YELLOW_MAPLE_KEY),
            Optional.of(ModConfiguredFeatures.ROUND_YELLOW_MAPLE_KEY),
            Optional.of(ModConfiguredFeatures.POINTED_YELLOW_MAPLE_BEES_005_KEY),
            Optional.of(ModConfiguredFeatures.ROUND_YELLOW_MAPLE_BEES_005_KEY)
    );
}
