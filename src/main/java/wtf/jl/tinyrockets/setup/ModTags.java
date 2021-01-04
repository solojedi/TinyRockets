package wtf.jl.tinyrockets.setup;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import wtf.jl.tinyrockets.TinyRockets;

public class ModTags {


    public static final class Blocks {
        public static final ITag.INamedTag<Block> ORES_MOON = forge("ores/moon");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_MOON = forge("storage_blocks/moon");

        private static ITag.INamedTag<Block> forge(String path){
            return BlockTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path){
            return BlockTags.makeWrapperTag(new ResourceLocation(TinyRockets.MOD_ID, path).toString());
        }

    }

    public static final class Items {

        public static final ITag.INamedTag<Item> ORES_MOON = forge("ores/moon");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_MOON = forge("storage_blocks/moon");

        public static final ITag.INamedTag<Item> INGOT_MOON = forge("ingots/moon");


        private static ITag.INamedTag<Item> forge(String path){
            return ItemTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path){
            return ItemTags.makeWrapperTag(new ResourceLocation(TinyRockets.MOD_ID, path).toString());
        }

    }
}
