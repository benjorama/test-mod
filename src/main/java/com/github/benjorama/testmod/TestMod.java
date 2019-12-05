package com.github.benjorama.testmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod;

@Mod(TestMod.MODID)
public class TestMod {
	public static final String MODID = "testmod";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	public TestMod() {
		LOGGER.debug("Hello from testmod!");
	}
}