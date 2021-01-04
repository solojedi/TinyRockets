package wtf.jl.tinyrockets.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    //ORES & IN WORLD SPAWN
    public static final RegistryObject<Block> CHONDRITE_BLOCK = register("chondrite_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(8,1200).harvestLevel(3).harvestTool(ToolType.PICKAXE).setRequiresTool().sound(SoundType.STONE)));

    public static final RegistryObject<Block> SUPERICE_BLOCK = register("superice_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.ICE).hardnessAndResistance(1,5).harvestLevel(0).sound(SoundType.GLASS).harvestTool(ToolType.PICKAXE).slipperiness(2F)));


    //MACHINES
    public static final RegistryObject<Block> MELTER_MACHINE_BLOCK = register("melter_machine_block", ()->
            new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3,10).sound(SoundType.WOOD)));



    public static void register(){}

    private static <T extends Block>RegistryObject<T> registerNoItem(String name, Supplier<T> block){
        return Registration.BLOCKS.register(name,block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block){
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name,()-> new BlockItem(ret.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
        return ret;
    }
}




