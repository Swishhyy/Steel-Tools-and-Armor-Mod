package steel.tools.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import steel.tools.init.BlockInit;
import steel.tools.init.ItemInit;

public class SteelToolsAndArmorModelProvider extends FabricModelProvider {
    public SteelToolsAndArmorModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.REINFORCED_STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.COMPACTED_COAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.SUPER_COMPACTED_COAL_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemInit.COMPACTED_COAL, Models.GENERATED);
        itemModelGenerator.register(ItemInit.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.MOLTEN_IRON, Models.GENERATED);
        itemModelGenerator.register(ItemInit.SWEET_APPLE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.STEEL_HELMET, Models.GENERATED);
        itemModelGenerator.register(ItemInit.STEEL_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.STEEL_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.STEEL_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.STEEL_SWORD, Models.GENERATED);
        itemModelGenerator.register(ItemInit.STEEL_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ItemInit.STEEL_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.STEEL_AXE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.STEEL_HOE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.REINFORCED_STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.REINFORCED_STEEL_HELMET, Models.GENERATED);
        itemModelGenerator.register(ItemInit.REINFORCED_STEEL_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.REINFORCED_STEEL_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.REINFORCED_STEEL_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.REINFORCED_STEEL_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ItemInit.REINFORCED_STEEL_SWORD, Models.GENERATED);
        itemModelGenerator.register(ItemInit.REINFORCED_STEEL_AXE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.REINFORCED_STEEL_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.REINFORCED_STEEL_HOE, Models.GENERATED);
    }
}
