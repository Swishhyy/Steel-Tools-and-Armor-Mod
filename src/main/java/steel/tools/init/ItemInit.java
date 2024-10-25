package steel.tools.init;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import steel.tools.SteelToolsAndArmor;
import steel.tools.list.FoodList;
import steel.tools.list.enums.ToolMaterials;

public class ItemInit {

    // Init for crafting items
    public static final Item REINFORCED_STEEL_INGOT = register("reinforced_steel_ingot", new Item(new Item.Settings()));
    public static final Item STEEL_INGOT = register("steel_ingot", new Item(new Item.Settings()));
    public static final Item MOLTEN_IRON = register("molten_iron", new Item(new Item.Settings()));
    public static final Item MOLTEN_STEEL = register("molten_steel", new Item(new Item.Settings()));
    public static final Item MOLTEN_NETHERITE = register("molten_netherite", new Item(new Item.Settings()));


    // Init for Compacted Coal as a fuel type
    public static final Item COMPACTED_COAL = register("compacted_coal", new Item(new Item.Settings()));
    static {  // Static block to register fuel immediately after initialization
        FuelRegistry.INSTANCE.add(COMPACTED_COAL, 9600); // 3200 ticks = twice the burn time of coal
    }

    public static final Item SUPER_COMPACTED_COAL = register("super_compacted_coal", new Item(new Item.Settings()));
    static {  // Static block to register fuel immediately after initialization
        FuelRegistry.INSTANCE.add(SUPER_COMPACTED_COAL, 19200); // Twice as much as compacted coal
    }

    // Init for food items
    public static final Item SWEET_APPLE = register("sweet_apple", new Item(
            new Item.Settings().food(FoodList.SWEET_APPLE_COMPONENT)));

    // Init for Armor Types
    public static final ArmorItem STEEL_HELMET = register( "steel_helmet",
            new ArmorItem(ArmorMaterialInit.STEEL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(34))
                    .maxCount(1)));
    public static final ArmorItem STEEL_CHESTPLATE = register( "steel_chestplate",
            new ArmorItem(ArmorMaterialInit.STEEL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(34))
                    .maxCount(1)));
    public static final ArmorItem STEEL_LEGGINGS = register( "steel_leggings",
            new ArmorItem(ArmorMaterialInit.STEEL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(34))
                    .maxCount(1)));
    public static final ArmorItem STEEL_BOOTS = register( "steel_boots",
            new ArmorItem(ArmorMaterialInit.STEEL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(34))
                    .maxCount(1)));

    public static final ArmorItem REINFORCED_STEEL_HELMET = register( "reinforced_steel_helmet",
            new ArmorItem(ArmorMaterialInit.REINFORCED_STEEL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(69))
                    .maxCount(1)));
    public static final ArmorItem REINFORCED_STEEL_CHESTPLATE = register( "reinforced_steel_chestplate",
            new ArmorItem(ArmorMaterialInit.REINFORCED_STEEL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(69))
                    .maxCount(1)));
    public static final ArmorItem REINFORCED_STEEL_LEGGINGS = register( "reinforced_steel_leggings",
            new ArmorItem(ArmorMaterialInit.REINFORCED_STEEL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(69))
                    .maxCount(1)));
    public static final ArmorItem REINFORCED_STEEL_BOOTS = register( "reinforced_steel_boots",
            new ArmorItem(ArmorMaterialInit.REINFORCED_STEEL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(69))
                    .maxCount(1)));

    // Init for tools
    public static final SwordItem STEEL_SWORD = register("steel_sword",
            new SwordItem(ToolMaterials.STEEL, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.STEEL, 3,-2.4f ))));

    public static final PickaxeItem STEEL_PICKAXE = register("steel_pickaxe",
            new PickaxeItem(ToolMaterials.STEEL, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.STEEL, 3,-2.4f ))));

    public static final AxeItem STEEL_AXE = register("steel_axe",
            new AxeItem(ToolMaterials.STEEL, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.STEEL, 3,-2.4f ))));

    public static final ShovelItem STEEL_SHOVEL = register("steel_shovel",
            new ShovelItem(ToolMaterials.STEEL, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.STEEL, 3,-2.4f ))));

    public static final HoeItem STEEL_HOE = register("steel_hoe",
            new HoeItem(ToolMaterials.STEEL, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.STEEL, 3,-2.4f ))));



    public static final SwordItem REINFORCED_STEEL_SWORD = register("reinforced_steel_sword",
            new SwordItem(ToolMaterials.REINFORCED_STEEL, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.REINFORCED_STEEL, 6,-1.4f ))));

    public static final PickaxeItem REINFORCED_STEEL_PICKAXE = register("reinforced_steel_pickaxe",
            new PickaxeItem(ToolMaterials.REINFORCED_STEEL, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.REINFORCED_STEEL, 6,-1.4f ))));

    public static final AxeItem REINFORCED_STEEL_AXE = register("reinforced_steel_axe",
            new AxeItem(ToolMaterials.REINFORCED_STEEL, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.REINFORCED_STEEL, 6,-1.4f ))));

    public static final ShovelItem REINFORCED_STEEL_SHOVEL = register("reinforced_steel_shovel",
            new ShovelItem(ToolMaterials.REINFORCED_STEEL, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.REINFORCED_STEEL, 6,-1.4f ))));

    public static final HoeItem REINFORCED_STEEL_HOE = register("reinforced_steel_hoe",
            new HoeItem(ToolMaterials.REINFORCED_STEEL, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.REINFORCED_STEEL, 6,-1.4f ))));

    // Register method
    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, SteelToolsAndArmor.id(name), item);
    }

    // Load method (to be called in your main mod class)
    public static void load() {
    }
}
