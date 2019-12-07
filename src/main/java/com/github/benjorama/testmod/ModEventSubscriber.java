package com.github.benjorama.testmod;

import com.github.benjorama.testmod.init.ModItemGroups;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistryEntry;

@EventBusSubscriber(modid = TestMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {
	
	@SubscribeEvent
	public static void onRegisterItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				setup(new Item(new Item.Properties().group(
						ModItemGroups.MOD_ITEM_GROUP))
						, "example_item"));
	}
	
	@SubscribeEvent
	public static void onRegisterBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
				setup(new Block(Block.Properties.create(
						Material.ROCK).hardnessAndResistance(3.0F, 3.0F))
						, "example_block"));
	}

	public static <T extends IForgeRegistryEntry<T>> T setup(
			final T entry, final String name) {
		entry.setRegistryName(new ResourceLocation(TestMod.MODID, name));
		return entry;
	}
}
