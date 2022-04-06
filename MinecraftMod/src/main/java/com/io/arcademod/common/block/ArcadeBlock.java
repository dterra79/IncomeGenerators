package com.io.arcademod.common.block;

import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;

import com.io.arcademod.ArcadeMod;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ArcadeBlock extends HorizontalDirectionalBlock {
	
	private static final Map<Direction, VoxelShape> SHAPES = new EnumMap<>(Direction.class);
	
	public ArcadeBlock(Properties properties) 
	{
		super(properties);
		registerDefaultState( this.defaultBlockState().setValue(FACING, Direction.NORTH) );
		runCalculation(SHAPE.orElse(Shapes.block()));
	}
	
	
	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		// TODO Auto-generated method stub
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}
	
	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}
	
	private static final Optional<VoxelShape> SHAPE = Optional.of(Block.box(0, 0, 0, 16, 32, 16));

	
	protected void runCalculation(VoxelShape shape) {
		for (Direction direction : Direction.values())
			SHAPES.put(direction, ArcadeMod.calculateShapes(direction, shape));
	}	
	
	@Override
	public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos,
			CollisionContext context) {
		return SHAPES.get(state.getValue(FACING) );
	}
	
	@Override
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player,
			InteractionHand hand, BlockHitResult result) {
		// TODO Auto-generated method stub
		if(!level.isClientSide){
			for(int i = 0; i < 21; i ++) {
				
				Pig pig = EntityType.PIG.create(level);
				pig.setPos(pos.getX(), pos.getY() + 5, pos.getZ()+1);
				level.addFreshEntity(pig);
				
			}//end for
				return InteractionResult.SUCCESS;
		}//end if
			
		else{
			
			level.playSound(player, pos, SoundEvents.PIG_DEATH, SoundSource.PLAYERS, 1.0f, 1.0f);
			return InteractionResult.FAIL;
			
		}
		
	}//end use
	
}
