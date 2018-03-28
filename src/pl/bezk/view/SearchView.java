/*
 *
 *
 * @author Bekz
 */

package pl.bezk.view;

import pl.bezk.model.TreeFiles;

public class SearchView {

    public void showInputPath(TreeFiles treeFiles) {

        System.out.println( "Your path to search: " + treeFiles.getPath() );
    }

    public void showFileExtension(TreeFiles treeFiles) {

        System.out.println( "Your file extension to count all files in tree folder: " + treeFiles.getExtension() );
    }

    public void showSeekResults(TreeFiles treeFiles) {

        System.out.println( "Your total files in folder: " + treeFiles.getListOfFiles().toString() );
    }

    public void showTotalNumberElements(TreeFiles treeFiles) {
        System.out.println( "Your total files in a tree folder: " + treeFiles.countAllElementsInTree() );
    }

}
