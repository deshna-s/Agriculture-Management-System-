/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Emp.Emp;
import Model.Role.SystemAdminRole;
import Model.UserAccount.UserAccount;
/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class ConfigSystem {
    
    
    public static EcoSys configure(){
        
        EcoSys sys = EcoSys.getInstance();
        Emp employee = sys.getEmpDir().createEmp("Kunal");       //Creating a root user
        
        UserAccount ua = sys.getUserAccountDir().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return sys;
    }
    
}
