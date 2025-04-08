package com.lostoflight.shadowslave;

import com.lostoflight.shadowslave.item.ModItems;
import net.fabricmc.api.ModInitializer;

//Esta es la clase principal del mod
public class ShadowSlave implements ModInitializer {
	public static final String MOD_ID = "shadowslave";

	//public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.initialize();
	}
}