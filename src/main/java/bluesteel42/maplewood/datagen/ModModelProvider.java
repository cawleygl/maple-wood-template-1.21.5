package bluesteel42.maplewood.datagen;

import bluesteel42.maplewood.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.TexturedModel;
import net.minecraft.world.biome.FoliageColors;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.createLogTexturePool(ModBlocks.MAPLE_LOG).log(ModBlocks.MAPLE_LOG).wood(ModBlocks.MAPLE_WOOD);
        blockStateModelGenerator.createLogTexturePool(ModBlocks.STRIPPED_MAPLE_LOG).log(ModBlocks.STRIPPED_MAPLE_LOG).wood(ModBlocks.STRIPPED_MAPLE_WOOD);

        BlockStateModelGenerator.BlockTexturePool pinePlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAPLE_PLANKS);
        pinePlankPool.stairs(ModBlocks.MAPLE_STAIRS);
        pinePlankPool.slab(ModBlocks.MAPLE_SLAB);
        pinePlankPool.button(ModBlocks.MAPLE_BUTTON);
        pinePlankPool.fence(ModBlocks.MAPLE_FENCE);
        pinePlankPool.fenceGate(ModBlocks.MAPLE_FENCE_GATE);
        pinePlankPool.pressurePlate(ModBlocks.MAPLE_PRESSURE_PLATE);
        blockStateModelGenerator.registerDoor(ModBlocks.MAPLE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.MAPLE_TRAPDOOR);

        // Signs Textures
        pinePlankPool.family(ModBlocks.MAPLE_SIGN_FAMILY);
        pinePlankPool.family(ModBlocks.MAPLE_HANGING_SIGN_FAMILY);

        blockStateModelGenerator.registerTintedBlockAndItem(ModBlocks.GREEN_MAPLE_LEAVES, TexturedModel.LEAVES, FoliageColors.DEFAULT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_MAPLE_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_MAPLE_LEAVES);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(ModBlocks.GREEN_MAPLE_SAPLING, ModBlocks.POTTED_GREEN_MAPLE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(ModBlocks.RED_MAPLE_SAPLING, ModBlocks.POTTED_RED_MAPLE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(ModBlocks.YELLOW_MAPLE_SAPLING, ModBlocks.POTTED_YELLOW_MAPLE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
