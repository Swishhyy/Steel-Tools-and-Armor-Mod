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
        translationBuilder.add(ItemInit.STEEL_INGOT, "Steel Ingot");
        translationBuilder.add(ItemInit.LIQUID_IRON, "Liquid Iron");
        translationBuilder.add(ItemInit.SWEET_APPLE, "Sweet Apple");
        translationBuilder.add(BlockInit.STEEL_BLOCK, "Steel Block");
        translationBuilder.add(ItemInit.STEEL_HELMET, "Steel Helmet");
        translationBuilder.add(ItemInit.STEEL_CHESTPLATE, "Steel Chestplate");
        translationBuilder.add(ItemInit.STEEL_LEGGINGS, "Steel Leggings");
        translationBuilder.add(ItemInit.STEEL_BOOTS, "Steel Boots");
        addText(translationBuilder, ItemGroupInit.STEEL_TOOLS_TITLE, "Steel Tools and Armor");

    }
}
