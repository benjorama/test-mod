package benjorama.testmod.moditems;
 
import benjorama.testmod.TestMod;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TestMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(TestMod.MODID)
public class ModItems {
	public static final Item test_item = null;
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				new Item(new Item.Properties()).setRegistryName(TestMod.MODID, "test_item")
		);
	}
}