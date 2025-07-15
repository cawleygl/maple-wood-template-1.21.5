package bluesteel42.maplewood.block;

import bluesteel42.maplewood.MapleWood;
import bluesteel42.maplewood.particle.ModParticles;
import bluesteel42.maplewood.world.tree.ModSaplingGenerators;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import bluesteel42.standard_wood_initializer.block.StandardWoodModBlocks;

import java.util.function.Function;

public class ModBlocks {
    public static final Block GREEN_MAPLE_LEAVES = register(
            "green_maple_leaves",
            settings -> new TintedParticleMapleLeavesBlock(0.01F, settings),
            Blocks.createLeavesSettings(BlockSoundGroup.GRASS),true,true
    );
    public static final Block RED_MAPLE_LEAVES = register(
            "red_maple_leaves",
            settings -> new UntintedParticleLeavesBlock(0.01F, ModParticles.RED_MAPLE_LEAVES, settings),
            Blocks.createLeavesSettings(BlockSoundGroup.GRASS), true, true
    );
    public static final Block YELLOW_MAPLE_LEAVES = register(
            "yellow_maple_leaves",
            settings -> new UntintedParticleLeavesBlock(0.01F, ModParticles.YELLOW_MAPLE_LEAVES, settings),
            Blocks.createLeavesSettings(BlockSoundGroup.GRASS), true, true
    );
    public static final Block RED_MAPLE_SAPLING = register(
            "red_maple_sapling",
            settings -> new SaplingBlock(ModSaplingGenerators.RED_MAPLE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_SAPLING),
            true,
            true
    );
    public static final Block YELLOW_MAPLE_SAPLING = register(
            "yellow_maple_sapling",
            settings -> new SaplingBlock(ModSaplingGenerators.YELLOW_MAPLE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_SAPLING),
            true,
            true
    );
    public static final Block POTTED_YELLOW_MAPLE_SAPLING = register(
            "potted_yellow_maple_sapling",
            settings -> new FlowerPotBlock(YELLOW_MAPLE_SAPLING, settings),
            Blocks.createFlowerPotSettings(),
            true,
            true
    );
    public static final Block POTTED_RED_MAPLE_SAPLING = register(
            "potted_red_maple_sapling",
            settings -> new FlowerPotBlock(RED_MAPLE_SAPLING, settings),
            Blocks.createFlowerPotSettings(),
            true,
            true
    );

    private static Block register(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings, boolean registerItem, boolean nonOpaqueBlock) {
        final Identifier identifier = Identifier.of(MapleWood.MOD_ID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);

        if (registerItem) {
            Items.register(block);
        }

        if (nonOpaqueBlock) {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
        }

        return block;
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL)
                .register((itemGroup) -> {
                    itemGroup.addAfter(Items.PALE_OAK_LEAVES, ModBlocks.RED_MAPLE_LEAVES);
                    itemGroup.addAfter(Items.PALE_OAK_LEAVES, ModBlocks.YELLOW_MAPLE_LEAVES);
                    itemGroup.addAfter(Items.PALE_OAK_LEAVES, ModBlocks.GREEN_MAPLE_LEAVES);
                    itemGroup.addAfter(StandardWoodModBlocks.MOD_SAPLING, ModBlocks.RED_MAPLE_SAPLING);
                    itemGroup.addAfter(StandardWoodModBlocks.MOD_SAPLING, ModBlocks.YELLOW_MAPLE_SAPLING);
                });
    }
}
