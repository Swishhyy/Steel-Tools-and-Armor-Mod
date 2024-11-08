package steel.tools.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import steel.tools.init.BlockInit;
import steel.tools.list.TagList;

import java.util.concurrent.CompletableFuture;

public class SteelToolsAndArmorBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public SteelToolsAndArmorBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(BlockInit.STEEL_BLOCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(BlockInit.STEEL_BLOCK);

        getOrCreateTagBuilder(TagList.Blocks.STEEL_TAG)
                .add(BlockInit.STEEL_BLOCK);

        getOrCreateTagBuilder(TagList.Blocks.INCORRECT_FOR_STEEL_TOOL);


        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(BlockInit.REINFORCED_STEEL_BLOCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(BlockInit.REINFORCED_STEEL_BLOCK);

        getOrCreateTagBuilder(TagList.Blocks.STEEL_TAG)
                .add(BlockInit.REINFORCED_STEEL_BLOCK);

    }
}
