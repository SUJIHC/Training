/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bad022;

/**
 *
 * @author admin
 */
interface playable{
    void play();
}
class veena implements playable{

    @Override
    public void play() {
        System.out.println("String instrument is being played");
    }
    
}
class saxophone implements playable{

    @Override
    public void play() {
        System.out.println("Wind music is being played");
    }
    
}
public class sample13 {
    
}
