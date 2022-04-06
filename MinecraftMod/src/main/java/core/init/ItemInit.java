package core.init;

import com.io.arcademod.ArcadeMod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ItemInit {
	
	private ItemInit() {}

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create( ForgeRegistries.ITEMS, ArcadeMod.MODID);
	
	public static final RegistryObject<Item> ARCADE_ITEM = ITEMS.register("token", 
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)) );
	
	//Block Items
	public static final RegistryObject<BlockItem> TEST_BLOCK_ITEM = ITEMS.register("testblock", 
			() -> new BlockItem( BlockInit.pacblock.get() , new Item.Properties().tab(CreativeModeTab.TAB_MISC))); 
	
	public static final RegistryObject<BlockItem> PAC_BLOCK_ITEM = ITEMS.register("pacblock", 
			() -> new BlockItem( BlockInit.pacblock.get() , new Item.Properties().tab(CreativeModeTab.TAB_MISC))); 
	
	public static final RegistryObject<BlockItem> SNAKE_BLOCK_ITEM = ITEMS.register("snakeblock", 
			() -> new BlockItem( BlockInit.snakeblock.get() , new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
