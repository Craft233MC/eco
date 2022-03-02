package com.willfp.eco.core.entities.ai.entity;

import com.willfp.eco.core.entities.ai.EntityGoal;
import org.bukkit.entity.Mob;

/**
 * Allows an entity to interact and open a door.
 *
 * @param delayedClose If closing the door should be delayed.
 */
public record EntityGoalOpenDoors(
        boolean delayedClose
) implements EntityGoal<Mob> {

}
