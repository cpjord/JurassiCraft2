package net.timeless.jurassicraft.common.entity;

import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.timeless.jurassicraft.common.entity.base.EntityDinosaurAggressive;

public class EntitySegisaurus extends EntityDinosaurAggressive
{
    public EntitySegisaurus(World world)
    {
        super(world);

        this.attackCreature(EntityCompsognathus.class, 1);

        this.tasks.addTask(6, new EntityAIWander(this, dinosaur.getAdultSpeed()));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
    }
}