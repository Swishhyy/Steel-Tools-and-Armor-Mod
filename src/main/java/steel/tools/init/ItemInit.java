package steel.tools.init;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import steel.tools.SteelToolsAndArmor;
import steel.tools.list.FoodList;

public class ItemInit {

    // Init for crafting items
    public static final Item STEEL_INGOT = register("steel_ingot", new Item(new Item.Settings()));
    public static final Item LIQUID_IRON = register("liquid_iron", new Item(new Item.Settings()));

    // Init for Compacted Coal as a fuel type
    public static final Item COMPACTED_COAL = register("compacted_coal", new Item(new Item.Settings()));
    static {  // Static block to register fuel immediately after initialization
        FuelRegistry.INSTANCE.add(COMPACTED_COAL, 3200); // 3200 ticks = twice the burn time of coal
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


    // Register method
    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, SteelToolsAndArmor.id(name), item);
    }

    // Load method (to be called in your main mod class)
    public static void load() {
    }
}
