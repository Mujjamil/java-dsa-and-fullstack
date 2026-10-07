package com.javabyvishalsir.filemanagementystem;

public class TextFile extends File implements Readable {
    private String encoding;
    private int currentPosition;
    public TextFile(String fileName, double fileSize, String filePath,
                    String encoding) {
        super(fileName, fileSize, filePath);
        this.encoding = encoding;
        this.currentPosition = 0;
    }

    @Override
    public void read() {
        System.out.println("Reading file: " + getFileName());
    }

    @Override
    public void setMarks(int position) {
        currentPosition = position;
        System.out.println("Mark set at position: " + currentPosition);
    }

    @Override
    public void resetMarks() {
        currentPosition = 0;
        System.out.println("Position reset to 0");
    }




}
