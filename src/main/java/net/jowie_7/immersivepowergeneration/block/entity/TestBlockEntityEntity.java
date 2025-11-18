package net.jowie_7.immersivepowergeneration.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.Containers;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.neoforged.neoforge.items.ItemStackHandler;


public class TestBlockEntityEntity /* extends BlockEntity */ {
//    public final ItemStackHandler inventory = new ItemStackHandler(10) {
//        @Override
//        protected int getStackLimit(int slot, ItemStack stack) {
//            return 10;
//        }
//
//        @Override
//        protected void onContentsChanged(int slot) {
//            setChanged();
//            if(!level.isClientSide()){
//                level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
//            }
//        }
//    };
//
//    public TestBlockEntityEntity(BlockPos pos, BlockState blockState) {
//        super(ModBlockEntities.TEST_BE.get(), pos, blockState);
//    }
//
//    public void clearContents() {
//        inventory.setStackInSlot(0, ItemStack.EMPTY);
//    }
//
//    public void drops() {
//        SimpleContainer inv = new SimpleContainer(inventory.getSlots());
//        for(int i = 0; i < inventory.getSlots(); i++) {
//            inv.setItem(i, inventory.getStackInSlot(i));
//        }
//        Containers.dropContents(this.level, this.worldPosition, inv);
//    }
}
