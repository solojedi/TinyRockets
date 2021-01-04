package wtf.jl.tinyrockets.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import wtf.jl.tinyrockets.TinyRockets;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator,  ExistingFileHelper existingFileHelper) {
        super(generator, TinyRockets.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //BLOCKS
        withExistingParent("chondrite_block", modLoc("block/chondrite_block"));
        withExistingParent("superice_block", modLoc("block/superice_block"));
        withExistingParent("melter_machine_block", modLoc("block/melter_machine_block"));


        //ITEMS
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        builder(itemGenerated, "chondrite_dust");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/"+name);
    }
}


















































