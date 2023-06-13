package com.mclegoman.releasetypeutils;

import com.mclegoman.releasetypeutils.data.RTUData;
import net.fabricmc.api.ModInitializer;

public class RTUMain implements ModInitializer {
    @Override
    public void onInitialize() {
        RTUData.LOGGER.info(RTUData.PREFIX + "Initializing ReleaseTypeUtils");
    }
}
