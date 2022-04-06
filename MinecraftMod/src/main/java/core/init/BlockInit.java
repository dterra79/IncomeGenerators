package core.init;

import com.io.arcademod.ArcadeMod;
import com.io.arcademod.common.block.ArcadeBlock;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class BlockInit {

	private BlockInit() {}
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ArcadeMod.MODID);
	
	public static final RegistryObject<Block> testblock = BLOCKS.register("testblock" , 
			() -> new Block( BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.DIRT).strength(1.0f, 1.0f) ) );
	
	public static final RegistryObject<ArcadeBlock> pacblock = BLOCKS.register("pacblock" , 
			() -> new ArcadeBlock (BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.DIRT).strength(1.0f, 1.0f))
			/**/);
	
	public static final RegistryObject<ArcadeBlock> snakeblock = BLOCKS.register("snakeblock" , 
			() -> new ArcadeBlock (BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.DIRT).strength(1.0f, 1.0f))
			/**/);
}
