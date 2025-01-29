/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

/**
 *
 * @author students
 */
public class ValidateBean {
    private String name,password,mobile,email,error;
    public ValidateBean(){
        error="";
    }
    public void setName(String n){
        name=n;
    }
    public void setPassword(String p){
        password=p;
    }
    public void setMobile(String m){
        mobile=m;
    }
    public void setEmail(String e){
        email=e;
    }
    public void setError(String e){
        error=e;
    }
    
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
    public String getMobile(){
        return mobile;
    }
    public String getEmail(){
        return email;
    }
    public String getError(){
        return error;
    }
    
    public boolean validate(){
        boolean result = true;
        if(name.trim().equals("")){
            error+="<h1>Name Empty </h1>";
            result=false;
        }
        if(password.length()<8){
            error="<h1>Password size less than 8 </h1>";
            result=false;
        }
        if(mobile.length()!=10){
            error="<h1>Mobile no should have 10 digit </h1>";
            result=false;
        }
        if(email.indexOf('@')<0){
            error="<h1>Email must contin @ symbol </h1>";
            result=false;
        }
        return result;
    }
    
}
