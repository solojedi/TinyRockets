package wtf.jl.tinyrockets.data.Server;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import wtf.jl.tinyrockets.TinyRockets;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, TinyRockets.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
//        copy(ModTags.Blocks.ORES_MOON, ModTags.Items.ORES_MOON);
//        copy(Tags.Blocks.ORES, Tags.Items.ORES);
//        copy(ModTags.Blocks.STORAGE_BLOCKS_MOON, ModTags.Items.STORAGE_BLOCKS_MOON);
//        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
//
//        getOrCreateBuilder(ModTags.Items.INGOT_MOON).add(ModItems.MOON_ROCK.get());
//        getOrCreateBuilder(Tags.Items.INGOTS).addTag(ModTags.Items.INGOT_MOON);
    }
}
