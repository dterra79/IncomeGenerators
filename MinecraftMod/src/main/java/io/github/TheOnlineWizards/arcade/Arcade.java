package io.github.TheOnlineWizards.arcade;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
@Mod(Arcade.MODID)
public class Arcade {
	
	public static final String MODID = "arcade";
	
	public Arcade() {
		var bus = FMLJavaModLoadingContext.get().getModEventBus();
		
	}

}
