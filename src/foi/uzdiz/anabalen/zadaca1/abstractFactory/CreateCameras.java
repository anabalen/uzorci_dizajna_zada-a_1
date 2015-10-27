/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foi.uzdiz.anabalen.zadaca1.abstractFactory;

import foi.uzdiz.anabalen.abstractfactory.interfaces.Compact;
import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLM;
import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLR;

/**
 *
 * @author mario
 */
public class CreateCameras {
  /*  
    public void createCameras(){
     //get DSLR factory
        AbstractFactory dslrFactory = FactoryProducer.getFactory("DSLR");

        DSLR dslr1 = dslrFactory.getDSLR("CanonEOS700D");

        //call make method of DSLR camera1
        dslr1.makeDSLR();

        DSLR dslr2 = dslrFactory.getDSLR("NikonD3200");

        //call make method of DSLR camera2
        dslr2.makeDSLR();

        DSLR dslr3 = dslrFactory.getDSLR("CanonEOS100D");

        //call make method of DSLR camera3
        dslr3.makeDSLR();

        //get DSLM factory
        AbstractFactory dslmFactory = FactoryProducer.getFactory("DSLM");

        
        DSLM dslm1 = dslmFactory.getDSLM("LumixG6H");
        
        //call make method of DSLM camera1
        dslm1.makeDSLM();

        
        DSLM dslm2 = dslmFactory.getDSLM("OlympusEM10");
        
        //call make method of DSLM camera2
        dslm2.makeDSLM();

        
        DSLM dslm3 = dslmFactory.getDSLM("SonyA5000");
        
        //call make method of DSLM camera3
        dslm3.makeDSLM();
        
        
        //get Compact factory
        AbstractFactory compactFactory = FactoryProducer.getFactory("Compact");

        
        Compact compact1 = compactFactory.getCompact("NikonCoolPixS33");
        
        //call make method of DSLM camera1
        compact1.makeCompact();

        
        Compact compact2 = compactFactory.getCompact("SonyDSC200W");
        
        //call make method of DSLM camera2
        compact2.makeCompact();

        
        Compact compact3 = compactFactory.getCompact("CanonIXUS170");
        
        //call make method of DSLM camera3
        compact3.makeCompact();
   }*/ 
}
