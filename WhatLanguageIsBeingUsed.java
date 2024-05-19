package com.mycompany.whatlanguageisbeingused;

import java.util.*;

public class WhatLanguageIsBeingUsed {

    public static void main(String[] args) {
     Locale location = Locale.getDefault();
     
        System.out.println("Your language is ");
        System.out.println(location.getDisplayLanguage());
    }
}
