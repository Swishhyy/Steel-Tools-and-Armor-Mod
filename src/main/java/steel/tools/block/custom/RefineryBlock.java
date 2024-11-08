package steel.tools.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class RefineryBlock extends BlockWithEntity implements BlockEntityProvider {
    private static final VoxelShape SHAPE = RefineryBlock.createCuboidShape(
            0, 0, 0, 16, 16,16);

    public RefineryBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return null;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state,
                                      BlockView world,
                                      BlockPos pos,
                                      ShapeContext context)
    {
        return SHAPE;
    }

    public <Blockbuster> BlockRenderType getRenderType(Blockbuster state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return null;
    }


}
