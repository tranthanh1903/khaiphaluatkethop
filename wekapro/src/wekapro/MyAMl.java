/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import weka.associations.Apriori;
import weka.core.Instances;

/**
 *
 * @author TVC
 */
public class MyAMl extends MyKnL {
    Apriori apriori;
    Instances newData;

    public MyAMl() {
    }

    public MyAMl(String filename, String m_opts, String d_opts) throws Exception {
        super(filename, m_opts, d_opts);
        this.apriori=new Apriori();
    }
    public void mineAR() throws Exception{
//        this.newData = removeData(this.dataset);
        this.newData=convertData(this.dataset);
        apriori.setOptions(this.model_options);
        apriori.buildAssociations((this.newData));
    }

    @Override
    public String toString() {
        return apriori.toString();//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
