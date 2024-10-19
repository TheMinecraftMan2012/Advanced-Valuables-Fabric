package net.theminecraftman.advancedvaluables;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.theminecraftman.advancedvaluables.AV_CMT.AdvancedValuables_CreativeModeTabs;
import net.theminecraftman.advancedvaluables.AV_Libraries.Events.HammerUsageEvents;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_BlockClass;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_ItemClass;
import net.theminecraftman.advancedvaluables.AV_WorldGen.gen.AdvancedValuables_WorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdvancedValuables implements ModInitializer
{
	public static final String MOD_ID = "advancedvaluables";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		AdvancedValuables_CreativeModeTabs.registerCreativeModeTabs();

		AdvancedValuables_WorldGeneration.generateWorldGeneration();

		AdvancedValuables_ItemClass.registerModItems();
		AdvancedValuables_BlockClass.registerModBlocks();

		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvents());
	}
}