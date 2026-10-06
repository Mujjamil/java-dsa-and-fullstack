package com.javabyvishalsir.filemanagementystem;

public class AudioFile extends MediaFile{
    private String artist;
    private String album;

    public AudioFile(String fileName, double fileSize, String filePath, String format, double duration, String artist , String album) {
        super(fileName, fileSize, filePath, format, duration);
        this.artist = artist;
        this.album = album;
    }

    @Override
    public void play() {
        System.out.println("Playing audio:"+artist+"-"+getFileName());
    }
}
