package benjorama.testmod.testitems;
 
import benjorama.testmod.TestMod;
import benjorama.testmod.testblocks.TestBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TestMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(TestMod.MODID)
public class TestItems {
	public static final Item test_item = null;
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				new Item(
						new Item.Properties().group(ItemGroup.COMBAT))
				.setRegistryName(TestMod.MODID, "test_item"),
				
				new BlockItem(
						TestBlocks.test_block, new Item.Properties()
						.group(ItemGroup.BUILDING_BLOCKS))
				.setRegistryName(TestBlocks.test_block.getRegistryName())
		);
	}
}