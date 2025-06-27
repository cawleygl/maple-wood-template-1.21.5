package bluesteel42.maplewood.item;

import bluesteel42.maplewood.MapleWood;
import bluesteel42.maplewood.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MAPLE_SIGN = registerSignItem("maple_sign");
    public static final Item MAPLE_HANGING_SIGN = registerHangingSignItem("maple_hanging_sign");

    public static Item registerSignItem(String path) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MapleWood.MOD_ID, path));
        final Item item = new SignItem(
                ModBlocks.MAPLE_STANDING_SIGN,
                ModBlocks.MAPLE_WALL_SIGN,
                new Item.Settings().registryKey(registryKey).maxCount(16));

        return Registry.register(Registries.ITEM, registryKey.getValue(), item);
    }

    public static Item registerHangingSignItem(String path) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MapleWood.MOD_ID, path));
        final Item item = new HangingSignItem(
                ModBlocks.MAPLE_HANGING_SIGN,
                ModBlocks.MAPLE_WALL_HANGING_SIGN,
                new Item.Settings().registryKey(registryKey).maxCount(16));

        return Registry.register(Registries.ITEM, registryKey.getValue(), item);
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL)
                .register((itemGroup) -> {
                    itemGroup.addAfter(Items.PALE_OAK_HANGING_SIGN, ModItems.MAPLE_HANGING_SIGN);
                    itemGroup.addAfter(Items.PALE_OAK_HANGING_SIGN, ModItems.MAPLE_SIGN);
                });

    }
}
