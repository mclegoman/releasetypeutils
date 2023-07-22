package com.mclegoman.releasetypeutils.common.releasetype;

public class RTUReleaseType {
    public static boolean isDevelopmentBuild(RTUReleaseTypes releaseType) {
        return !releaseType.equals(RTUReleaseTypes.RELEASE);
    }
    public static String releaseTypeString(RTUReleaseTypes releaseType, RTUReleaseTranslationTypes translationType) {
        if (releaseType.equals(RTUReleaseTypes.ALPHA)) {
            if (translationType.equals(RTUReleaseTranslationTypes.NORMAL)) return RTUReleaseTypeTranslations.NORMAL_ALPHA;
            else if (translationType.equals(RTUReleaseTranslationTypes.SENTENCED)) return RTUReleaseTypeTranslations.SENTENCED_ALPHA;
            else if (translationType.equals(RTUReleaseTranslationTypes.CODE)) return RTUReleaseTypeTranslations.CODE_ALPHA;
        } else if (releaseType.equals(RTUReleaseTypes.BETA)) {
            if (translationType.equals(RTUReleaseTranslationTypes.NORMAL)) return RTUReleaseTypeTranslations.NORMAL_BETA;
            else if (translationType.equals(RTUReleaseTranslationTypes.SENTENCED)) return RTUReleaseTypeTranslations.SENTENCED_BETA;
            else if (translationType.equals(RTUReleaseTranslationTypes.CODE)) return RTUReleaseTypeTranslations.CODE_BETA;
        } else if (releaseType.equals(RTUReleaseTypes.RELEASE_CANDIDATE)) {
            if (translationType.equals(RTUReleaseTranslationTypes.NORMAL)) return RTUReleaseTypeTranslations.NORMAL_RELEASE_CANDIDATE;
            else if (translationType.equals(RTUReleaseTranslationTypes.SENTENCED)) return RTUReleaseTypeTranslations.SENTENCED_RELEASE_CANDIDATE;
            else if (translationType.equals(RTUReleaseTranslationTypes.CODE)) return RTUReleaseTypeTranslations.CODE_RELEASE_CANDIDATE;
        } else if (releaseType.equals(RTUReleaseTypes.RELEASE)) {
            if (translationType.equals(RTUReleaseTranslationTypes.NORMAL)) return RTUReleaseTypeTranslations.NORMAL_RELEASE;
            else if (translationType.equals(RTUReleaseTranslationTypes.SENTENCED)) return RTUReleaseTypeTranslations.SENTENCED_RELEASE;
            else if (translationType.equals(RTUReleaseTranslationTypes.CODE)) return RTUReleaseTypeTranslations.CODE_RELEASE;
        }
        return "UNKNOWN";
    }
}
