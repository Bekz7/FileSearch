/*
 *
 *
 * @author Bekz
 */

package pl.bezk.model;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class TreeFiles {
    private Map<String, Integer> listOfFiles = new HashMap<>();
    private String path;
    private String extension;

    public Map<String, Integer> getListOfFiles() {
        return listOfFiles;
    }

    public String getPath() {
        return path;
    }

    public String getExtension() {
        return extension;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void countFiles() {
        File folder = new File( getPath() );
        File[] files = folder.listFiles();

        Integer i = 0;
        listOfFiles.put( getPath(), i );

        for (File treeFiles : files) {

            if (hasExtension( treeFiles, getExtension() )) {
                i++;
            } else if (treeFiles.isDirectory()) {
                listOfFiles.put( getPath(), i );
                jumpToNextFolderAndCountAgain( treeFiles );
            }
        }
    }

    private void jumpToNextFolderAndCountAgain(File files) {
        setPath( files.getAbsolutePath() );
        countFiles();
    }

    private boolean hasExtension(File files, String extension) {
        return files.getName().endsWith( extension );
    }

    public int countAllElementsInTree() {
        int totalFilesSum = 0;
        for (int counter : listOfFiles.values()) {
            totalFilesSum += counter;
        }
        return totalFilesSum;
    }
}
