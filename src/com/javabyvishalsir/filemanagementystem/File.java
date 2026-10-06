package com.javabyvishalsir.filemanagementystem;

public class File {

    private String fileName;
    private double fileSize;
    private String filePath;

    static int totalFiles = 0;

    public File(String fileName, double fileSize, String filePath) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.filePath = filePath;

        totalFiles++;
    }

    public void displayInfo() {
        System.out.println("File Name: " + fileName);
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("File Path: " + filePath);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public static void showTotalFiles() {
        System.out.println("Total Files Created: " + totalFiles);
    }
}