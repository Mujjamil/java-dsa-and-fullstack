package com.javabyvishalsir.filemanagementystem;

public class MediaFile extends File{

    private String format;
    private double duration;

    public MediaFile(String fileName, double fileSize, String filePath , String format , double duration) {
        super(fileName, fileSize, filePath);
        this.format = format;
        this.duration = duration;
    }

    public void play(){
        System.out.println("Playing..."+getFileName()+".........");
    }

    public String getFormat(){
        return format;
    }
    public double getDuration(){
        return duration;
    }


}
