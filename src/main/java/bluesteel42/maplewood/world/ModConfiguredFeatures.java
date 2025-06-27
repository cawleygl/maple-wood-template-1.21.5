package bluesteel42.maplewood.world;

import bluesteel42.maplewood.MapleWood;
import bluesteel42.maplewood.block.ModBlocks;
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
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;
import java.util.OptionalInt;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> MAPLE_KEY = registerKey("maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAPLE_LEAF_LITTER = registerKey("maple_leaf_litter");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAPLE_BEES_005_KEY = registerKey("maple_bees_005");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_MAPLE_KEY = registerKey("fancy_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_MAPLE_BEES_005_KEY = registerKey("fancy_maple_bees_005");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FALLEN_MAPLE_TREE_KEY = registerKey("fallen_maple_tree");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MAPLE_LOG),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.of(ModBlocks.MAPLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)
        ).ignoreVines().build());

        register(context, MAPLE_LEAF_LITTER, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MAPLE_LOG),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.of(ModBlocks.MAPLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)
        )
            .ignoreVines()
            .decorators(
                    ImmutableList.of(
                        new PlaceOnGroundTreeDecorator(96, 4, 2, new WeightedBlockStateProvider(VegetationConfiguredFeatures.leafLitter(1, 3))),
                        new PlaceOnGroundTreeDecorator(150, 2, 2, new WeightedBlockStateProvider(VegetationConfiguredFeatures.leafLitter(1, 4)))
                    )).build()
        );

        register(context, MAPLE_BEES_005_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MAPLE_LOG),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.of(ModBlocks.MAPLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)
        ).ignoreVines().decorators(List.of(new BeehiveTreeDecorator(0.05F))).build());

        register(context, FANCY_MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MAPLE_LOG),
                new LargeOakTrunkPlacer(3, 11, 0),
                BlockStateProvider.of(ModBlocks.MAPLE_LEAVES),
                new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
        )
                .ignoreVines().build());

        register(context, FANCY_MAPLE_BEES_005_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MAPLE_LOG),
                new LargeOakTrunkPlacer(3, 11, 0),
                BlockStateProvider.of(ModBlocks.MAPLE_LEAVES),
                new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
        )
                .ignoreVines().decorators(List.of(new BeehiveTreeDecorator(0.05F))).build());

        register(context, FALLEN_MAPLE_TREE_KEY, Feature.FALLEN_TREE,
                new FallenTreeFeatureConfig.Builder(BlockStateProvider.of(ModBlocks.MAPLE_LOG), UniformIntProvider.create(4, 7))
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
