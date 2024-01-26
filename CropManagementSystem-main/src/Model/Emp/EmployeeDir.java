/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Emp;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class EmployeeDir {
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    
    private ArrayList<Emp> employeeList;           //Declaring array list of employees

    public EmployeeDir() {
        employeeList = new ArrayList();
    }

    public ArrayList<Emp> getEmployeeList() {
        return employeeList;
    }
    
    public Emp createEmp(String name){
        Emp employee = new Emp();
        /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        if(checkIfUniqueEmployee(name))
        {
            employee.setName(name);
        employeeList.add(employee);
        }
        else {JOptionPane.showMessageDialog(null, name+"already exists");}
        return employee;
    }
    //Method to check unique username in the system
    private boolean checkIfUniqueEmployee(String name) {
        
        boolean flag = true;         
        for (Emp em : employeeList){             
            if (em.getName().equals(name))                 
                flag = false;            
            else                 
                flag = true;        
        }      
        
        /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        return flag;
    }
    
}
