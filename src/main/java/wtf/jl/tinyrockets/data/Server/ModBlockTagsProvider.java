package wtf.jl.tinyrockets.data.Server;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import wtf.jl.tinyrockets.TinyRockets;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, TinyRockets.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
//        getOrCreateBuilder(ModTags.Blocks.ORES_MOON).add(ModBlocks.MOON_ORE.get());
//        getOrCreateBuilder(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_MOON);
//        getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_MOON).add(ModBlocks.MOON_BLOCK.get());
//        getOrCreateBuilder(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_MOON);
    }
}
