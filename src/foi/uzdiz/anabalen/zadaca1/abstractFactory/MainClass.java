package foi.uzdiz.anabalen.zadaca1.abstractFactory;


import foi.uzdiz.anabalen.zadaca1.abstractFactory.AbstractFactory;
import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLM;
import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLR;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.DSLRFactory;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.FactoryProducer;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana-Marija
 */
public class MainClass {
    public static void main(String[] args) {


        CreateCameras cameras = new CreateCameras();
        cameras.createCameras();
   }   

}
