package com.github.benjorama.testmod.init;

import java.util.function.Supplier;
import com.github.benjorama.testmod.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups{
	public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(
			TestMod.MODID, () -> new ItemStack(ModItems.EXAMPLE_ITEM));
	
	public static class ModItemGroup extends ItemGroup {
		private final Supplier<ItemStack> iconSupplier;
		
		public ModItemGroup(final String name, 
				final Supplier<ItemStack> iconSupplier) {
			super(name);
			this.iconSupplier = iconSupplier;
		}
		
		@Override
		public ItemStack createIcon() {
			// TODO Auto-generated method stub
			return iconSupplier.get();
		}
	}
}
