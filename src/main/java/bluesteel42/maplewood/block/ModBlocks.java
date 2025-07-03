package bluesteel42.maplewood.block;

import bluesteel42.maplewood.MapleWood;
import bluesteel42.maplewood.particle.ModParticles;
import bluesteel42.maplewood.world.tree.ModSaplingGenerators;
import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    public static final Block MAPLE_LOG = register("maple_log", PillarBlock::new, Blocks.createLogSettings(MapColor.TERRACOTTA_WHITE, MapColor.TERRACOTTA_GRAY, BlockSoundGroup.WOOD), true, false);
    public static final Block MAPLE_WOOD = register("maple_wood", PillarBlock::new, Blocks.createLogSettings(MapColor.TERRACOTTA_GRAY, MapColor.TERRACOTTA_GRAY, BlockSoundGroup.WOOD), true, false);
    public static final Block STRIPPED_MAPLE_LOG = register("stripped_maple_log", PillarBlock::new, Blocks.createLogSettings(MapColor.TERRACOTTA_WHITE, MapColor.TERRACOTTA_WHITE, BlockSoundGroup.WOOD), true, false);
    public static final Block STRIPPED_MAPLE_WOOD = register("stripped_maple_wood", PillarBlock::new, Blocks.createLogSettings(MapColor.TERRACOTTA_WHITE, MapColor.TERRACOTTA_WHITE, BlockSoundGroup.WOOD), true, false);
    public static final Block MAPLE_PLANKS = register(
            "maple_planks",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RAW_IRON_PINK)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true,
            false
    );
    public static final Block MAPLE_STAIRS = register(
            "maple_stairs",
            settings -> new StairsBlock(MAPLE_PLANKS.getDefaultState(), settings),
            AbstractBlock.Settings.copy(MAPLE_PLANKS),
            true,
            false
    );
    public static final Block MAPLE_SLAB = register(
            "maple_slab",
            SlabBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RAW_IRON_PINK)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true,
            false
    );
    public static final Block MAPLE_BUTTON = register(
            "maple_button",
            settings -> new ButtonBlock(BlockSetType.OAK, 30, settings),
            AbstractBlock.Settings.create()
                    .noCollision()
                    .strength(0.5F)
                    .pistonBehavior(PistonBehavior.DESTROY),
            true,
            false
    );
    public static final Block MAPLE_PRESSURE_PLATE = register(
            "maple_pressure_plate",
            settings -> new PressurePlateBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RAW_IRON_PINK)
                    .solid()
                    .instrument(NoteBlockInstrument.BASS)
                    .noCollision()
                    .strength(0.5F)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY),
            true,
            false
    );
    public static final Block MAPLE_FENCE = register(
            "maple_fence",
            FenceBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RAW_IRON_PINK)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true,
            false
    );
    public static final Block MAPLE_FENCE_GATE = register(
            "maple_fence_gate",
            settings -> new FenceGateBlock(WoodType.OAK, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RAW_IRON_PINK)
                    .solid()
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .burnable(),
            true,
            false
    );
    public static final Block MAPLE_DOOR = register(
            "maple_door",
            settings -> new DoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RAW_IRON_PINK)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY),
            true,
            true
    );
    public static final Block MAPLE_TRAPDOOR = register(
            "maple_trapdoor",
            settings -> new TrapdoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RAW_IRON_PINK)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .burnable(),
            true,
            true
    );
    public static final Identifier MAPLE_SIGN_TEXTURE = Identifier.of(MapleWood.MOD_ID, "entity/signs/maple");
    public static final Identifier MAPLE_HANGING_SIGN_TEXTURE = Identifier.of(MapleWood.MOD_ID, "entity/signs/hanging/maple");
    public static final Identifier MAPLE_HANGING_GUI_SIGN_TEXTURE = Identifier.of(MapleWood.MOD_ID, "textures/gui/hanging_signs/maple");
    public static final Block MAPLE_STANDING_SIGN = register(
            "maple_standing_sign",
            settings -> new TerraformSignBlock(MAPLE_SIGN_TEXTURE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_SIGN)
                    .mapColor(MapColor.RAW_IRON_PINK),
            false,
            false
    );

    public static final Block MAPLE_WALL_SIGN = register(
            "maple_wall_sign",
            settings -> new TerraformWallSignBlock(MAPLE_SIGN_TEXTURE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_SIGN).mapColor(MapColor.RAW_IRON_PINK).lootTable(MAPLE_STANDING_SIGN.getLootTableKey()).overrideTranslationKey(MAPLE_STANDING_SIGN.getTranslationKey()),
            false,
            false
    );

    public static final Block MAPLE_HANGING_SIGN = register(
            "maple_hanging_sign",
            settings -> new TerraformHangingSignBlock(MAPLE_HANGING_SIGN_TEXTURE, MAPLE_HANGING_GUI_SIGN_TEXTURE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)
                    .mapColor(MapColor.RAW_IRON_PINK),
            false,
            false
    );

    public static final Block MAPLE_WALL_HANGING_SIGN = register(
            "maple_hanging_wall_sign",
            settings -> new TerraformWallHangingSignBlock(MAPLE_HANGING_SIGN_TEXTURE, MAPLE_HANGING_GUI_SIGN_TEXTURE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN).mapColor(MapColor.RAW_IRON_PINK).lootTable(MAPLE_HANGING_SIGN.getLootTableKey()).overrideTranslationKey(MAPLE_HANGING_SIGN.getTranslationKey()),
            false,
            false
    );

    public static final BlockFamily MAPLE_SIGN_FAMILY = BlockFamilies.register(ModBlocks.MAPLE_PLANKS)
            .sign(ModBlocks.MAPLE_STANDING_SIGN, ModBlocks.MAPLE_WALL_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final BlockFamily MAPLE_HANGING_SIGN_FAMILY = BlockFamilies.register(ModBlocks.STRIPPED_MAPLE_LOG)
            .sign(ModBlocks.MAPLE_HANGING_SIGN, ModBlocks.MAPLE_WALL_HANGING_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final Block GREEN_MAPLE_LEAVES = register(
            "green_maple_leaves",
            settings -> new TintedParticleLeavesBlock(0.01F, settings),
            Blocks.createLeavesSettings(BlockSoundGroup.GRASS), true, true
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
    public static final Block GREEN_MAPLE_SAPLING = register(
            "green_maple_sapling",
            settings -> new SaplingBlock(ModSaplingGenerators.GREEN_MAPLE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_SAPLING),
            true,
            true
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
    public static final Block POTTED_GREEN_MAPLE_SAPLING = register(
            "potted_green_maple_sapling",
            settings -> new FlowerPotBlock(GREEN_MAPLE_SAPLING, settings),
            Blocks.createFlowerPotSettings(),
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
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> {
                    itemGroup.addAfter(Items.PALE_OAK_BUTTON, ModBlocks.MAPLE_BUTTON);
                    itemGroup.addAfter(Items.PALE_OAK_BUTTON, ModBlocks.MAPLE_PRESSURE_PLATE);
                    itemGroup.addAfter(Items.PALE_OAK_BUTTON, ModBlocks.MAPLE_TRAPDOOR);
                    itemGroup.addAfter(Items.PALE_OAK_BUTTON, ModBlocks.MAPLE_DOOR);
                    itemGroup.addAfter(Items.PALE_OAK_BUTTON, ModBlocks.MAPLE_FENCE_GATE);
                    itemGroup.addAfter(Items.PALE_OAK_BUTTON, ModBlocks.MAPLE_FENCE);
                    itemGroup.addAfter(Items.PALE_OAK_BUTTON, ModBlocks.MAPLE_SLAB);
                    itemGroup.addAfter(Items.PALE_OAK_BUTTON, ModBlocks.MAPLE_STAIRS);
                    itemGroup.addAfter(Items.PALE_OAK_BUTTON, ModBlocks.MAPLE_PLANKS);
                    itemGroup.addAfter(Items.PALE_OAK_BUTTON, ModBlocks.STRIPPED_MAPLE_WOOD);
                    itemGroup.addAfter(Items.PALE_OAK_BUTTON, ModBlocks.STRIPPED_MAPLE_LOG);
                    itemGroup.addAfter(Items.PALE_OAK_BUTTON, ModBlocks.MAPLE_WOOD);
                    itemGroup.addAfter(Items.PALE_OAK_BUTTON, ModBlocks.MAPLE_LOG);
                });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL)
                .register((itemGroup) -> {
                    itemGroup.addAfter(Items.PALE_OAK_LOG, ModBlocks.MAPLE_LOG);
                    itemGroup.addAfter(Items.PALE_OAK_LEAVES, ModBlocks.GREEN_MAPLE_LEAVES);
                    itemGroup.addAfter(Items.PALE_OAK_LEAVES, ModBlocks.RED_MAPLE_LEAVES);
                    itemGroup.addAfter(Items.PALE_OAK_LEAVES, ModBlocks.YELLOW_MAPLE_LEAVES);
                    itemGroup.addAfter(Items.PALE_OAK_SAPLING, ModBlocks.GREEN_MAPLE_SAPLING);
                    itemGroup.addAfter(Items.PALE_OAK_SAPLING, ModBlocks.RED_MAPLE_SAPLING);
                    itemGroup.addAfter(Items.PALE_OAK_SAPLING, ModBlocks.YELLOW_MAPLE_SAPLING);
                });
    }
}
