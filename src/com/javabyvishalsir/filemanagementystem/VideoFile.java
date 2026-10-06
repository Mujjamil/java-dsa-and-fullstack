package com.javabyvishalsir.filemanagementystem;

public class VideoFile extends MediaFile{
    private String resolution;

    public VideoFile(String fileName, double fileSize, String filePath, String format, double duration, String resolution) {
        super(fileName, fileSize, filePath, format, duration);
        this.resolution = resolution;
    }

    @Override
    public void play() {
        System.out.println("Plyaing video in"+resolution+"-"+getFileName());
    }
}
