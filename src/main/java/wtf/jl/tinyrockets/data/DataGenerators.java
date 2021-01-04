package wtf.jl.tinyrockets.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import wtf.jl.tinyrockets.TinyRockets;
import wtf.jl.tinyrockets.data.Server.ModBlockTagsProvider;
import wtf.jl.tinyrockets.data.Server.ModItemTagsProvider;
import wtf.jl.tinyrockets.data.Server.ModLootProvider;
import wtf.jl.tinyrockets.data.client.ModBlockStateProvider;
import wtf.jl.tinyrockets.data.client.ModItemModelProvider;

@Mod.EventBusSubscriber(modid = TinyRockets.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
    private DataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));

        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(gen, existingFileHelper);
        gen.addProvider(blockTags);
        gen.addProvider(new ModItemTagsProvider(gen,blockTags, existingFileHelper));

        gen.addProvider(new ModLootProvider(gen));
    }

}













