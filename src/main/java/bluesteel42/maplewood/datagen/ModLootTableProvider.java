package bluesteel42.maplewood.datagen;

import bluesteel42.maplewood.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MAPLE_LOG);
        addDrop(ModBlocks.MAPLE_WOOD);
        addDrop(ModBlocks.STRIPPED_MAPLE_LOG);
        addDrop(ModBlocks.STRIPPED_MAPLE_WOOD);

        addDrop(ModBlocks.MAPLE_PLANKS);
        addDrop(ModBlocks.MAPLE_STAIRS);
        addDrop(ModBlocks.MAPLE_BUTTON);
        addDrop(ModBlocks.MAPLE_FENCE_GATE);
        addDrop(ModBlocks.MAPLE_FENCE);
        addDrop(ModBlocks.MAPLE_PRESSURE_PLATE);
        addDrop(ModBlocks.MAPLE_TRAPDOOR);
        addDrop(ModBlocks.MAPLE_DOOR, doorDrops(ModBlocks.MAPLE_DOOR));
        addDrop(ModBlocks.MAPLE_SLAB, slabDrops(ModBlocks.MAPLE_SLAB));

        addDrop(ModBlocks.MAPLE_STANDING_SIGN);
        addDrop(ModBlocks.MAPLE_WALL_SIGN);
        addDrop(ModBlocks.MAPLE_HANGING_SIGN);
        addDrop(ModBlocks.MAPLE_WALL_HANGING_SIGN);

        addDrop(ModBlocks.GREEN_MAPLE_SAPLING);
        addDrop(ModBlocks.RED_MAPLE_SAPLING);
        addDrop(ModBlocks.YELLOW_MAPLE_SAPLING);
        addDrop(ModBlocks.POTTED_GREEN_MAPLE_SAPLING, pottedPlantDrops(ModBlocks.GREEN_MAPLE_LEAVES));
        addDrop(ModBlocks.POTTED_RED_MAPLE_SAPLING, pottedPlantDrops(ModBlocks.RED_MAPLE_SAPLING));
        addDrop(ModBlocks.POTTED_YELLOW_MAPLE_SAPLING, pottedPlantDrops(ModBlocks.YELLOW_MAPLE_SAPLING));
        addDrop(ModBlocks.GREEN_MAPLE_LEAVES, leavesDrops(ModBlocks.GREEN_MAPLE_LEAVES, ModBlocks.GREEN_MAPLE_SAPLING, 0.05f));
        addDrop(ModBlocks.RED_MAPLE_LEAVES, leavesDrops(ModBlocks.RED_MAPLE_LEAVES, ModBlocks.RED_MAPLE_SAPLING, 0.05f));
        addDrop(ModBlocks.YELLOW_MAPLE_LEAVES, leavesDrops(ModBlocks.YELLOW_MAPLE_LEAVES, ModBlocks.YELLOW_MAPLE_SAPLING, 0.05f));
    }
}
