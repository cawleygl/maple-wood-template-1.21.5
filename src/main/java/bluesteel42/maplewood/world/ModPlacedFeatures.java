package bluesteel42.maplewood.world;

import bluesteel42.maplewood.MapleWood;
import bluesteel42.maplewood.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> MAPLE_PLACED_KEY = registerKey("maple");
    public static final RegistryKey<PlacedFeature> MAPLE_LEAF_LITTER_PLACED_KEY = registerKey("maple_leaf_litter");
    public static final RegistryKey<PlacedFeature> MAPLE_PLACED_BEES_005_KEY = registerKey("maple_bees_005");
    public static final RegistryKey<PlacedFeature> FANCY_MAPLE_PLACED_KEY = registerKey("fancy_maple");
    public static final RegistryKey<PlacedFeature> FANCY_MAPLE_PLACED_BEES_005_KEY = registerKey("fancy_maple_bees_005");
    public static final RegistryKey<PlacedFeature> FALLEN_MAPLE_PLACED_KEY = registerKey("fallen_maple_tree");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAPLE_KEY),
                PlacedFeatures.wouldSurvive(ModBlocks.MAPLE_SAPLING)
        );
        register(context, MAPLE_LEAF_LITTER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAPLE_KEY),
                PlacedFeatures.wouldSurvive(ModBlocks.MAPLE_SAPLING)
        );
        register(context, MAPLE_PLACED_BEES_005_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAPLE_BEES_005_KEY),
                PlacedFeatures.wouldSurvive(ModBlocks.MAPLE_SAPLING)
        );
        register(context, FANCY_MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FANCY_MAPLE_KEY),
                PlacedFeatures.wouldSurvive(ModBlocks.MAPLE_SAPLING)
        );
        register(context, FANCY_MAPLE_PLACED_BEES_005_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FANCY_MAPLE_BEES_005_KEY),
                PlacedFeatures.wouldSurvive(ModBlocks.MAPLE_SAPLING)
        );
        register(context, FALLEN_MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FALLEN_MAPLE_TREE_KEY),
                PlacedFeatures.wouldSurvive(ModBlocks.MAPLE_SAPLING)
        );

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
