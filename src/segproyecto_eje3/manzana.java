/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segproyecto_eje3;

/**
 *
 * @author Marcela Florez
 */
public class manzana {
    public String color;
    public String comida;
    public String crece;
    public String maduracion;
    
    public manzana(){};
    
    public manzana (String color){
        this.color=color;
    }
    public manzana(String color, String comida){
        this.color=color;
        this.comida=comida;
    }
    public manzana(String color, String comida,String crece){
        this.color=color;
        this.comida=comida;
        this.crece=crece;
    }
    public manzana (String color, String comida, String crece, String maduracion){
        this.color=color;
        this.comida=comida;
        this.crece=crece;
        this.maduracion=maduracion;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor (){
            return color;
    }
    public void setComida(String comida){
        this.comida=comida;
    }
    public String getComida(){
        return comida;
    }
    public void setCrece(String crece){
        this.crece=crece;
    }
    public String getCrece(){
        return crece;
    }
    public void setMaduracion(String maduracion){
        this.maduracion=maduracion;
    }
    public String getMaduracion(){
        return maduracion;
    }
}
