package com.seleniumtraining.session5and6.assignments;

class access_specifier {
    public static void main(String args[])
    {
        access obj = new access();   
        obj.cal(2, 3);
        System.out.println(obj.x);
        obj.print();     
    }
}
