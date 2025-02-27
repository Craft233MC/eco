package com.willfp.eco.internal.scheduling

import com.tcoded.folialib.wrapper.task.WrappedFoliaTask
import com.tcoded.folialib.wrapper.task.WrappedTask
import com.willfp.eco.core.EcoPlugin
import com.willfp.eco.core.scheduling.Scheduler
import org.bukkit.Bukkit

class EcoScheduler(private val plugin: EcoPlugin) : Scheduler {
    override fun runLater(
        runnable: Runnable,
        ticksLater: Long
    ): WrappedTask {
        return this.plugin.scheduler.runLater( runnable, ticksLater)
    }

    override fun runTimer(
        runnable: Runnable,
        delay: Long,
        repeat: Long
    ): WrappedTask {
        return this.plugin.scheduler.runTimer(runnable, delay, repeat)
    }

    override fun runAsyncTimer(
        runnable: Runnable,
        delay: Long,
        repeat: Long
    ): WrappedTask {
        return this.plugin.scheduler.runTimerAsync(runnable, delay, repeat)
    }

    override fun run(runnable: Runnable): WrappedTask {
        return this.plugin.scheduler.runLater(runnable, 1)
    }

    override fun runAsync(runnable: Runnable): WrappedTask {
        return this.plugin.scheduler.runLaterAsync(runnable, 1)
    }

    override fun syncRepeating(
        runnable: Runnable,
        delay: Long,
        repeat: Long
    ): WrappedTask {
        return this.plugin.scheduler.runTimer( runnable, delay, repeat)
    }

    override fun cancelAll() {
        this.plugin.scheduler.cancelAllTasks()
    }
}