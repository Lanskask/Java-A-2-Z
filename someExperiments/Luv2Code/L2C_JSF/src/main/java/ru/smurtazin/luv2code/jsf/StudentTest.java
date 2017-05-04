package ru.smurtazin.luv2code.jsf;

/**
 * Created by 1 on 05.05.2017.
 */

import java.util.Date;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTest {

    private String firstName;
    private String lastName;
    private Date hireDate;

    public StudentTest() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

}