/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Emp;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class Emp {
    
    private String name;
    private int id;
    private static int count = 1;
/*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    public Emp() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }
    
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    //Override method to get string of an object
    @Override
    public String toString() {
        return name;
    }
    
}
