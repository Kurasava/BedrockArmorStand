package ru.kurasava.bas

//import com.sk89q.worldguard.WorldGuard
//import com.sk89q.worldguard.protection.flags.StateFlag
//import com.sk89q.worldguard.protection.flags.registry.FlagConflictException
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import org.jetbrains.annotations.Contract

class Main : JavaPlugin() {

//    var AS_FLAG: StateFlag? = null

    override fun onEnable() {
        Bukkit.getServer().pluginManager.registerEvents(ArmorStandListener, this)
    }

//    override fun onLoad() {
//        super.onLoad()
//        flagRegistry()
//    }

    override fun onDisable() {
    }

//    private fun flagRegistry() {
//        val registry = WorldGuard.getInstance().flagRegistry
//        AS_FLAG = try{
//            val flag = StateFlag("armorstand-use", true)
//            registry.register(flag)
//            flag
//        } catch (e: FlagConflictException) {
//            val existing = registry.get("my-custom-flag")
//            existing as? StateFlag
//        }
//    }

    companion object {
        @get:Contract(pure = true)
        val instance: Main
            get() = getPlugin(Main::class.java)
    }
}