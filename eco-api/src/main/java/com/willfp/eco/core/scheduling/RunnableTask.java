package com.willfp.eco.core.scheduling;

import com.tcoded.folialib.wrapper.task.WrappedTask;
import org.jetbrains.annotations.NotNull;

/**
 * Bukkit Task handler.
 */
public interface RunnableTask extends Runnable {
    /**
     * Run the task.
     *
     * @return The created {@link WrappedTask}.
     */
    @NotNull WrappedTask runTask();

    /**
     * Run the task asynchronously.
     *
     * @return The created {@link WrappedTask}
     */
    @NotNull WrappedTask runTaskAsynchronously();

    /**
     * Run the task after a specified number of ticks.
     *
     * @param delay The number of ticks to wait.
     * @return The created {@link WrappedTask}
     */
    @NotNull WrappedTask runTaskLater(long delay);

    /**
     * Run the task asynchronously after a specified number of ticks.
     *
     * @param delay The number of ticks to wait.
     * @return The created {@link WrappedTask}
     */
    @NotNull WrappedTask runTaskLaterAsynchronously(long delay);

    /**
     * Run the task repeatedly on a timer.
     *
     * @param delay  The delay before the task is first ran (in ticks).
     * @param period The ticks elapsed before the task is ran again.
     * @return The created {@link WrappedTask}
     */
    @NotNull WrappedTask runTaskTimer(long delay, long period);

    /**
     * Run the task repeatedly on a timer asynchronously.
     *
     * @param delay  The delay before the task is first ran (in ticks).
     * @param period The ticks elapsed before the task is ran again.
     * @return The created {@link WrappedTask}
     */
    @NotNull WrappedTask runTaskTimerAsynchronously(long delay, long period);

    /**
     * Cancel the task.
     */
    void cancel();
}
