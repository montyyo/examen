
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
   //ALIMENTO MAS CALORICO CONSUMIDO
   private float masCalorico;
   //nombre alimento mas calorico
   private String nombreMasCalorico;
   /**
    * constructor de usuarios con un parametro para indicar el nombre del mismo
    */
   public Usuarios(String nombre)
   {
       //inicializacion de los parametros en el constructor
       nombreUsu = nombre;
       gramosIngeridos = 0;
       proteinasIng = 0;
       grasasIng = 0;
       carbohidratosIng=0;
       calorias = 0;
       masCalorico = 0;
       nombreMasCalorico=null;
   }
   
   /**
    * metodo que le permite al usuario comer una cantidad de un alimento
    */
   public void comer(Alimento comida, float cantAlimento)//paramentros para especificar el elimento y cantidad a comer
   {
       masCalorico(comida);
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
   
   /**
    * metodo para mostrar la cantidad ingerida de parametros alimenticios con su porcentaje
    */
   public void visualizacionConPorcentaje()
   {
       float proteinasPorc= (proteinasIng * gramosIngeridos) / 100;
       float grasasPorc=(grasasIng * gramosIngeridos) / 100;
       float carbohidratosPorc=(carbohidratosIng * gramosIngeridos) / 100;
       if( calorias !=0){
           System.out.println(" Nombre:                                 " + nombreUsu );
           System.out.println(" Gramos de proteinas ingeridos:          " + proteinasIng + " ( "  + proteinasPorc  + " )");
           System.out.println(" Gramos de carbohidratos ingeridos:      " + carbohidratosIng + " ( "  + grasasPorc  + " )");
           System.out.println(" Gramos de grasas ingeridos:             " + grasasIng + " ( "  + carbohidratosPorc  + " )");
           System.out.println("Calorias ingeridas:                      " + calorias);
       }
       else
       {
           System.out.println(" Nombre:                                 " + nombreUsu);
           System.out.println(" Gramos de proteinas ingeridos:          " + proteinasIng);
           System.out.println(" Gramos de carbohidratos ingeridos:      " + carbohidratosIng);
           System.out.println(" Gramos de grasas ingeridos:             " + grasasIng);
           System.out.println("Calorias ingeridas:                      " + calorias);
       }
       
   }
   /**
    * metodo para saber el nombre del usuario
    */
   public String nombreCompararUsuarios()
   {
       return nombreUsu;
   }
   
   
   /**
    * metodo para saber la cantidad de calorias ingeridas
    */
   public float caloriasUsu()
   {
       return calorias;
   }
   
   
   /**
    * metodo para compara la ingesta entre dos usuarios
    */
   public void compararIngesta(Usuarios usu)
   {
       float caloriasUsu = usu.caloriasUsu();
       String nombre = usu.nombreCompararUsuarios();
       
       if(caloriasUsu > calorias){
           System.out.println( nombre + "  ha consumido más calorias que " + nombreUsu);
       }
       else if(caloriasUsu == calorias){
           System.out.println( nombre + "  ha consumido las mismas  calorias que " + nombreUsu);
       }
       else
       {
           System.out.println( nombreUsu + "  ha consumido más calorias que " + nombre);
       }
   }
   
   /**
    * metodo para guardar el alimento mas calorico
    */
   public void masCalorico(Alimento comida)
   {
       if(comida.getCalorias() > masCalorico){
           masCalorico= comida.getCalorias();
           nombreMasCalorico=comida.getNombre();
       }
   }
   
   /**
    * metodo para mostrar el nombre del alimento mas calorico ingerido por el usuario
    */
   public void alimentoMayorIndiceCalorico()
   {
    
       System.out.println("Alimento más calórico ingerido por el usuario hasta el momento: " + nombreMasCalorico);
   }
  
}
