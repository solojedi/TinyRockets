package wtf.jl.tinyrockets.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    public static final RegistryObject<Item> CHONDRITE_DUST = Registration.ITEMS.register("chondrite_dust", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    static void register(){}


}
