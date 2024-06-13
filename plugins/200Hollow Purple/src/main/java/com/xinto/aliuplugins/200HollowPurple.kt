package com.xinto.aliuplugins

import android.content.Context
import com.aliucord.annotations.AliucordPlugin
import com.aliucord.api.CommandsAPI.CommandResult
import com.aliucord.entities.Plugin

@AliucordPlugin
class 200HollowPurple : Plugin() {

    override fun start(context: Context) {
        commands.registerCommand(
            "200HollowPurple",
            "Nine Ropes, Polarized Light, Crow and Declaration Between front and Back!"
        ) {
            CommandResult(speech)
        }
    }

    override fun stop(context: Context) {
        commands.unregisterAll()
    }

    companion object {
        private const val speech = """Nine Ropes, Polarized Light, Crow and Declaration Between front and Back, Hollow Purple. 🫸🔵🔴🫷🫴🟣 """
    }
}