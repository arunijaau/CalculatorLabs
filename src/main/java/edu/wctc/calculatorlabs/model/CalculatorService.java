/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.calculatorlabs.model;

/**
 *
 * @author Aruni
 */
public class CalculatorService {
    private double width;
    private double height;

    public CalculatorService() {
        this.width = 0;
        this.height = 0;
    }
    
    

    public double getAreaOfRectangle(String width, String height) {
        this.width = Double.parseDouble(width);
        this.height = Double.parseDouble(height);
        return this.width * this.height;
    }
    
}
