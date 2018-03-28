/*
 *
 *
 * @author Bekz
 */

package pl.bezk.controller;

import pl.bezk.model.TreeFiles;
import pl.bezk.view.SearchView;

public class TreeFilesController {
    private SearchView searchView = new SearchView();
    private TreeFiles treeFiles = new TreeFiles();

    public void pointPath(String path) {
        treeFiles.setPath( path );
    }

    public void setExtension(String extension) {
        treeFiles.setExtension( extension );
    }

    public void showPath() {
        searchView.showInputPath( treeFiles );
    }

    public void showExtension() {
        searchView.showFileExtension( treeFiles );
    }

    public void countAllFiles(){
        try {
            treeFiles.countFiles();
        }
        catch (NullPointerException e){
            System.out.println("Put a path");
            System.exit( 0 );
        }
    }

    public void showAllFiles() {
        searchView.showSeekResults( treeFiles );
    }

    public void countAllFilesInTree() {
        treeFiles.countAllElementsInTree();
    }

    public void showNumberElementInTree() {
        searchView.showTotalNumberElements( treeFiles );
    }
}

