package com.javabyvishalsir.filemanagementystem;

public class ImagePath extends MediaFile{
        private String dimentions;
    public ImagePath(String fileName, double fileSize, String filePath, String format, double duration, String dimentions) {
        super(fileName, fileSize, filePath, format, duration);
        this.dimentions = dimentions;
    }

    @Override
    public void play() {
        System.out.println("Displaying the image"+dimentions);
    }
}
