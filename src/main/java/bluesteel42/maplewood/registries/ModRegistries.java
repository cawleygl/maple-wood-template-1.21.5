package bluesteel42.maplewood.registries;

import bluesteel42.maplewood.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;

public class ModRegistries {
    public static void registerCompostables() {
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MAPLE_LEAVES, 0.3F);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MAPLE_LEAVES, 0.3F);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MAPLE_SAPLING, 0.3F);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MAPLE_SAPLING, 0.3F);
    }

    public static void registerFlammables() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_MAPLE_LEAVES, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_MAPLE_LEAVES, 30, 60);
    }

    public static void registerTrades() {
        TradeOfferHelper.registerWanderingTraderOffers(wanderingTraderOffersBuilder -> {
            wanderingTraderOffersBuilder.addOffersToPool(TradeOfferHelper.WanderingTraderOffersBuilder.SELL_COMMON_ITEMS_POOL,
                    (entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 5),
                            new ItemStack(ModBlocks.RED_MAPLE_SAPLING.asItem(), 1),
                            8,  1, 5)
            );
            wanderingTraderOffersBuilder.addOffersToPool(TradeOfferHelper.WanderingTraderOffersBuilder.SELL_COMMON_ITEMS_POOL,
                    (entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 5),
                            new ItemStack(ModBlocks.YELLOW_MAPLE_SAPLING.asItem(), 1),
                            8,  1, 5)
            );
        });
    }
}
