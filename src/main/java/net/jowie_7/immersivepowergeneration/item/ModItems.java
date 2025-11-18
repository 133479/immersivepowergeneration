package net.jowie_7.immersivepowergeneration.item;

import net.jowie_7.immersivepowergeneration.ImmersivePowerGeneration;
import net.jowie_7.immersivepowergeneration.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ImmersivePowerGeneration.MOD_ID);

    public static final DeferredItem<Item> TESTITEM  = ITEMS.registerSimpleItem("testitem", new Item.Properties());

    public static final DeferredItem<BlockItem> TESTBLOCKITEM = ITEMS.registerSimpleBlockItem(
            "testblock",
            ModBlocks.TESTBLOCK
    );

    public static final DeferredItem<BlockItem> BOXBLOCKITEM = ITEMS.registerSimpleBlockItem(
            "box",
            ModBlocks.BOX_BLOCK
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}