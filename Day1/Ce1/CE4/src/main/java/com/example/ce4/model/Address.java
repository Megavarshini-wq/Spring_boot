package com.example.ce4.model;

public class Address {
  public String name,streetName,area,district,state,country;
  public int doorNo,pincode;

  public Address(String nam,int dno,String stname,int pcode,String area,String dis,String state,String cou)
  {
    this.name=nam;
    this.doorNo=dno;
    this.streetName=stname;
    this.pincode=pcode;
    this.area=area;
    this.district=dis;
    this.state=state;
    this.country=cou;
  }
}
