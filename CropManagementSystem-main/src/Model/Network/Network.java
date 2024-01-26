/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Network;

import Model.Enterprise.EnterpriseDir;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class Network {
    private String name;
    private EnterpriseDir enterpriseDirectory;
    
    public Network(){
        enterpriseDirectory=new EnterpriseDir();
    }
    public String getName() {
        return name;
    }
/*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDir getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    @Override
    public String toString(){
        return name;
    }
    
}
