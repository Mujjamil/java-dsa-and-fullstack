package com.javabyvishalsir.filemanagementystem;

public class WordFile extends File implements Readable{

    private int wordcount;
    private int currentPosition;
    public WordFile(String fileName, double fileSize, String filePath , int wordcount , int currentPosition) {
        super(fileName, fileSize, filePath);
        this.currentPosition = currentPosition;
        this.wordcount = wordcount;
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
