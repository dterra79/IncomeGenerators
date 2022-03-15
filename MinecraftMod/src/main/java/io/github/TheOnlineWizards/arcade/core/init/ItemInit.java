package io.github.TheOnlineWizards.arcade.core.init;

import io.github.TheOnlineWizards.arcade.Arcade;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

 //Block Item
public final class ItemInit{
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create( ForgeRegistries.ITEMS, Arcade.MODID );
	
	public static final RegistryObject<BlockItem> arcadeBlock = ITEMS.register("Arcade_Item",
			() -> new BlockItem( Machine1Init.ARCADE_MACHINE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)) );	
}
