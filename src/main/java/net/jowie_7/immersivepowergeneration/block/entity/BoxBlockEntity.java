package net.jowie_7.immersivepowergeneration.block.entity;

import net.jowie_7.immersivepowergeneration.ImmersivePowerGeneration;
import net.jowie_7.immersivepowergeneration.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.awt.*;
import java.util.function.Supplier;

public class BoxBlockEntity extends BlockEntity {

    public BoxBlockEntity(BlockPos pos, BlockState state) {
        super(BOX_BLOCK_ENTITY.get(), pos, state);
    }

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, ImmersivePowerGeneration.MOD_ID);

    public static final Supplier<BlockEntityType<BoxBlockEntity>> BOX_BLOCK_ENTITY = BLOCK_ENTITY_TYPES.register(
            "box_block_entity",
            // The block entity type.
            () -> new BlockEntityType<>(
                    // The supplier to use for constructing the block entity instances.
                    BoxBlockEntity::new,
                    // An optional value that, when true, only allows players with OP permissions
                    // to load NBT data (e.g. placing a block item)
                    false,
                    // A vararg of blocks that can have this block entity.
                    // This assumes the existence of the referenced blocks as DeferredBlock<Block>s.
                    ModBlocks.BOX_BLOCK.get()
            )
    );

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITY_TYPES.register(eventBus);
    }
}