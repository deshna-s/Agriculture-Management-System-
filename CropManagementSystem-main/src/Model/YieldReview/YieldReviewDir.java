/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.YieldReview;

import java.util.ArrayList;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class YieldReviewDir {
    
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    private ArrayList<YieldReview> yeildReviewList;
    private static YieldReviewDir yeildReviewInst;

    
    
    public static YieldReviewDir getInst() {
        if (yeildReviewInst == null) {
            System.out.println("Inside get instance");
            yeildReviewInst = new YieldReviewDir();
        }
        return yeildReviewInst;
    }

    
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    public YieldReviewDir() {
        yeildReviewList = new ArrayList<YieldReview>();
    }

    public ArrayList<YieldReview> getYieldReviewList() {
        return yeildReviewList;
    }

    public void setYieldReviewList(ArrayList<YieldReview> yeildReviewList) {
        this.yeildReviewList = yeildReviewList;
    }

    public YieldReview addYieldReview() {
        YieldReview yeildReview = new YieldReview();
        yeildReviewList.add(yeildReview);
        return yeildReview;
    }
/*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    public void removeYieldReview(YieldReview yeildReview) {
        yeildReviewList.remove(yeildReview);
    }
    
}
