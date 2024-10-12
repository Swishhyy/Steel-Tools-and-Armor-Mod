package steel.tools.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import steel.tools.init.ItemInit;

import java.util.concurrent.CompletableFuture;

public class SteelToolsAndArmorItemTagProvider extends FabricTagProvider<Item> {
    public SteelToolsAndArmorItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
//        getOrCreateTagBuilder(ItemTags.SWORDS)
//                .add(ItemInit.Steel_Sword);
//
//        getOrCreateTagBuilder(ItemTags.PICKAXES)
//                .add(ItemInit.Steel_Pickaxe);
//
//        getOrCreateTagBuilder(ItemTags.SHOVELS)
//                .add(ItemInit.Steel_Shovel);
//
//        getOrCreateTagBuilder(ItemTags.AXES)
//                .add(ItemInit.Steel_Axe);
//
//        getOrCreateTagBuilder(ItemTags.HOES)
//                .add(ItemInit.Steel_Hoe);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ItemInit.STEEL_HELMET);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ItemInit.STEEL_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ItemInit.STEEL_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ItemInit.STEEL_BOOTS);
    }
}
