package net.jowie_7.immersivepowergeneration.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

// The important part is implementing the EntityBlock interface and overriding the #newBlockEntity method.
public class BoxEntityBlock extends Block implements EntityBlock {
        // Constructor deferring to super.
        public BoxEntityBlock(BlockBehaviour.Properties properties) {
            super(properties);
        }

        // Return a new instance of our block entity here.
        @Override
        public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
            return new BoxBlockEntity(pos, state);
        }
    }
