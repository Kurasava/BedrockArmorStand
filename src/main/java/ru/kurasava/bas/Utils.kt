package ru.kurasava.bas

import org.bukkit.NamespacedKey
import org.bukkit.Sound
import org.bukkit.entity.ArmorStand
import org.bukkit.persistence.PersistentDataType

object Utils {


    private val POSE_INDEX = NamespacedKey(Main.instance, "PoseIndex")

    fun ArmorStand.getPoseIndex(): Int = this.persistentDataContainer.get(POSE_INDEX, PersistentDataType.INTEGER) ?: 0
    private fun ArmorStand.setPoseIndex(index: Int) = this.persistentDataContainer.set(POSE_INDEX, PersistentDataType.INTEGER, index)

    fun ArmorStand.applyPose(newPoseIndex: Int) {
        val index = newPoseIndex % ArmorStandPose.entries.size
        if (index >= ArmorStandPose.entries.size) return
        val pose = ArmorStandPose.entries[index]
        setArms(pose.hasArms)
        headPose = pose.head
        bodyPose = pose.body
        leftLegPose = pose.leftLeg
        rightLegPose = pose.rightLeg
        leftArmPose = pose.leftArm
        rightArmPose = pose.rightArm

        setPoseIndex(index)
        world.playSound(location, Sound.ENTITY_ARMOR_STAND_BREAK, 2.0f, 1.0f)
    }
}
