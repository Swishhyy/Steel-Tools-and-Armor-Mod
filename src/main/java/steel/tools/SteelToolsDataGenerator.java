package steel.tools;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import steel.tools.data.provider.*;

public class SteelToolsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(SteelToolsAndArmorModelProvider::new);
		pack.addProvider(SteelToolsAndArmorENProvider::new);
		pack.addProvider(SteelToolsAndArmorBlockTagProvider::new);
		pack.addProvider(SteelToolsAndArmorRecipeProvider::new);
		pack.addProvider(SteelToolsAndArmorItemTagProvider::new);
	}
}
