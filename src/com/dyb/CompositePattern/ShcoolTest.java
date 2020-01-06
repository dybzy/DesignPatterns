package com.dyb.CompositePattern;

/**
 * @author dyb
 * @date 2020-01-06 13:56
 */
public class ShcoolTest {
    public static void main(String[] args) {
        //总校
        ConcreteSchool rootSchool=new ConcreteSchool("总校");
        rootSchool.addPart(new IntenetDepartment("总校网络部"));
        rootSchool.addPart(new SecurtyDepartment("总校保卫部"));
        //分校
        ConcreteSchool branchSchool=new ConcreteSchool("分校");
        branchSchool.addPart(new IntenetDepartment("分校网络部"));
        branchSchool.addPart(new SecurtyDepartment("分校保卫部"));
        rootSchool.addPart(branchSchool);

        rootSchool.action();

    }
}
