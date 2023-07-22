package com.mclegoman.releasetypeutils.common;

import com.mclegoman.releasetypeutils.common.data.RTUData;
import com.mclegoman.releasetypeutils.common.data.RTULogType;

public class RTUMain {
    public static void main(String[] args) {
        init();
    }
    public static void init() {
        try {
            RTUData.sendToLog(RTUData.setString("Initializing {}.", RTUData.ID), RTULogType.INFO);
            development();
        } catch (Exception error) {
            RTUData.sendToLog(RTUData.setString("Failed to initialize {}: {}.", RTUData.ID, error), RTULogType.ERROR);
        }
    }
    public static void development() {
        try {
            if (RTUData.IS_DEVELOPMENT) {
                RTUData.sendToLog(RTUData.setString("You are running a development build of {}. You may experience some unexpected bugs.", RTUData.NAME), RTULogType.INFO);
            }
        } catch (Exception error) {
            RTUData.sendToLog(RTUData.setString("Failed to initialize {}>development: {}.", RTUData.ID, error), RTULogType.ERROR);
        }
    }
}