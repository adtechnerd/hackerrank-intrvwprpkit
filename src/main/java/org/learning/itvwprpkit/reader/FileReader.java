package org.learning.itvwprpkit.reader;

import org.learning.itvwprpkit.content.Content;

import java.io.File;

/**
 * To read different type of files, interface defines a method which returns different type of Content
 *
 * @param <E>
 */
public interface FileReader<E extends Content> {

    /**
     * Method to read different type of Files.
     *
     * @param file
     * @return
     */
    public E read(File file);
}
