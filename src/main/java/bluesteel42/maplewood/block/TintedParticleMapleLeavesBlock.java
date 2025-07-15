package bluesteel42.maplewood.block;

import bluesteel42.maplewood.MapleWood;
import bluesteel42.maplewood.particle.ModParticles;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.particle.EntityEffectParticleEffect;
import net.minecraft.particle.ParticleUtil;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class TintedParticleMapleLeavesBlock extends LeavesBlock {
    public static final MapCodec<TintedParticleMapleLeavesBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(
                            Codecs.rangedInclusiveFloat(0.0F, 1.0F)
                                    .fieldOf("leaf_particle_chance")
                                    .forGetter(tintedParticleLeavesBlock -> tintedParticleLeavesBlock.leafParticleChance),
                            createSettingsCodec()
                    )
                    .apply(instance, TintedParticleMapleLeavesBlock::new)
    );

    public TintedParticleMapleLeavesBlock(float f, AbstractBlock.Settings settings) {
        super(f, settings);
    }

    @Override
    protected void spawnLeafParticle(World world, BlockPos pos, Random random) {
        EntityEffectParticleEffect entityEffectParticleEffect = EntityEffectParticleEffect.create(ModParticles.GREEN_MAPLE_LEAVES, world.getBlockColor(pos));
        MapleWood.LOGGER.info("SPAWN");
        ParticleUtil.spawnParticle(world, pos, random, entityEffectParticleEffect);
    }

    @Override
    public MapCodec<? extends TintedParticleMapleLeavesBlock> getCodec() {
        return CODEC;
    }
}
