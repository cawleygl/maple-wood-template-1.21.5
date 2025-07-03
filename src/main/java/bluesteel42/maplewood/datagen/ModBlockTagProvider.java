package bluesteel42.maplewood.datagen;

import bluesteel42.maplewood.block.ModBlocks;
import bluesteel42.maplewood.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Blocks.MAPLE_LOGS)
                .add(ModBlocks.MAPLE_LOG)
                .add(ModBlocks.MAPLE_WOOD)
                .add(ModBlocks.STRIPPED_MAPLE_LOG)
                .add(ModBlocks.STRIPPED_MAPLE_WOOD);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN).addTag(ModTags.Blocks.MAPLE_LOGS);
        getOrCreateTagBuilder(BlockTags.PLANKS).add(ModBlocks.MAPLE_PLANKS);
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS).add(ModBlocks.MAPLE_STAIRS);
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS).add(ModBlocks.MAPLE_SLAB);
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS).add(ModBlocks.MAPLE_DOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS).add(ModBlocks.MAPLE_TRAPDOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES).add(ModBlocks.MAPLE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.MAPLE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS).add(ModBlocks.MAPLE_BUTTON);
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.MAPLE_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS).add(ModBlocks.MAPLE_STANDING_SIGN);
        getOrCreateTagBuilder(BlockTags.WALL_SIGNS).add(ModBlocks.MAPLE_WALL_SIGN);
        getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS).add(ModBlocks.MAPLE_HANGING_SIGN);
        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS).add(ModBlocks.MAPLE_WALL_HANGING_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS).add(ModBlocks.MAPLE_WALL_HANGING_SIGN);

        getOrCreateTagBuilder(BlockTags.LEAVES).add(ModBlocks.GREEN_MAPLE_LEAVES);
        getOrCreateTagBuilder(BlockTags.LEAVES).add(ModBlocks.RED_MAPLE_LEAVES);
        getOrCreateTagBuilder(BlockTags.LEAVES).add(ModBlocks.YELLOW_MAPLE_LEAVES);
        getOrCreateTagBuilder(BlockTags.SAPLINGS).add(ModBlocks.GREEN_MAPLE_SAPLING);
        getOrCreateTagBuilder(BlockTags.SAPLINGS).add(ModBlocks.YELLOW_MAPLE_SAPLING);
        getOrCreateTagBuilder(BlockTags.SAPLINGS).add(ModBlocks.RED_MAPLE_SAPLING);
        getOrCreateTagBuilder(BlockTags.FLOWER_POTS).add(ModBlocks.POTTED_GREEN_MAPLE_SAPLING);
        getOrCreateTagBuilder(BlockTags.FLOWER_POTS).add(ModBlocks.POTTED_YELLOW_MAPLE_SAPLING);
        getOrCreateTagBuilder(BlockTags.FLOWER_POTS).add(ModBlocks.POTTED_RED_MAPLE_SAPLING);
    }
}
