package ru.kurasava.bas

import org.bukkit.entity.ArmorStand
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockRedstoneEvent
import org.bukkit.event.player.PlayerInteractAtEntityEvent
import ru.kurasava.bas.Utils.applyPose
import ru.kurasava.bas.Utils.getPoseIndex

object ArmorStandListener : Listener {

    @EventHandler(ignoreCancelled = true, priority = EventPriority.LOW)
    fun rightClickChangePose(event: PlayerInteractAtEntityEvent) {
        val armorStand = event.rightClicked as? ArmorStand ?: return
        val player = event.player

        if (!player.inventory.itemInMainHand.type.isAir && !player.isSneaking) return
//        if (Main.instance.AS_FLAG != null) {
//            val regionManager = WorldGuard.getInstance().platform.regionContainer
//            val query = regionManager.createQuery()
//            val set = query.getApplicableRegions(BukkitAdapter.adapt(armorStand.location))
//            val localPlayer = WorldGuardPlugin.inst().wrapPlayer(player)
//            if (!set.testState(localPlayer, Main.instance.AS_FLAG)) {
//                event.isCancelled = true
//                return
//            }
//        }
        armorStand.applyPose(armorStand.getPoseIndex() + 1)
    }

    @EventHandler(ignoreCancelled = true)
    fun redstoneChangePose(event: BlockRedstoneEvent) {
        val block = event.block
        val location = block.location
        block.world.getNearbyEntities(location, 1.5, 0.5, 1.5).filterIsInstance<ArmorStand>().forEach { armorStand ->
            armorStand.applyPose(event.newCurrent)
        }
    }
}