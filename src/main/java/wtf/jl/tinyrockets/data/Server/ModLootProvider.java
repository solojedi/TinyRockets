package wtf.jl.tinyrockets.data.Server;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.loot.*;
import net.minecraft.util.ResourceLocation;
import wtf.jl.tinyrockets.setup.ModBlockLootTables;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;


public class ModLootProvider extends LootTableProvider {

    public ModLootProvider(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Nonnull
    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(Pair.of(ModBlockLootTables::new, LootParameterSets.BLOCK));
    }

//  Kept receiving the following error.  It appears that GatherData runs the _validate_ method from the super class.
//  When it does, it then validates against the vanila blocks rather then the forge blocks.  Overide the class to produce our own results
//  against the loot table validation.
//  [minecraft/LootTableProvider]: Found validation problem in : Missing built-in table: minecraft: *

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
         map.forEach((name, table) ->
                LootTableManager.validateLootTable(validationtracker, name, table));
    }
}
