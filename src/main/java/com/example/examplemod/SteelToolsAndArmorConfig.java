package com.example.examplemod;

import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.ModConfigSpec;

// Basic configuration class for the Steel Tools and Armor Mod
@EventBusSubscriber(modid = SteelToolsAndArmorMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class SteelToolsAndArmorConfig {

    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    static final ModConfigSpec SPEC = BUILDER.build();

    // Add basic configuration options here as needed

}
