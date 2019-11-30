package benjorama.testmod.testblocks;

import benjorama.testmod.TestMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TestMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(TestMod.MODID)
public class TestBlocks {
	public static final Block test_block = null;
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
				new Block(Block.Properties.create(Material.IRON)
						.hardnessAndResistance(5)
						.harvestLevel(2)
						.harvestTool(ToolType.PICKAXE))
				.setRegistryName(TestMod.MODID, "test_block")
		);
	}
}
