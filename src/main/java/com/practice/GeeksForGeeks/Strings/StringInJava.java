package com.practice.GeeksForGeeks.Strings;

import java.nio.charset.Charset;

public class StringInJava {

     /*
        ways to create a string
      */

     // String literal
    String s = "Swanand";

    // using new keyword
    String ss = new String("Swanand");

    /*
    Constructors
     */

    // Construct a string by decoding a byte array
    byte[] b_arr = {71, 101, 101, 107, 115};
    String s_byte = new String (b_arr);//Geeks

    //Construct a new String by decoding the byte array using char_set
    byte[] a_arr = {71, 101, 101, 107, 115};
    Charset cs = Charset.defaultCharset();
    String s_byte_char = new String(a_arr,cs);
}
