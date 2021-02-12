package com.zionhuang.music.extensions

import android.widget.ImageView
import com.zionhuang.music.utils.GlideApp
import com.zionhuang.music.utils.GlideRequest
import java.io.File

fun ImageView.load(url: String?, applier: (GlideRequest<*>.() -> Unit)? = null) {
    GlideApp.with(this)
            .load(url)
            .apply { applier?.invoke(this) }
            .into(this)
}

fun ImageView.load(file: File?, applier: (GlideRequest<*>.() -> Unit)? = null) {
    GlideApp.with(this)
            .load(file)
            .apply { applier?.invoke(this) }
            .into(this)
}
