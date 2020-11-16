/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephenlynn
 */
public class LandTractMain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input the length and width of tract one.");
        float tractOneLength = keyboard.nextFloat();
        float tractOneWidth = keyboard.nextFloat();
        System.out.println("Please input the length and width of tract two.");
        float tractTwoLength = keyboard.nextFloat();
        float tractTwoWidth = keyboard.nextFloat();
        
        landTract track1 = new landTract(tractOneLength, tractOneWidth);
        landTract track2 = new landTract(tractTwoLength, tractTwoWidth);
        
        float tractOneArea = track1.areaOfTract();
        float tractTwoArea = track2.areaOfTract();
        
        System.out.println("The area of tract one is: "+ tractOneArea);
        System.out.println("The area of tract two is: "+ tractTwoArea);
        
        String tractEqualness = track1.equalsTract(tractOneArea, tractTwoArea);
        track1.tractToString(tractEqualness);
    }
}
