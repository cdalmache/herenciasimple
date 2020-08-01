/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.herenciasimpletarea2;


/**
 *
 * @author User
 */
class Soldadura {
  double area_soldadura;
  double masa_soldadura;
  double min;
  
  
   void MostrarPropiedadesMasa(){
       masa_soldadura=area_soldadura;
        System.out.println("La masa inicial soldada es: "+ masa_soldadura+
                " gramos en el primer segundo "+ "\n  El Area de la soldadura es: "+area_soldadura+"\n El proceso demoró: "+min);
   }
}
   
    class SoldaduraFsw extends Soldadura{
        String material;
        
        double CalcularMasa(){
            return area_soldadura*min;
        }
        void mostraMaterial(){
            System.out.println(" El material es:"+material);
        }
    }
     
    class SoldaduraFrw extends Soldadura{
        String material;
        
        double CalcularMasa(){
            return area_soldadura*min;
        }
        void mostraMaterial(){
            System.out.println(" El material es:"+material);
        }
    }
     
    class herenciasimpletarea2{
        
         public static void Encabezado(){
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS");
        System.out.println("----------- ESPE-------------------");
        System.out.println("Integrantes: Almache Cristian, Alex Beltran");
        System.out.println("Carrera: Ing. Automotriz");
        System.out.println("Docente: Ing. Luis Gerra");
        System.out.println("Herencia Simple Tarea 1 ");
         System.out.println("_________________________________________________________________");
         System.out.println("_________________________________________________________________");
    }
    public static void main(String[] args) {
     
        Encabezado();
         SoldaduraFsw soldaduraFsw=new SoldaduraFsw();
         SoldaduraFrw soldaduraFrw=new SoldaduraFrw();
         
         soldaduraFsw.area_soldadura=3.5;
         soldaduraFsw.min=3.2;
         soldaduraFsw.material="COBRE";
         
         soldaduraFrw.area_soldadura= 4.3;
         soldaduraFrw.min=2.1;
         soldaduraFrw.material="ACERO";
         
         System.out.println(" Detalles de Soldadrua Fsw: ");
         soldaduraFsw.MostrarPropiedadesMasa();
         soldaduraFsw.mostraMaterial();
         
         System.out.println(" La masa total soldada es :"+soldaduraFsw.CalcularMasa()+" gramos");
         System.out.println();
         
         System.out.println(" Detalles de Soldadrua Frw: ");
         soldaduraFrw.MostrarPropiedadesMasa();
         soldaduraFrw.mostraMaterial();
         
         System.out.println(" La masa total soldada es :"+soldaduraFrw.CalcularMasa()+" gramos");
         System.out.println();
         
    
    
}
    }