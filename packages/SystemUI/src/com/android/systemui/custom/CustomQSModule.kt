package com.android.systemui.custom

import com.android.systemui.qs.tileimpl.QSTileImpl
import com.android.systemui.qs.tiles.PowerShareTile
import com.android.systemui.qs.tiles.RefreshRateTile


import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
interface CustomQSModule {
    /** Inject PowerShareTile into tileMap in QSModule */
    @Binds
    @IntoMap
    @StringKey(PowerShareTile.TILE_SPEC)
    fun bindPowerShareTile(powerShareTile: PowerShareTile): QSTileImpl<*>

    /** Inject RefreshRateTile into tileMap in QSModule */
    @Binds
    @IntoMap
    @StringKey(RefreshRateTile.TILE_SPEC)
    fun bindRefreshRateTile(refreshRateTile: RefreshRateTile): QSTileImpl<*>
    
}
