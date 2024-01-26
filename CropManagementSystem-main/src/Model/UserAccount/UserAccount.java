/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.UserAccount;

import Model.Emp.Emp;
//import Business.Produce.ProduceDirectory;
import Model.Role.Role;
import Model.WorkQueue.WorkQueue;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class UserAccount {
    
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    private String uName;
    private String pwd;
    private Emp emp;
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    private Role role;
    private WorkQueue workQueue;
    
    public UserAccount() {
        workQueue = new WorkQueue();
      
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Role getRole() {
        return role;
    }
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public void setRole(Role role) {
        this.role = role;
    }
/*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    public Emp getEmp() {
        return emp;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

     @Override
    public String toString() {
        return uName;
    }
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    
}
