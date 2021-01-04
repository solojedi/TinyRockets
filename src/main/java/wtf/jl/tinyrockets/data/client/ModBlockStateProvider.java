package wtf.jl.tinyrockets.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import wtf.jl.tinyrockets.TinyRockets;
import wtf.jl.tinyrockets.setup.ModBlocks;


public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, TinyRockets.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.MELTER_MACHINE_BLOCK.get());
        simpleBlock(ModBlocks.CHONDRITE_BLOCK.get());
        simpleBlock(ModBlocks.SUPERICE_BLOCK.get());


    }
}












































