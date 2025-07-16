package bluesteel42.maplewood.world;

import bluesteel42.maplewood.MapleWood;
import bluesteel42.maplewood.block.ModBlocks;
import bluesteel42.maplewood.standard_wood_initializer.block.StandardWoodModBlocks;
import com.google.common.collect.ImmutableList;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.Pool;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.treedecorator.*;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;
import java.util.OptionalInt;

public class ModConfiguredFeatures {
    /* OTHER */
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROUND_RED_MAPLE_BEES_0002_LEAF_LITTER_KEY = registerKey("round_red_maple_bees_0002_leaf_litter");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POINTED_RED_MAPLE_BEES_0002_LEAF_LITTER_KEY = registerKey("pointed_red_maple_bees_0002_leaf_litter");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROUND_YELLOW_MAPLE_BEES_0002_LEAF_LITTER_KEY = registerKey("round_yellow_maple_bees_0002_leaf_litter");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POINTED_YELLOW_MAPLE_BEES_0002_LEAF_LITTER_KEY = registerKey("pointed_yellow_maple_bees_0002_leaf_litter");

    /* SAPLING-GENERATED */
    public static final RegistryKey<ConfiguredFeature<?, ?>> POINTED_YELLOW_MAPLE_BEES_005_KEY = registerKey("pointed_yellow_maple_bees_005");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROUND_YELLOW_MAPLE_BEES_005_KEY = registerKey("round_yellow_maple_bees_005");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POINTED_GREEN_MAPLE_KEY = registerKey("pointed_green_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROUND_GREEN_MAPLE_KEY = registerKey("round_green_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POINTED_RED_MAPLE_BEES_005_KEY = registerKey("pointed_red_maple_bees_005");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROUND_RED_MAPLE_BEES_005_KEY = registerKey("round_red_maple_bees_005");
        /* PLAINS */
    public static final RegistryKey<ConfiguredFeature<?, ?>> POINTED_GREEN_MAPLE_BEES_005_KEY = registerKey("pointed_green_maple_bees_005");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROUND_GREEN_MAPLE_BEES_005_KEY = registerKey("round_green_maple_bees_005");
        /* SNOWY TAIGA / GROVE */
    public static final RegistryKey<ConfiguredFeature<?, ?>> POINTED_RED_MAPLE_KEY = registerKey("pointed_red_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROUND_RED_MAPLE_KEY = registerKey("round_red_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POINTED_YELLOW_MAPLE_KEY = registerKey("pointed_yellow_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROUND_YELLOW_MAPLE_KEY = registerKey("round_yellow_maple");

    /* FOREST */
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROUND_GREEN_MAPLE_BEES_0002_LEAF_LITTER_KEY = registerKey("round_green_maple_bees_0002_leaf_litter");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POINTED_GREEN_MAPLE_BEES_0002_LEAF_LITTER_KEY = registerKey("pointed_green_maple_bees_0002_leaf_litter");

    /* FLOWER FOREST */
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROUND_GREEN_MAPLE_BEES_002_KEY = registerKey("round_green_maple_bees_002");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POINTED_GREEN_MAPLE_BEES_002_KEY = registerKey("pointed_green_maple_bees_002");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROUND_YELLOW_MAPLE_BEES_002_KEY = registerKey("round_yellow_maple_bees_002");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POINTED_YELLOW_MAPLE_BEES_002_KEY = registerKey("pointed_yellow_maple_bees_002");

    /* FALLEN MAPLE TREE */
    public static final RegistryKey<ConfiguredFeature<?, ?>> FALLEN_MAPLE_TREE_KEY = registerKey("fallen_maple_tree");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        BlockStateProvider mapleLogs = BlockStateProvider.of(StandardWoodModBlocks.MOD_LOG);
        StraightTrunkPlacer roundTrunk = new StraightTrunkPlacer(5, 2, 0);
        StraightTrunkPlacer pointedTrunk = new StraightTrunkPlacer(7, 2, 0);
        BlobFoliagePlacer roundFoliage =  new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4);
        BlobFoliagePlacer pointedFoliage =  new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 5);
        TwoLayersFeatureSize roundFeatures = new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4));
        TwoLayersFeatureSize pointedFeatures = new TwoLayersFeatureSize(2, 1, 0);
        PlaceOnGroundTreeDecorator placeOnGroundTreeDecorator = new PlaceOnGroundTreeDecorator(96, 4, 2, new WeightedBlockStateProvider(VegetationConfiguredFeatures.leafLitter(1, 3)));
        PlaceOnGroundTreeDecorator placeOnGroundTreeDecorator2 = new PlaceOnGroundTreeDecorator(150, 2, 2, new WeightedBlockStateProvider(VegetationConfiguredFeatures.leafLitter(1, 4)));
        BeehiveTreeDecorator beehiveTreeDecorator005 = new BeehiveTreeDecorator(0.05F);
        BeehiveTreeDecorator beehiveTreeDecorator0002 = new BeehiveTreeDecorator(0.002F);
        BeehiveTreeDecorator beehiveTreeDecorator002 = new BeehiveTreeDecorator(0.02F);

        TreeFeatureConfig.Builder roundGreenMapleTree = new TreeFeatureConfig.Builder(mapleLogs, roundTrunk, BlockStateProvider.of(ModBlocks.GREEN_MAPLE_LEAVES), roundFoliage, roundFeatures);
        TreeFeatureConfig.Builder roundRedMapleTree = new TreeFeatureConfig.Builder(mapleLogs, roundTrunk, BlockStateProvider.of(ModBlocks.RED_MAPLE_LEAVES), roundFoliage, roundFeatures);
        TreeFeatureConfig.Builder roundYellowMapleTree = new TreeFeatureConfig.Builder(mapleLogs, roundTrunk, BlockStateProvider.of(ModBlocks.YELLOW_MAPLE_LEAVES), roundFoliage, roundFeatures);

        TreeFeatureConfig.Builder pointedGreenMapleTree = new TreeFeatureConfig.Builder(mapleLogs, pointedTrunk, BlockStateProvider.of(ModBlocks.GREEN_MAPLE_LEAVES), pointedFoliage, pointedFeatures);
        TreeFeatureConfig.Builder pointedRedMapleTree = new TreeFeatureConfig.Builder(mapleLogs, pointedTrunk, BlockStateProvider.of(ModBlocks.RED_MAPLE_LEAVES), pointedFoliage, pointedFeatures);
        TreeFeatureConfig.Builder pointedYellowMapleTree = new TreeFeatureConfig.Builder(mapleLogs, pointedTrunk, BlockStateProvider.of(ModBlocks.YELLOW_MAPLE_LEAVES), pointedFoliage, pointedFeatures);

        /* SAPLING-GENERATED */
        register(context, ROUND_GREEN_MAPLE_KEY, Feature.TREE, roundGreenMapleTree.ignoreVines().build());
        register(context, POINTED_GREEN_MAPLE_KEY, Feature.TREE, pointedGreenMapleTree.ignoreVines().build());
        register(context, ROUND_GREEN_MAPLE_BEES_005_KEY, Feature.TREE, roundGreenMapleTree.ignoreVines().decorators(List.of(beehiveTreeDecorator005)).build());
        register(context, POINTED_GREEN_MAPLE_BEES_005_KEY, Feature.TREE, pointedGreenMapleTree.ignoreVines().decorators(List.of(beehiveTreeDecorator005)).build());
        register(context, ROUND_RED_MAPLE_KEY, Feature.TREE, roundRedMapleTree.ignoreVines().build());
        register(context, POINTED_RED_MAPLE_KEY, Feature.TREE, pointedRedMapleTree.ignoreVines().build());
        register(context, ROUND_RED_MAPLE_BEES_005_KEY, Feature.TREE, roundRedMapleTree.ignoreVines().decorators(List.of(beehiveTreeDecorator005)).build());
        register(context, POINTED_RED_MAPLE_BEES_005_KEY, Feature.TREE, pointedRedMapleTree.ignoreVines().decorators(List.of(beehiveTreeDecorator005)).build());
        register(context, ROUND_YELLOW_MAPLE_KEY, Feature.TREE, roundYellowMapleTree.ignoreVines().build());
        register(context, POINTED_YELLOW_MAPLE_KEY, Feature.TREE, pointedYellowMapleTree.ignoreVines().build());
        register(context, ROUND_YELLOW_MAPLE_BEES_005_KEY, Feature.TREE, roundYellowMapleTree.ignoreVines().decorators(List.of(beehiveTreeDecorator005)).build());
        register(context, POINTED_YELLOW_MAPLE_BEES_005_KEY, Feature.TREE, pointedYellowMapleTree.ignoreVines().decorators(List.of(beehiveTreeDecorator005)).build());

        /* FOREST */
        register(context, ROUND_GREEN_MAPLE_BEES_0002_LEAF_LITTER_KEY, Feature.TREE, roundGreenMapleTree.ignoreVines().decorators(ImmutableList.of(beehiveTreeDecorator0002, placeOnGroundTreeDecorator, placeOnGroundTreeDecorator2)).build());
        register(context, POINTED_GREEN_MAPLE_BEES_0002_LEAF_LITTER_KEY, Feature.TREE, pointedGreenMapleTree.ignoreVines().decorators(ImmutableList.of(beehiveTreeDecorator0002, placeOnGroundTreeDecorator, placeOnGroundTreeDecorator2)).build());

        /* FLOWER FOREST */
        register(context, ROUND_GREEN_MAPLE_BEES_002_KEY, Feature.TREE, roundGreenMapleTree.ignoreVines().decorators(ImmutableList.of(beehiveTreeDecorator002)).build());
        register(context, POINTED_GREEN_MAPLE_BEES_002_KEY, Feature.TREE, pointedGreenMapleTree.ignoreVines().decorators(ImmutableList.of(beehiveTreeDecorator002)).build());
        register(context, ROUND_YELLOW_MAPLE_BEES_002_KEY, Feature.TREE, roundYellowMapleTree.ignoreVines().decorators(ImmutableList.of(beehiveTreeDecorator002)).build());
        register(context, POINTED_YELLOW_MAPLE_BEES_002_KEY, Feature.TREE, pointedYellowMapleTree.ignoreVines().decorators(ImmutableList.of(beehiveTreeDecorator002)).build());

        /* OTHER */
        register(context, ROUND_RED_MAPLE_BEES_0002_LEAF_LITTER_KEY, Feature.TREE, roundRedMapleTree.ignoreVines().decorators(ImmutableList.of(beehiveTreeDecorator0002, placeOnGroundTreeDecorator, placeOnGroundTreeDecorator2)).build());
        register(context, POINTED_RED_MAPLE_BEES_0002_LEAF_LITTER_KEY, Feature.TREE, pointedRedMapleTree.ignoreVines().decorators(ImmutableList.of(beehiveTreeDecorator0002, placeOnGroundTreeDecorator, placeOnGroundTreeDecorator2)).build());
        register(context, ROUND_YELLOW_MAPLE_BEES_0002_LEAF_LITTER_KEY, Feature.TREE, roundYellowMapleTree.ignoreVines().decorators(ImmutableList.of(beehiveTreeDecorator0002, placeOnGroundTreeDecorator, placeOnGroundTreeDecorator2)).build());
        register(context, POINTED_YELLOW_MAPLE_BEES_0002_LEAF_LITTER_KEY, Feature.TREE, pointedYellowMapleTree.ignoreVines().decorators(ImmutableList.of(beehiveTreeDecorator0002, placeOnGroundTreeDecorator, placeOnGroundTreeDecorator2)).build());

        /* FALLEN MAPLE TREE */
        register(context, FALLEN_MAPLE_TREE_KEY, Feature.FALLEN_TREE,
                new FallenTreeFeatureConfig.Builder(mapleLogs, UniformIntProvider.create(6, 8))
                .logDecorators(
                        ImmutableList.of(
                                new AttachedToLogsTreeDecorator(
                                        0.1F,
                                        new WeightedBlockStateProvider(Pool.<BlockState>builder().add(Blocks.RED_MUSHROOM.getDefaultState(), 2).add(Blocks.BROWN_MUSHROOM.getDefaultState(), 1)),
                                        List.of(Direction.UP)
                                )
                        )
                ).stumpDecorators(ImmutableList.of(TrunkVineTreeDecorator.INSTANCE)).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(MapleWood.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration ) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
