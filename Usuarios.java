
/**
 * nueva clase para crear usuarios que usan la aplicacion
 */
public class Usuarios
{
   // atributos de los usuarios
   // nombre del usuarios
   private String nombreUsu;
   // comida ingerida
   private float gramosIngeridos;
   //proteinas ingeridas
   private float proteinasIng;
   //grasas ingeridas
   private float grasasIng;
   //carbohidratos ingeridos
   private float carbohidratosIng;
   //calorias consumidas
   private float calorias;
   /**
    * constructor de usuarios con un parametro para indicar el nombre del mismo
    */
   public Usuarios(String nombre)
   {
       nombreUsu = nombre;
       gramosIngeridos = 0;
       proteinasIng = 0;
       grasasIng = 0;
       carbohidratosIng=0;
       calorias = 0;
   }
   
   /**
    * metodo que le permite al usuario comer una cantidad de un alimento
    */
   public void comer(Alimento comida, float cantAlimento)//paramentros para especificar el elimento y cantidad a comer
   {
       float total = proteinasIng + grasasIng +carbohidratosIng;
       
       if(cantAlimento <= 100 && cantAlimento > total){
           proteinasIng = proteinasIng  + comida.getProteina();
           grasasIng= grasasIng + comida.getGrasa();
           carbohidratosIng=  carbohidratosIng + comida.getCarbohidrato();
           calorias = calorias + comida.getCalorias();
           gramosIngeridos = proteinasIng + grasasIng +carbohidratosIng;
        }
        else if (cantAlimento > 100 && cantAlimento > total) {
           float gramos = cantAlimento/100;
           proteinasIng = proteinasIng  + (comida.getProteina()  * gramos);
           grasasIng= grasasIng +( comida.getGrasa()* gramos);
           carbohidratosIng=  carbohidratosIng + (comida.getCarbohidrato()* gramos);
            calorias = calorias + (comida.getCalorias()*gramos);
           gramosIngeridos = proteinasIng + grasasIng +carbohidratosIng;
       }
   }
   
   /**
    * metodo para mostrar la cantidad ingerida de parametros alimenticios
    */
   public void visualizacion()
   {
       System.out.println(" Nombre:                                 " + nombreUsu);
       System.out.println(" Gramos de proteinas ingeridos:          " + proteinasIng);
       System.out.println(" Gramos de carbohidratos ingeridos:      " + carbohidratosIng);
       System.out.println(" Gramos de grasas ingeridos:             " + grasasIng);
       System.out.println("Calorias ingeridas:                      " + calorias);
   }
   
   
}
