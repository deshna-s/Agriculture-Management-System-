/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.PrimaryItemReview;

import java.util.ArrayList;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class PrimaryItemReviewDir {
    private ArrayList<PrimaryItemReview> primaryItemReviewList;
    private static PrimaryItemReviewDir primItemRevInst;

    public static PrimaryItemReviewDir getInst() {
        if (primItemRevInst == null) {
            System.out.println("Inside get instance");
            primItemRevInst = new PrimaryItemReviewDir();
        }
        return primItemRevInst;
    }
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/

    public PrimaryItemReviewDir() {
        primaryItemReviewList = new ArrayList<PrimaryItemReview>();
    }

    public ArrayList<PrimaryItemReview> getPrimaryItemReviewList() {
        return primaryItemReviewList;
    }
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/

    public void setPrimaryItemReviewList(ArrayList<PrimaryItemReview> primaryItemReviewList) {
        this.primaryItemReviewList = primaryItemReviewList;
    }
    


    public PrimaryItemReview addRawMaterialReview() {
        PrimaryItemReview primItemRev = new PrimaryItemReview();
        primaryItemReviewList.add(primItemRev);
        return primItemRev;
    }
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/

    public void removeRawMaterialReview(PrimaryItemReview primItemRev) {
        primaryItemReviewList.remove(primItemRev);
    }
}
