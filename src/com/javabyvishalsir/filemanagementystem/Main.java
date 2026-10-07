package com.javabyvishalsir.filemanagementystem;


public class Main {

    public static void main(String[] args) {

        AudioFile audio = new AudioFile(
                "song.mp3",
                5.5,
                "C:/Music/song.mp3",
                "MP3",
                240,
                "Arijit Singh",
                "Album 1"
        );

        VideoFile video = new VideoFile(
                "movie.mp4",
                700,
                "C:/Videos/movie.mp4",
                "MP4",
                7200,
                "1080p"
        );

        ImagePath image = new ImagePath(
                "photo.jpg",
                3.2,
                "C:/Pictures/photo.jpg",
                "JPG",
                0,
                "1920x1080"
        );

        TextFile text = new TextFile(
                "notes.txt",
                1.2,
                "C:/Documents/notes.txt",
                "UTF-8"
        );

        PDFFile pdf = new PDFFile(
                "book.pdf",
                20.5,
                "C:/Documents/book.pdf",
                false
        );

        WordFile word = new WordFile("worfile.pdf",2.2,"/",200,2);

        // Polymorphism
        MediaFile[] mediaFiles = {
                audio,
                video,
                image
        };

        for (MediaFile media : mediaFiles) {
            media.play();
        }


        // Readable interface
        Readable[] readableFiles = {
                text,
                pdf,
                word
        };

        for (Readable file : readableFiles) {
            file.read();
            file.setMarks(50);
            file.resetMarks();
        }


        // Display information
        text.displayInfo();


        // Static method
        File.showTotalFiles();
    }
}