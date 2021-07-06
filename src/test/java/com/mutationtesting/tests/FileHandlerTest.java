package com.mutationtesting.tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.File;

import com.mutationtesting.FileHandler;

import org.junit.Test;

public class FileHandlerTest {

    String sandbox = "/home/developer/java_mutationtesting/sandbox";

    //////////////////////////////////
    /////////// Helper methods
    //////////////////////////////////
    private String[] listFiles() {
        File f = new File(sandbox);

        // Populates the array with names of files and directories
        return f.list();
    }
    
    // private boolean cleanDirectory() {
    //     boolean output = false;
    //     for (int i=0; i < listFiles().length; i++) {
    //         if (!new File(sandbox + "/" + listFiles()[i]).delete()) {
    //             return output;
    //         }
    //     }
    //     return true;
    // }
    //////////////////////////////////

    @Test
    public void givenCreateFileThenFileCreated() {
        FileHandler handler = new FileHandler(sandbox + "/prueba.txt");
        assertEquals(true, handler.createFile());
        assertEquals(listFiles().length, 1);
        assertArrayEquals(listFiles(), new String[]{"prueba.txt"});
    }
    

}
