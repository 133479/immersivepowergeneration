package net.jowie_7.immersivepowergeneration.block;

import net.jowie_7.immersivepowergeneration.ImmersivePowerGeneration;
import net.jowie_7.immersivepowergeneration.block.entity.BoxEntityBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ImmersivePowerGeneration.MOD_ID);

    public static final DeferredBlock<Block> TESTBLOCK = BLOCKS.register(
            "testblock",
            registryName -> new Block(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .destroyTime(1f)
                    .explosionResistance(5f)
                    .sound(SoundType.ANVIL)
                    .lightLevel(state -> 7)
            )
    );

    public static final DeferredBlock<BoxEntityBlock> BOX_BLOCK = BLOCKS.register(
            "box",
            registryName -> new BoxEntityBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .explosionResistance(5f)
                    .sound(SoundType.WOOD)
                    .lightLevel(state -> 10)
            ));

//    public static final DeferredBlock<Block> TESTBLOCKENTITY = BLOCKS.register(
//            "testblockentity",
//            registryName -> new Block(BlockBehaviour.Properties.of()
//                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
//                    .noCollision()
//            )
//    );

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
