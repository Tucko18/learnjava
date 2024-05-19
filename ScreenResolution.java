/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.screenresolution;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Arthu
 */
public class ScreenResolution {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension resolution = tk.getScreenSize();
        System.out.println("Screen width = " + resolution.width);
        System.out.println("Screen height" + resolution.height);
        
    }
}
