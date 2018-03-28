/*
 *
 *
 * @author Bekz
 */

package pl.bezk;

import pl.bezk.controller.TreeFilesController;

import java.util.Arrays;

public class CountFileRunner {


    public static void main(String[] args) {
        TreeFilesController controller = new TreeFilesController();

        String path = Arrays.toString( args );
        final String EXTENSION = ".xml";

        //1. Set path to search
        controller.pointPath( path );
        controller.showPath();

        //2. Set Extension file that you want to count
        controller.setExtension( EXTENSION );
        controller.showExtension();

        //3. Count and show number of files in every subfolder
        controller.countAllFiles();
        controller.showAllFiles();

        //4. Count and show all files in tree
        controller.countAllFilesInTree();
        controller.showNumberElementInTree();
    }
}
