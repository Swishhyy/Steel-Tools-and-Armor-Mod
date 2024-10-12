package steel.tools.list;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import steel.tools.SteelToolsAndArmor;

public class TagList {
    public static class Blocks {
        public static final TagKey<Block> STEEL_TAG =
                TagKey.of(RegistryKeys.BLOCK, SteelToolsAndArmor.id("steel"));

        public static final TagKey<Block> INCORRECT_FOR_STEEL_TOOL =
                TagKey.of(RegistryKeys.BLOCK, SteelToolsAndArmor.id("incorrect_for_steel_tool"));
    }
}

