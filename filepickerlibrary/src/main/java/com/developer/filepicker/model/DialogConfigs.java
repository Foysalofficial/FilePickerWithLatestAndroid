package com.developer.filepicker.model;


public abstract class DialogConfigs {

    public static final int SINGLE_MODE = 0;
    public static final int MULTI_MODE = 1;
    public static final int FILE_SELECT = 0;
    public static final int DIR_SELECT = 1;
    public static final int FILE_AND_DIR_SELECT = 2;

    
    private static final String DIRECTORY_SEPARATOR = "/";
    private static final String STORAGE_DIR = "sdcard";

    
    public static final String DEFAULT_DIR = DIRECTORY_SEPARATOR + STORAGE_DIR;
}