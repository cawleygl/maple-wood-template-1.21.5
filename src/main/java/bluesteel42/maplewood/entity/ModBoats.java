package bluesteel42.maplewood.entity;

import bluesteel42.maplewood.MapleWood;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModBoats {
    public static final Identifier MAPLE_BOATS_ID = Identifier.of(MapleWood.MOD_ID, "maple");

    public static final Item MAPLE_BOAT = registerBoatItem("maple_boat", ModBoats.MAPLE_BOATS_ID, false, false);
    public static final Item MAPLE_CHEST_BOAT = registerBoatItem("maple_chest_boat", ModBoats.MAPLE_BOATS_ID, true, false);

    public static Item registerBoatItem(String path, Identifier boatId, boolean chest, boolean raft) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MapleWood.MOD_ID, path));
        return TerraformBoatItemHelper.registerBoatItem(
                boatId,
                new Item.Settings().maxCount(1).registryKey(registryKey),
                chest,
                raft
        );
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> {
                    itemGroup.addAfter(Items.PALE_OAK_CHEST_BOAT, ModBoats.MAPLE_CHEST_BOAT);
                    itemGroup.addAfter(Items.PALE_OAK_CHEST_BOAT, ModBoats.MAPLE_BOAT);
                });

    }

}
