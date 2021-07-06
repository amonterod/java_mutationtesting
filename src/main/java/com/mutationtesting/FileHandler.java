package com.mutationtesting;

import java.io.File;

public class FileHandler {

    private String path;
    private File file;

    public FileHandler(String p) {
        this.path = p;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public boolean createFile() {
        this.file = new File(this.path);
        boolean output = false;
 
        if (!this.file.exists()) {
            // Create a new file if not exists.
            try {
                this.file.createNewFile();
                output = true;
            } catch (Exception e) {
                output = false;
            }
        }
        return output;
    }

    public boolean removeFile () {
 
        if (this.file.exists()) {
            // Remove file if exists.
            return this.file.delete();
        }

        return false;
    }

    public boolean renameFile (String newPath) {

        try {
            File newFile = new File(newPath);
            return this.file.renameTo(newFile);    
        } catch (Exception e) {
            return false;
        }

    }
}