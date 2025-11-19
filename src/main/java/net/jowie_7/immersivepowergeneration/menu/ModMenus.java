package net.jowie_7.immersivepowergeneration.menu;


import net.jowie_7.immersivepowergeneration.ImmersivePowerGeneration;
import net.jowie_7.immersivepowergeneration.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModMenus extends AbstractContainerMenu {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(
            BuiltInRegistries.MENU,
            ImmersivePowerGeneration.MOD_ID
    );
    public static final Supplier<MenuType<ModMenus>> MOD_MENU = MENUS.register("box_menu", () -> new MenuType<>(ModMenus::new, FeatureFlags.DEFAULT_FLAGS));

    public ModMenus(int containerId, Inventory playerInv) {
        super(MOD_MENU.get(), containerId);
    }

    public void MyMenuAccess(int containerId, Inventory playerInventory, ContainerLevelAccess access) {
        this(containerId,
                playerInventory,
                ContainerLevelAccess.NULL);
    }

    @Override
    public ItemStack quickMoveStack(Player player, int i) {
        return null;
    }

    @Override
    public boolean stillValid(Player player) {
        return AbstractContainerMenu.stillValid(this.access, player, ModBlocks.BOX_BLOCK.get());
    }
}
