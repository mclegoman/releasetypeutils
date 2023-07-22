package com.mclegoman.releasetypeutils.common.data;

import com.mclegoman.releasetypeutils.common.releasetype.RTUReleaseTranslationTypes;
import com.mclegoman.releasetypeutils.common.releasetype.RTUReleaseType;
import com.mclegoman.releasetypeutils.common.releasetype.RTUReleaseTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RTUData {
    public static final String ID;
    public static final String NAME;
    public static final Integer MAJOR_VERSION;
    public static final Integer MINOR_VERSION;
    public static final Integer PATCH_VERSION;
    public static final RTUReleaseTypes RELEASE_TYPE;
    public static final Integer BUILD_VERSION;
    public static final Boolean IS_DEVELOPMENT;
    public static final String VERSION;
    private static final String PREFIX;
    private static final Logger LOGGER;
    public static void sendToLog(String string, RTULogType logType) {
        if (logType.equals(RTULogType.INFO)) LOGGER.info(PREFIX + string);
        if (logType.equals(RTULogType.WARN)) LOGGER.warn(PREFIX + string);
        if (logType.equals(RTULogType.ERROR)) LOGGER.error(PREFIX + string);
        if (logType.equals(RTULogType.DEBUG)) LOGGER.debug(PREFIX + string);
    }
    public static String setString(String string, Object... variables) {
        String RETURN = string;
        for (Object variable : variables) RETURN = replaceFirst(RETURN, "{}", (String)variable);
        return RETURN;
    }
    public static String replaceFirst(String s, String pattern, String replacement) {
        int idx = s.indexOf(pattern);
        return s.substring(0, idx) + replacement + s.substring(idx + pattern.length());
    }
    static {
        ID = "releasetypeutils";
        NAME = "ReleaseTypeUtils";
        MAJOR_VERSION = 2;
        MINOR_VERSION = 0;
        PATCH_VERSION = 0;
        RELEASE_TYPE = RTUReleaseTypes.RELEASE;
        BUILD_VERSION = 1;
        IS_DEVELOPMENT = RTUReleaseType.isDevelopmentBuild(RELEASE_TYPE);
        VERSION = IS_DEVELOPMENT ? setString("{}.{}.{}-{}.{}", MAJOR_VERSION.toString(), MINOR_VERSION.toString(), PATCH_VERSION.toString(), RTUReleaseType.releaseTypeString(RELEASE_TYPE, RTUReleaseTranslationTypes.CODE), BUILD_VERSION.toString()) : setString("{}.{}.{}", MAJOR_VERSION.toString(), MINOR_VERSION.toString(), PATCH_VERSION.toString());
        PREFIX = setString("[{} {}] ", NAME, VERSION);
        LOGGER = LoggerFactory.getLogger(ID);
    }
}
