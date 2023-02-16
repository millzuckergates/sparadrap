package com.stephane.utility;

public class ControleDeValeur{

    public static boolean codePostalValide(String str) {
        if (str.matches("[a-zA-Z]+")) {
            return false;
        }
        return true;
    }

}
