package com.willfp.eco.core.entities.ai.entity;

import com.willfp.eco.core.entities.ai.EntityGoal;
import org.bukkit.entity.Mob;

/**
 * Allows an entity to break down doors.
 *
 * @param maxProgress The time taken to break the door (any integer above 240).
 */
public record EntityGoalBreakDoor(
        int maxProgress
) implements EntityGoal<Mob> {

}
