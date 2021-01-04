package wtf.jl.tinyrockets.setup;

import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.fml.RegistryObject;
import wtf.jl.tinyrockets.TinyRockets;

public class ModBlockLootTables extends BlockLootTables {

    @Override
    protected void addTables() {

//        registerDropSelfLootTable() is from the super class

//        registerDropSelfLootTable(ModBlocks.CHONDRITE_BLOCK.get());
//        registerDropSelfLootTable(ModBlocks.MELTER_MACHINE_BLOCK.get());
//        registerDropSelfLootTable(ModBlocks.SUPERICE_BLOCK.get());

//      All Custom Mod blocks drop themselves, to make things easier, rather then defining each one as above
        for (Block block:getKnownBlocks()){
            registerDropSelfLootTable(block);
            TinyRockets.LOGGER.info("Registering JSON Loot table: "+block.toString());
        }

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        //get all _custom_ blocks
        return Registration.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;

    }


}
