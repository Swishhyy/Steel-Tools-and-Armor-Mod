package steel.tools.data.provider;

import com.google.common.collect.Lists;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Util;
import steel.tools.init.BlockInit;
import steel.tools.init.ItemInit;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class SteelToolsAndArmorRecipeProvider extends FabricRecipeProvider {
    public SteelToolsAndArmorRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    // List of Meltable items into Liquid Iron
    public static final List<ItemConvertible> MELTABLE_TO_LIQUID_IRON = Util.make(Lists.newArrayList(), list -> {
        list.add(Items.IRON_INGOT);  // You can add more items that smelt into steel if needed
    });

    @Override
    public void generate(RecipeExporter exporter) {
        // Shaped Recipe: 9 Steel Ingots -> 1 Steel Block
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.STEEL_BLOCK)
                .input('X', ItemInit.STEEL_INGOT)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .criterion(hasItem(ItemInit.STEEL_INGOT), conditionsFromItem(ItemInit.STEEL_INGOT))
                .offerTo(exporter);

        //Recipes for Steel Armor
        // Shaped Recipe: 5 Steel Ingots -> 1 Steel Helmet
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.STEEL_HELMET)
                .input('X', ItemInit.STEEL_INGOT)
                .pattern("XXX")
                .pattern("X X")
                .criterion(hasItem(ItemInit.STEEL_INGOT), conditionsFromItem(ItemInit.STEEL_INGOT))
                .offerTo(exporter);
        // Shaped Recipe: 8 Steel Ingots -> 1 Steel Chestplate
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.STEEL_CHESTPLATE)
                .input('X', ItemInit.STEEL_INGOT)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .criterion(hasItem(ItemInit.STEEL_INGOT), conditionsFromItem(ItemInit.STEEL_INGOT))
                .offerTo(exporter);
        // Shaped Recipe: 7 Steel Ingots -> 1 Steel Leggings
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.STEEL_LEGGINGS)
                .input('X', ItemInit.STEEL_INGOT)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .criterion(hasItem(ItemInit.STEEL_INGOT), conditionsFromItem(ItemInit.STEEL_INGOT))
                .offerTo(exporter);
        // Shaped Recipe: 4 Steel Ingots -> 1 Steel Boots
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.STEEL_BOOTS)
                .input('X', ItemInit.STEEL_INGOT)
                .pattern("X X")
                .pattern("X X")
                .criterion(hasItem(ItemInit.STEEL_INGOT), conditionsFromItem(ItemInit.STEEL_INGOT))
                .offerTo(exporter);

        //Shaped Recipes for Steel Tools
        //Recipe for Steel Sword
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.STEEL_SWORD)
                .input('X', ItemInit.STEEL_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("X")
                .pattern("X")
                .pattern("S")
                .criterion(hasItem(ItemInit.STEEL_INGOT), conditionsFromItem(ItemInit.STEEL_INGOT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.STEEL_PICKAXE)
                .input('X', ItemInit.STEEL_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("XXX")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(hasItem(ItemInit.STEEL_INGOT), conditionsFromItem(ItemInit.STEEL_INGOT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.STEEL_AXE)
                .input('X', ItemInit.STEEL_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("XX ")
                .pattern("XS ")
                .pattern(" S ")
                .criterion(hasItem(ItemInit.STEEL_INGOT), conditionsFromItem(ItemInit.STEEL_INGOT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.STEEL_SHOVEL)
                .input('X', ItemInit.STEEL_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("X")
                .pattern("S")
                .pattern("S")
                .criterion(hasItem(ItemInit.STEEL_INGOT), conditionsFromItem(ItemInit.STEEL_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.STEEL_HOE)
                .input('X', ItemInit.STEEL_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("XX ")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(hasItem(ItemInit.STEEL_INGOT), conditionsFromItem(ItemInit.STEEL_INGOT))
                .offerTo(exporter);

        //Shapeless Recipes
        // Shapeless Recipe: 1 Steel Block -> 9 Steel Ingots
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ItemInit.STEEL_INGOT, 9)
                .input(BlockInit.STEEL_BLOCK)
                .criterion(hasItem(BlockInit.STEEL_BLOCK), conditionsFromItem(BlockInit.STEEL_BLOCK))
                .offerTo(exporter);

        // Shapeless Recipe: 5 Compacted Coal from 1 Coal
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ItemInit.COMPACTED_COAL, 5)
                .input(Items.COAL)  // Use vanilla Minecraft coal as input
                .criterion("has_coal", conditionsFromItem(Items.COAL))  // Criterion for Coal
                .criterion("has_iron_ingot", conditionsFromItem(Items.IRON_INGOT))  // Criterion for Iron Ingot
                .offerTo(exporter);

        // Add smelting and blasting recipes for Iron Ingot -> Liquid Iron
        RecipeProvider.offerBlasting(exporter,
                MELTABLE_TO_LIQUID_IRON,
                RecipeCategory.MISC,
                ItemInit.LIQUID_IRON,
                0.7f,
                100,
                "steel_ingot_blasting");

    }

    private static String hasTag(TagKey<Item> tag) {
        return "has_" + tag.id().toString();
    }
}
