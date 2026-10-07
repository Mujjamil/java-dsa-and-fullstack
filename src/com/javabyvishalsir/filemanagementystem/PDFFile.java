package com.javabyvishalsir.filemanagementystem;

public class PDFFile extends File implements Readable{
    private boolean isEncrypted;
    private int currentPosition;
    public PDFFile(String fileName, double fileSize, String filePath,
                   boolean isEncrypted) {
        super(fileName,fileSize,filePath);
        this.isEncrypted = isEncrypted;
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
