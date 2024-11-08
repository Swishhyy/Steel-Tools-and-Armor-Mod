package steel.tools.init;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import steel.tools.SteelToolsAndArmor;
import steel.tools.block.custom.FoundryBlock;
import steel.tools.block.custom.RefineryBlock;

public class BlockInit {

    // Register steel block with item
    public static final Block STEEL_BLOCK = registerWithItem("steel_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(10.0f, 600.0f)  // Hardness of 10, Resistance of 600
                    .requiresTool()            // Requires a tool to be mined
                    .sounds(BlockSoundGroup.METAL))); // Use metal block sounds

    public static final Block FOUNDRY = registerWithItem("foundry",
            new FoundryBlock(AbstractBlock.Settings.create()
                    .strength(7.0f, 150.0f)  // Hardness of 10, Resistance of 600
                    .requiresTool()            // Requires a tool to be mined
                    .sounds(BlockSoundGroup.METAL))); // Use metal block sounds

    public static final Block REFINERY = registerWithItem("refinery",
            new RefineryBlock(AbstractBlock.Settings.create()
                    .strength(7.0f, 150.0f)  // Hardness of 10, Resistance of 600
                    .requiresTool()            // Requires a tool to be mined
                    .sounds(BlockSoundGroup.METAL))); // Use metal block sounds

    public static final Block REINFORCED_STEEL_BLOCK = registerWithItem("reinforced_steel_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(20.0f, 1000.0f)  // Hardness of 10, Resistance of 600
                    .requiresTool()            // Requires a tool to be mined
                    .sounds(BlockSoundGroup.METAL))); // Use metal block sounds


    public static final Block COMPACTED_COAL_BLOCK = registerWithItem("compacted_coal_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(5.0f, 3.0f)
                    .requiresTool()            // Requires a tool to be mined
                    .sounds(BlockSoundGroup.STONE)));
    static {  // Static block to register fuel immediately after initialization
        FuelRegistry.INSTANCE.add(COMPACTED_COAL_BLOCK, 28800); //Compacted Coal x 3 = compacted coal block burn time
    }
    public static final Block SUPER_COMPACTED_COAL_BLOCK = registerWithItem("super_compacted_coal_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(7.0f, 6.0f)
                    .requiresTool()            // Requires a tool to be mined
                    .sounds(BlockSoundGroup.STONE)));
    static {  // Static block to register fuel immediately after initialization
        FuelRegistry.INSTANCE.add(SUPER_COMPACTED_COAL_BLOCK, 57600); //super Compacted Coal x 3 = super compacted coal block burn time
    }
    // Register the block itself
    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, SteelToolsAndArmor.id(name), block);
    }

    // Register the block with an item (for inventory)
    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        // Register the block item form (for inventory, hand use)
        ItemInit.register(name, new BlockItem(registered, settings));
        return registered;
    }

    // Default block item registration with default settings
    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }

    // Method to call when registering all blocks
    public static void load() {
        // This ensures that static blocks like STEEL_BLOCK are loaded and registered
    }
}
