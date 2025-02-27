package com.willfp.eco.internal.scheduling

import com.tcoded.folialib.wrapper.task.WrappedTask
import com.willfp.eco.core.EcoPlugin
import com.willfp.eco.core.scheduling.RunnableTask

abstract class EcoRunnableTask(protected val plugin: EcoPlugin) : WrappedTask, RunnableTask {
    @Synchronized
    override fun runTask(): WrappedTask {
        return this.plugin.scheduler.runLater(this, 1);
    }

    @Synchronized
    override fun runTaskAsynchronously(): WrappedTask {
        return this.plugin.scheduler.runLaterAsync(this, 1);
    }

    @Synchronized
    override fun runTaskLater(delay: Long): WrappedTask {
        return this.plugin.scheduler.runLater(this, delay);
    }

    @Synchronized
    override fun runTaskLaterAsynchronously(delay: Long): WrappedTask {
        return this.plugin.scheduler.runLaterAsync(this, delay);
    }

    @Synchronized
    override fun runTaskTimer(delay: Long, period: Long): WrappedTask {
        return this.plugin.scheduler.runTimer(this, delay, period);
    }

    @Synchronized
    override fun runTaskTimerAsynchronously(delay: Long, period: Long): WrappedTask {
        return this.plugin.scheduler.runTimerAsync(this, delay, period);
    }

    @Synchronized
    override fun cancel() {
        this.plugin.scheduler.cancelTask(this);
    }
}