package steel.tools.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;
import steel.tools.SteelToolsAndArmor;
import steel.tools.init.BlockInit;
import steel.tools.init.ItemGroupInit;
import steel.tools.init.ItemInit;

import java.util.concurrent.CompletableFuture;

public class SteelToolsAndArmorENProvider extends FabricLanguageProvider {

    public SteelToolsAndArmorENProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if(text.getContent() instanceof  TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            SteelToolsAndArmor.LOGGER.warn("Failed to add translation for text: {}", text.getString());
        }
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        //adds translation for items
        translationBuilder.add(ItemInit.COMPACTED_COAL, "Compacted Coal");
        translationBuilder.add(ItemInit.SUPER_COMPACTED_COAL, "Super Compacted Coal");
        translationBuilder.add(ItemInit.STEEL_INGOT, "Steel Ingot");
        translationBuilder.add(ItemInit.MOLTEN_IRON, "Molten Iron");
        translationBuilder.add(ItemInit.MOLTEN_STEEL, "Molten Steel");
        translationBuilder.add(ItemInit.MOLTEN_NETHERITE, "Molten Netherite");
        translationBuilder.add(ItemInit.SWEET_APPLE, "Sweet Apple");
        translationBuilder.add(BlockInit.STEEL_BLOCK, "Steel Block");
        translationBuilder.add(ItemInit.STEEL_HELMET, "Steel Helmet");
        translationBuilder.add(ItemInit.STEEL_CHESTPLATE, "Steel Chestplate");
        translationBuilder.add(ItemInit.STEEL_LEGGINGS, "Steel Leggings");
        translationBuilder.add(ItemInit.STEEL_BOOTS, "Steel Boots");
        translationBuilder.add(ItemInit.STEEL_SWORD, "Steel Sword");
        translationBuilder.add(ItemInit.STEEL_AXE, "Steel Axe");
        translationBuilder.add(ItemInit.STEEL_PICKAXE, "Steel Pickaxe");
        translationBuilder.add(ItemInit.STEEL_SHOVEL, "Steel Shovel");
        translationBuilder.add(ItemInit.STEEL_HOE, "Steel Hoe");
        translationBuilder.add(ItemInit.REINFORCED_STEEL_INGOT, "Reinforced Steel Ingot");
        translationBuilder.add(ItemInit.REINFORCED_STEEL_HELMET, "Reinforced Steel Helmet");
        translationBuilder.add(ItemInit.REINFORCED_STEEL_CHESTPLATE, "Reinforced Steel Chestplate");
        translationBuilder.add(ItemInit.REINFORCED_STEEL_LEGGINGS, "Reinforced Steel Leggings");
        translationBuilder.add(ItemInit.REINFORCED_STEEL_BOOTS, "Reinforced Steel Boots");
        translationBuilder.add(ItemInit.REINFORCED_STEEL_PICKAXE, "Reinforced Steel Pickaxe");
        translationBuilder.add(ItemInit.REINFORCED_STEEL_AXE, "Reinforced Steel Axe");
        translationBuilder.add(ItemInit.REINFORCED_STEEL_SHOVEL, "Reinforced Steel Shovel");
        translationBuilder.add(ItemInit.REINFORCED_STEEL_SWORD, "Reinforced Steel Sword");
        translationBuilder.add(ItemInit.REINFORCED_STEEL_HOE, "Reinforced Steel Hoe");
        translationBuilder.add(BlockInit.REINFORCED_STEEL_BLOCK, "Reinforced Steel Block");
        translationBuilder.add(BlockInit.COMPACTED_COAL_BLOCK, "Compacted Coal Block");
        translationBuilder.add(BlockInit.SUPER_COMPACTED_COAL_BLOCK, "Super Compacted Coal Block");
        addText(translationBuilder, ItemGroupInit.STEEL_TOOLS_TITLE, "Steel Tools and Armor");
    }
}
