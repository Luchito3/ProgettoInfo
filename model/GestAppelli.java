/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 *
 * @author leporatil
 */
public class GestAppelli {

    private ArrayList<Appello> appelli = new ArrayList();

    public GestAppelli(GestAppelli g) {
        this.appelli = g.getAppelli();
        
    }

    public GestAppelli() {
    }

 
    public void addAppello(String data, String idAppello, Disciplina disc, Docente prof) {

        Appello a = new Appello(data, idAppello, disc, prof);
        appelli.add(a);

    }
        public void addAppello(Appello a) {

      
        appelli.add(a);

    }
      public void addAppello(String data, String idAppello, Disciplina disc) {

        Appello a = new Appello(data, idAppello, disc);
        appelli.add(a);

    }
    
    
    //
       public ArrayList<Appello> getAppelli() {
        return appelli;
    }

    public void setAppelli(ArrayList<Appello> appelli) {
        this.appelli = appelli;
    }
    
    public Appello cercaAppello(String id){
        
        for(Appello i:appelli){
            
            if(i.getIdAppello().equals(id)){
                
                return i;
            }
        }
        return null;
    }
    
   public void rimuoviAppello(String id) {
        for (int i = 0; i < appelli.size(); i++) {
            if (appelli.get(i).getIdAppello().equalsIgnoreCase(id)) {
                appelli.remove(i);
                break;
            }
        }

    }
    
    @Override
    public String toString() {
        String s="";
        s+= "idAppello;data;codiceDisciplina\n";
        
        for(Appello i : appelli){
            
            s+=i + "\n";
            
        }
        
        
        return s;
    }

    

}
