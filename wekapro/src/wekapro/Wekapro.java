/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

/**
 *
 * @author TVC
 */
public class Wekapro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        MyKnL model=new MyKnL("D:\\Ung dung\\Weka-3-8-5\\data\\iris.arff");
//        System.out.println(model);
//        model.saveData("D:\\DATA\\iris.arff");
//        model.saveData2CSV("D:\\DATA\\iris_CSV.csv");
//            MyAMl model = new MyAMl("D:\\Ung dung\\Weka-3-8-5\\data\\weather.numeric.arff", "-N 10 -T 0 -C 0.9 -D 0.05 -U 1.0 -M 0.1 -S -1.0 -c -1", "-R 2-3");
//            model.mineAR();
          MyFPG model = new MyFPG("D:\\Ung dung\\Weka-3-8-5\\data\\weather.nominal.arff", 
                                   "-P 2 -I -1 -N 10 -T 0 -C 0.8 -D 0.05 -U 1.0 -M 0.2", 
                                   "-N -R first-last");
          model.mineAR();
          System.out.println(model);
           
    }
    
}
