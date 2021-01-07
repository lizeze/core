package com.leadingsoft.core.util;

public class FileUtil {

    /**
     * 获取文件后缀名
     *
     * @param fileName
     * @return
     */
    public static String getSuffix(String fileName) {
        if (StringUtil.isEmptyOrNull(fileName)) return "";
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
        return suffix;
    }

}
