package com.mclegoman.releasetypeutils.common;

import com.mclegoman.releasetypeutils.common.data.Data;
import com.mclegoman.releasetypeutils.common.util.Translation;
import com.mclegoman.releasetypeutils.common.version.Helper;

public class RTU {
    public static void main(String[] args) {
        init();
    }
    public static void init() {
        try {
            Data.RTU_VERSION.sendToLog(Helper.LogType.INFO, Translation.setString("Initializing {}.", Data.RTU_VERSION.getID()));
            development();
        } catch (Exception error) {
            Data.RTU_VERSION.sendToLog(Helper.LogType.ERROR, Translation.setString("Failed to initialize {}: {}.", Data.RTU_VERSION.getID(), error));
        }
    }
    public static void development() {
        try {
            if (Data.RTU_VERSION.isDevelopmentBuild()) {
                Data.RTU_VERSION.sendToLog(Helper.LogType.INFO, Translation.setString("You are running a development build of {}. You may experience some unexpected bugs.", Data.RTU_VERSION.getName()));
            }
        } catch (Exception error) {
            Data.RTU_VERSION.sendToLog(Helper.LogType.ERROR, Translation.setString("Failed to initialize {}>development: {}.", Data.RTU_VERSION.getID(), error));
        }
    }
}