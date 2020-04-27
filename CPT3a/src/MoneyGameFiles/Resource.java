/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MoneyGameFiles;

import javax.swing.*;

public class Resource {
    //Paths

    private String penny = "/resources/penny.jpg";
    private String nickel = "/resources/nickel.jpg";
    private String dime = "/resources/dime.png";
    private String quarter = "/resources/quarter.jpg";
    private String loonie = "/resources/loonie.jpg";
    private String toonie = "/resources/toonie.jpg";
    private String dollar5 = "/resources/dollar5.jpg";
    private String dollar10 = "/resources/dollar10.jpg";
    private String dollar20 = "/resources/dollar20.jpg";
    private String dollar50 = "/resources/dollar50.jpg";
    private String dollar100 = "/resources/dollar100.jpg";
    //Images
    public StretchIcon PENNY;
    public StretchIcon NICKEL;
    public StretchIcon DIME;
    public StretchIcon QUARTER;
    public StretchIcon LOONIE;
    public StretchIcon TOONIE;
    public StretchIcon DOLLAR5;
    public StretchIcon DOLLAR10;
    public StretchIcon DOLLAR20;
    public StretchIcon DOLLAR50;
    public StretchIcon DOLLAR100;

    public Resource() {
        PENNY = new StretchIcon(getClass().getResource(penny));
        NICKEL = new StretchIcon(getClass().getResource(nickel));
        DIME = new StretchIcon(getClass().getResource(dime));
        QUARTER = new StretchIcon(getClass().getResource(quarter));
        LOONIE = new StretchIcon(getClass().getResource(loonie));
        TOONIE = new StretchIcon(getClass().getResource(toonie));
        DOLLAR5 = new StretchIcon(getClass().getResource(dollar5));
        DOLLAR10 = new StretchIcon(getClass().getResource(dollar10));
        DOLLAR20 = new StretchIcon(getClass().getResource(dollar20));
        DOLLAR50 = new StretchIcon(getClass().getResource(dollar50));
        DOLLAR100 = new StretchIcon(getClass().getResource(dollar100));
    }
}
