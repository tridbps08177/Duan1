/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbhcafe.helper;

import java.util.ArrayList;

/**
 *
 * @author baotri1998
 */
public class NewClass {

  public static void main(String[] args) {
      ArrayList<String> al = new ArrayList<String>();
      al.add("AB");
      al.add("CD");
      al.add("AB");
      al.add("GH");
      al.add("IJ");
      al.add("KL");
      al.add("MN");

      System.out.println("Index of 'AB': "+al.indexOf("AB"));
      System.out.println("Index of 'AB': "+al.indexOf("AB"));
      System.out.println("Index of 'AA': "+al.indexOf("AA"));
      System.out.println("Index of 'EF': "+al.indexOf("EF"));
  }

}
