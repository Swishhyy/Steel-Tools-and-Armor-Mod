package steel.tools.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import steel.tools.SteelToolsAndArmor;

import java.util.Optional;

public class ItemGroupInit {

    // Fixed the case to match language file key
    public static final Text STEEL_TOOLS_TITLE = Text.translatable("itemGroup." + SteelToolsAndArmor.MOD_ID + ".steel_tools_group");

    public static final ItemGroup STEEL_TOOLS_GROUP = register("steel_tools_group", FabricItemGroup.builder()
            .displayName(STEEL_TOOLS_TITLE)
            .icon(ItemInit.STEEL_INGOT::getDefaultStack)
            .entries((displayContext, entries) -> Registries.ITEM.getIds()
                    .stream()
                    .filter(key -> key.getNamespace().equals(SteelToolsAndArmor.MOD_ID))
                    .map(Registries.ITEM::getOrEmpty)
                    .map(Optional::orElseThrow)
                    .forEach(entries::add))
            .build());

    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, SteelToolsAndArmor.id(name), itemGroup);
    }

    public static void load() {
        // Register Item Groups (ensure it's called)
    }
}
