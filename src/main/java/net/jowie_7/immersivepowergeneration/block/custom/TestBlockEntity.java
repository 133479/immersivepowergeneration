package net.jowie_7.immersivepowergeneration.block.custom;

import com.mojang.serialization.MapCodec;
import net.jowie_7.immersivepowergeneration.block.entity.TestBlockEntityEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class TestBlockEntity /* extends BaseEntityBlock */ {
//    public static final VoxelShape SHAPE = Block.box(2,0,2,14,13,14);
//    public static final MapCodec<TestBlockEntity> CODEC = simpleCodec(TestBlockEntity::new);
//
//
//    public TestBlockEntity(Properties properties) {
//        super (properties);
//    }
//
//    @Override
//    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
//        return SHAPE;
//    }
//
//    @Override
//    protected MapCodec<? extends BaseEntityBlock> codec() {
//        return CODEC;
//    }
//
//    /* BLOCK ENTITY */
//
//    @Override
//    protected RenderShape getRenderShape(BlockState state) {
//        return RenderShape.MODEL;
//    }
//
//    @Nullable
//    @Override
//    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState){
//        return new TestBlockEntityEntity(blockPos, blockState);
//    }

}
