package bluesteel42.maplewood.world;

import bluesteel42.maplewood.MapleWood;
import bluesteel42.maplewood.block.ModBlocks;
import bluesteel42.maplewood.standard_wood_initializer.block.StandardWoodModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BlockFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.EnvironmentScanPlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    /* OTHER */
//    public static final RegistryKey<PlacedFeature> ROUND_RED_MAPLE_BEES_0002_LEAF_LITTER_PLACED_KEY = registerKey("round_red_maple_bees_0002_leaf_litter");
//    public static final RegistryKey<PlacedFeature> POINTED_RED_MAPLE_BEES_0002_LEAF_LITTER_PLACED_KEY = registerKey("pointed_red_maple_bees_0002_leaf_litter");
//    public static final RegistryKey<PlacedFeature> ROUND_YELLOW_MAPLE_BEES_0002_LEAF_LITTER_PLACED_KEY = registerKey("round_yellow_maple_bees_0002_leaf_litter");
//    public static final RegistryKey<PlacedFeature> POINTED_YELLOW_MAPLE_BEES_0002_LEAF_LITTER_PLACED_KEY = registerKey("pointed_yellow_maple_bees_0002_leaf_litter");

    /* SAPLING-GENERATED */
//    public static final RegistryKey<PlacedFeature> ROUND_GREEN_MAPLE_PLACED_KEY = registerKey("round_green_maple");
//    public static final RegistryKey<PlacedFeature> POINTED_GREEN_MAPLE_PLACED_KEY = registerKey("pointed_green_maple");
//    public static final RegistryKey<PlacedFeature> ROUND_GREEN_MAPLE_PLACED_BEES_005_KEY = registerKey("round_green_maple_bees_005");
//    public static final RegistryKey<PlacedFeature> POINTED_GREEN_MAPLE_PLACED_BEES_005_KEY = registerKey("pointed_green_maple_bees_005");
//    public static final RegistryKey<PlacedFeature> ROUND_RED_MAPLE_PLACED_BEES_005_KEY = registerKey("round_red_maple_bees_005");
//    public static final RegistryKey<PlacedFeature> POINTED_RED_MAPLE_PLACED_BEES_005_KEY = registerKey("pointed_red_maple_bees_005");
//    public static final RegistryKey<PlacedFeature> ROUND_YELLOW_MAPLE_PLACED_BEES_005_KEY = registerKey("round_yellow_maple_bees_005");
//    public static final RegistryKey<PlacedFeature> POINTED_YELLOW_MAPLE_PLACED_BEES_005_KEY = registerKey("pointed_yellow_maple_bees_005");

    /* FOREST */
    public static final RegistryKey<PlacedFeature> ROUND_GREEN_MAPLE_BEES_0002_LEAF_LITTER_PLACED_KEY = registerKey("round_green_maple_bees_0002_leaf_litter");
    public static final RegistryKey<PlacedFeature> POINTED_GREEN_MAPLE_BEES_0002_LEAF_LITTER_PLACED_KEY = registerKey("pointed_green_maple_bees_0002_leaf_litter");

    /* FLOWER FOREST */
    public static final RegistryKey<PlacedFeature> ROUND_GREEN_MAPLE_BEES_002_PLACED_KEY = registerKey("round_green_maple_bees_002");
    public static final RegistryKey<PlacedFeature> POINTED_GREEN_MAPLE_BEES_002_PLACED_KEY = registerKey("pointed_green_maple_bees_002");
    public static final RegistryKey<PlacedFeature> ROUND_YELLOW_MAPLE_BEES_002_PLACED_KEY = registerKey("round_yellow_maple_bees_002");
    public static final RegistryKey<PlacedFeature> POINTED_YELLOW_MAPLE_BEES_002_PLACED_KEY = registerKey("pointed_yellow_maple_bees_002");

    /* SNOWY TAIGA  */
    public static final RegistryKey<PlacedFeature> ROUND_RED_MAPLE_PLACED_KEY = registerKey("round_red_maple");
    public static final RegistryKey<PlacedFeature> POINTED_RED_MAPLE_PLACED_KEY = registerKey("pointed_red_maple");
    public static final RegistryKey<PlacedFeature> ROUND_YELLOW_MAPLE_PLACED_KEY = registerKey("round_yellow_maple");
    public static final RegistryKey<PlacedFeature> POINTED_YELLOW_MAPLE_PLACED_KEY = registerKey("pointed_yellow_maple");

    /* GROVE */
    public static final RegistryKey<PlacedFeature> ROUND_RED_MAPLE_ON_SNOW_PLACED_KEY = registerKey("round_red_maple_on_snow");
    public static final RegistryKey<PlacedFeature> POINTED_RED_MAPLE_ON_SNOW_PLACED_KEY = registerKey("pointed_red_maple_on_snow");
    public static final RegistryKey<PlacedFeature> ROUND_YELLOW_MAPLE_ON_SNOW_PLACED_KEY = registerKey("round_yellow_maple_on_snow");
    public static final RegistryKey<PlacedFeature> POINTED_YELLOW_MAPLE_ON_SNOW_PLACED_KEY = registerKey("pointed_yellow_maple_on_snow");

    /* FALLEN MAPLE TREE */
    public static final RegistryKey<PlacedFeature> FALLEN_MAPLE_PLACED_KEY = registerKey("fallen_maple_tree");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        /* OTHER */
//        register(context, ROUND_RED_MAPLE_BEES_0002_LEAF_LITTER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ROUND_RED_MAPLE_BEES_0002_LEAF_LITTER_KEY), PlacedFeatures.wouldSurvive(ModBlocks.RED_MAPLE_SAPLING));
//        register(context, POINTED_RED_MAPLE_BEES_0002_LEAF_LITTER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POINTED_RED_MAPLE_BEES_0002_LEAF_LITTER_KEY), PlacedFeatures.wouldSurvive(ModBlocks.RED_MAPLE_SAPLING));
//        register(context, ROUND_YELLOW_MAPLE_BEES_0002_LEAF_LITTER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ROUND_YELLOW_MAPLE_BEES_0002_LEAF_LITTER_KEY), PlacedFeatures.wouldSurvive(ModBlocks.YELLOW_MAPLE_SAPLING));
//        register(context, POINTED_YELLOW_MAPLE_BEES_0002_LEAF_LITTER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POINTED_YELLOW_MAPLE_BEES_0002_LEAF_LITTER_KEY), PlacedFeatures.wouldSurvive(ModBlocks.YELLOW_MAPLE_SAPLING));

        /* SAPLING-GENERATED */
//        register(context, ROUND_GREEN_MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ROUND_GREEN_MAPLE_KEY), PlacedFeatures.wouldSurvive(StandardWoodModBlocks.MOD_SAPLING));
//        register(context, POINTED_GREEN_MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POINTED_GREEN_MAPLE_KEY), PlacedFeatures.wouldSurvive(StandardWoodModBlocks.MOD_SAPLING));
//        register(context, ROUND_GREEN_MAPLE_PLACED_BEES_005_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ROUND_GREEN_MAPLE_BEES_005_KEY), PlacedFeatures.wouldSurvive(StandardWoodModBlocks.MOD_SAPLING));
//        register(context, POINTED_GREEN_MAPLE_PLACED_BEES_005_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POINTED_GREEN_MAPLE_BEES_005_KEY), PlacedFeatures.wouldSurvive(StandardWoodModBlocks.MOD_SAPLING));
//        register(context, ROUND_RED_MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ROUND_RED_MAPLE_KEY), PlacedFeatures.wouldSurvive(ModBlocks.RED_MAPLE_SAPLING));
//        register(context, POINTED_RED_MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POINTED_RED_MAPLE_KEY), PlacedFeatures.wouldSurvive(ModBlocks.RED_MAPLE_SAPLING));
//        register(context, ROUND_RED_MAPLE_PLACED_BEES_005_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ROUND_RED_MAPLE_BEES_005_KEY), PlacedFeatures.wouldSurvive(ModBlocks.RED_MAPLE_SAPLING));
//        register(context, POINTED_RED_MAPLE_PLACED_BEES_005_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POINTED_RED_MAPLE_BEES_005_KEY), PlacedFeatures.wouldSurvive(ModBlocks.RED_MAPLE_SAPLING));
//        register(context, ROUND_YELLOW_MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ROUND_YELLOW_MAPLE_KEY), PlacedFeatures.wouldSurvive(ModBlocks.YELLOW_MAPLE_SAPLING));
//        register(context, POINTED_YELLOW_MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POINTED_YELLOW_MAPLE_KEY), PlacedFeatures.wouldSurvive(ModBlocks.YELLOW_MAPLE_SAPLING));
//        register(context, ROUND_YELLOW_MAPLE_PLACED_BEES_005_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ROUND_YELLOW_MAPLE_BEES_005_KEY), PlacedFeatures.wouldSurvive(ModBlocks.YELLOW_MAPLE_SAPLING));
//        register(context, POINTED_YELLOW_MAPLE_PLACED_BEES_005_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POINTED_YELLOW_MAPLE_BEES_005_KEY), PlacedFeatures.wouldSurvive(ModBlocks.YELLOW_MAPLE_SAPLING));

        /* FOREST */
        register(context, ROUND_GREEN_MAPLE_BEES_0002_LEAF_LITTER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ROUND_GREEN_MAPLE_BEES_0002_LEAF_LITTER_KEY), PlacedFeatures.wouldSurvive(StandardWoodModBlocks.MOD_SAPLING));
        register(context, POINTED_GREEN_MAPLE_BEES_0002_LEAF_LITTER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POINTED_GREEN_MAPLE_BEES_0002_LEAF_LITTER_KEY), PlacedFeatures.wouldSurvive(StandardWoodModBlocks.MOD_SAPLING));

        /* FLOWER FOREST */
        register(context, ROUND_GREEN_MAPLE_BEES_002_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ROUND_GREEN_MAPLE_BEES_002_KEY), PlacedFeatures.wouldSurvive(StandardWoodModBlocks.MOD_SAPLING));
        register(context, POINTED_GREEN_MAPLE_BEES_002_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POINTED_GREEN_MAPLE_BEES_002_KEY), PlacedFeatures.wouldSurvive(StandardWoodModBlocks.MOD_SAPLING));
        register(context, ROUND_YELLOW_MAPLE_BEES_002_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ROUND_YELLOW_MAPLE_BEES_002_KEY), PlacedFeatures.wouldSurvive(ModBlocks.YELLOW_MAPLE_SAPLING));
        register(context, POINTED_YELLOW_MAPLE_BEES_002_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POINTED_YELLOW_MAPLE_BEES_002_KEY), PlacedFeatures.wouldSurvive(ModBlocks.YELLOW_MAPLE_SAPLING));

        /* SNOWY TAIGA */
        register(context, ROUND_RED_MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ROUND_RED_MAPLE_KEY), PlacedFeatures.wouldSurvive(ModBlocks.RED_MAPLE_SAPLING));
        register(context, POINTED_RED_MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POINTED_RED_MAPLE_KEY), PlacedFeatures.wouldSurvive(ModBlocks.RED_MAPLE_SAPLING));
        register(context, ROUND_YELLOW_MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ROUND_YELLOW_MAPLE_KEY), PlacedFeatures.wouldSurvive(ModBlocks.YELLOW_MAPLE_SAPLING));
        register(context, POINTED_YELLOW_MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POINTED_YELLOW_MAPLE_KEY), PlacedFeatures.wouldSurvive(ModBlocks.YELLOW_MAPLE_SAPLING));

        /* GROVE */
        BlockPredicate blockPredicate = BlockPredicate.matchingBlocks(Direction.DOWN.getVector(), Blocks.SNOW_BLOCK, Blocks.POWDER_SNOW);
        List<PlacementModifier> list = List.of(
                EnvironmentScanPlacementModifier.of(Direction.UP, BlockPredicate.not(BlockPredicate.matchingBlocks(Blocks.POWDER_SNOW)), 8),
                BlockFilterPlacementModifier.of(blockPredicate)
        );
        register(context, ROUND_RED_MAPLE_ON_SNOW_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ROUND_RED_MAPLE_KEY), list);
        register(context, POINTED_RED_MAPLE_ON_SNOW_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POINTED_RED_MAPLE_KEY), list);
        register(context, ROUND_YELLOW_MAPLE_ON_SNOW_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ROUND_YELLOW_MAPLE_KEY), list);
        register(context, POINTED_YELLOW_MAPLE_ON_SNOW_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POINTED_YELLOW_MAPLE_KEY), list);


        /* FALLEN MAPLE TREE */
        register(context, FALLEN_MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FALLEN_MAPLE_TREE_KEY), PlacedFeatures.wouldSurvive(StandardWoodModBlocks.MOD_SAPLING));

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(MapleWood.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
