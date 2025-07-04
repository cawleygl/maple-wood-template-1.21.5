package bluesteel42.maplewood.datagen;

import bluesteel42.maplewood.block.ModBlocks;
import bluesteel42.maplewood.entity.ModBoats;
import bluesteel42.maplewood.item.ModItems;
import bluesteel42.maplewood.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.MAPLE_LOGS)
                .add(ModBlocks.MAPLE_LOG.asItem())
                .add(ModBlocks.MAPLE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_LOG.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN).addTag(ModTags.Items.MAPLE_LOGS);
        getOrCreateTagBuilder(ItemTags.PLANKS).add(ModBlocks.MAPLE_PLANKS.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS).add(ModBlocks.MAPLE_STAIRS.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS).add(ModBlocks.MAPLE_SLAB.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS).add(ModBlocks.MAPLE_DOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS).add(ModBlocks.MAPLE_TRAPDOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES).add(ModBlocks.MAPLE_FENCE.asItem());
        getOrCreateTagBuilder(ItemTags.FENCE_GATES).add(ModBlocks.MAPLE_FENCE_GATE.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS).add(ModBlocks.MAPLE_BUTTON.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.MAPLE_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ItemTags.SIGNS).add(ModItems.MAPLE_SIGN);
        getOrCreateTagBuilder(ItemTags.HANGING_SIGNS).add(ModItems.MAPLE_HANGING_SIGN);

        getOrCreateTagBuilder(ItemTags.BOATS).add(ModBoats.MAPLE_BOAT.asItem());
        getOrCreateTagBuilder(ItemTags.CHEST_BOATS).add(ModBoats.MAPLE_CHEST_BOAT.asItem());

        getOrCreateTagBuilder(ItemTags.LEAVES).add(ModBlocks.GREEN_MAPLE_LEAVES.asItem());
        getOrCreateTagBuilder(ItemTags.LEAVES).add(ModBlocks.RED_MAPLE_LEAVES.asItem());
        getOrCreateTagBuilder(ItemTags.LEAVES).add(ModBlocks.YELLOW_MAPLE_LEAVES.asItem());
        getOrCreateTagBuilder(ItemTags.SAPLINGS).add(ModBlocks.GREEN_MAPLE_SAPLING.asItem());
        getOrCreateTagBuilder(ItemTags.SAPLINGS).add(ModBlocks.RED_MAPLE_SAPLING.asItem());
        getOrCreateTagBuilder(ItemTags.SAPLINGS).add(ModBlocks.YELLOW_MAPLE_SAPLING.asItem());
    }
}
