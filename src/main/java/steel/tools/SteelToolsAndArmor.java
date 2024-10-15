package steel.tools;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import steel.tools.init.ArmorMaterialInit;
import steel.tools.init.BlockInit;
import steel.tools.init.ItemGroupInit;
import steel.tools.init.ItemInit;

public class SteelToolsAndArmor implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger( "Steel Tools");
	public static final String MOD_ID = "steeltoolsandarmormod"; //sets a constant for my mod_id

	@Override
	public void onInitialize() {
		LOGGER.info("Loading...."); //sends a logger saying "Loading"

		//Loads Init Classes
		ItemInit.load();
		BlockInit.load();
		ItemGroupInit.load();
		ArmorMaterialInit.load();

		LOGGER.info("Loaded!"); //lets the user know the mod is loaded
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path.toLowerCase());
	}

}