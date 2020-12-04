package com.tamsiree.rxui.view.loadingview.style

import com.tamsiree.rxui.view.loadingview.sprite.Sprite
import com.tamsiree.rxui.view.loadingview.sprite.SpriteContainer

/**
 * @author tamsiree
 */
class MultiplePulseRing : SpriteContainer() {
    override fun onCreateChild(): Array<Sprite?>? {
        return arrayOf(
                PulseRing(),
                PulseRing(),
                PulseRing())
    }

    override fun onChildCreated(vararg sprites: Sprite?) {
        for (i in 0 until sprites.size) {
            sprites[i]?.setAnimationDelay(200 * (i + 1))
        }
    }
}