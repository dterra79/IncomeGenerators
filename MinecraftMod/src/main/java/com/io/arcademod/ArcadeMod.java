package com.io.arcademod;

import core.init.BlockInit;
import core.init.ItemInit;
import net.minecraft.core.Direction;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ArcadeMod.MODID)
public class ArcadeMod {
	public static final String MODID = "arcademod";
	
	public static VoxelShape calculateShapes(Direction to, VoxelShape shape) {
        final VoxelShape[] buffer = { shape, Shapes.empty() };

        final int times = (to.get2DDataValue() - Direction.NORTH.get2DDataValue() + 4) % 4;
        for (int i = 0; i < times; i++) {
            buffer[0].forAllBoxes((minX, minY, minZ, maxX, maxY, maxZ) -> buffer[1] = Shapes.or(buffer[1],
                    Shapes.create(1 - maxZ, minY, minX, 1 - minZ, maxY, maxX)));
            buffer[0] = buffer[1];
            buffer[1] = Shapes.empty();
        }

        return buffer[0];
    }
	
	public ArcadeMod() 
	{
		IEventBus ibus = FMLJavaModLoadingContext.get().getModEventBus();
		
		BlockInit.BLOCKS.register(ibus);
		ItemInit.ITEMS.register(ibus);
	}
	
	public static final CreativeModeTab ARCADE_TAB = new CreativeModeTab(MODID) {

        @Override 
        public ItemStack makeIcon( ) {
            return Items.CHORUS_PLANT.getDefaultInstance();

        }
    };
	
}
