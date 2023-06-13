package com.mclegoman.releasetypeutils.data;

import com.mclegoman.releasetypeutils.helper.RTUReleaseTypeHelper;
import com.mclegoman.releasetypeutils.util.RTUReleaseTypes;
import com.mclegoman.releasetypeutils.util.RTUTranslationTypes;
import com.mclegoman.releasetypeutils.util.RTUTranslations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RTUData {
    public static final String NAME = RTUTranslations.NAME;
    public static final Integer MAJOR_VERSION = 1;
    public static final Integer MINOR_VERSION = 0;
    public static final Integer PATCH_VERSION = 0;
    public static final RTUReleaseTypes RELEASE_TYPE = RTUReleaseTypes.RELEASE;
    public static final Integer BUILD_VERSION = 1;
    public static final Boolean IS_DEVELOPMENT = RTUReleaseTypeHelper.isDevelopment(RELEASE_TYPE);
    public static final String VERSION = MAJOR_VERSION + "." + MINOR_VERSION + "." + PATCH_VERSION + "." + RTUReleaseTypeHelper.getString(RELEASE_TYPE, RTUTranslationTypes.CODE) + "." + BUILD_VERSION;
    public static final String PREFIX = "[" + VERSION + "] ";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
}
