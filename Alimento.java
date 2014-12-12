/**
 * clase alimento para especificar el nombre y nutrientes del alimento
 */
public class Alimento
{
   //nombre del alimento
   private String nombreAlimento; // string o cadena de caracteres para el nombre
   //gramos de proteinas del alimento
   private float proteinas;
   //gramos de carbohidratos
   private float carbohidratos;
   //gramos de grasa
   private float grasas;
   //calorias
   private float calorias;
   /**
    * constructor del alimento para crear los objetos necesarios
    */
   public Alimento(String nombre, float proteina, float carbohidrato, float grasa , float caloria)//parametros de los atributos
   {
       // inicializamos los atributos del alimento conforme a los parametros del construcctor
       nombreAlimento = nombre;
       proteinas = proteina;
       carbohidratos= carbohidrato;
       grasas = grasa;
       calorias = caloria;
       
   }
   
   /**
    * metodo muestradatos para visualizar la informacion nutricional del alimento
    */
   public void muestraDatos()
   {
       //imprimimos por pantalla los datos nutricionales del alimento
       System.out.println(" Nombre:                           " + nombreAlimento);
       System.out.println("Proteinas por cada 100 gramos:     " + proteinas);
       System.out.println("Carbohidratos por cada 100 gramos: " + carbohidratos);
       System.out.println("Calorias:                          " + calorias);
       System.out.println("Grasas por cada 100 gramos:        " + grasas);
       if (proteinas > carbohidratos && proteinas > grasas){
           System.out.println("Componente mayoritario/s:            proteinas");
       }
       else if (carbohidratos > proteinas && carbohidratos > grasas){
           System.out.println("Componente mayoritario/s:          carbohidratos"  );
       }
       else if ( grasas > proteinas && grasas > carbohidratos){
           System.out.println("Componente mayoritario/s:                grasas "  );
       }
       else if ( proteinas > carbohidratos && grasas > carbohidratos && proteinas==grasas){
           System.out.println("Componente mayoritario/s:                grasas y proteinas "  );
       }
       else if ( proteinas > grasas && grasas < carbohidratos && proteinas==carbohidratos){
           System.out.println("Componente mayoritario/s:                carbohidratos y proteinas "  );
       }
       else if ( grasas < carbohidratos && grasas < proteinas && proteinas==carbohidratos){
           System.out.println("Componente mayoritario/s:                carbohidratos y proteinas "  );
       }
       else
       {
            System.out.println("Componente mayoritario/s:                carbohidratos , proteinas y grasas "  );
       }
   }
   
   /**
    * metodo para obtener los gramos de grasa
    */
   public float getGrasa()
   {
       
       return grasas;
   }
   
   /**
    * metodo para obtener los gramos de proteinas
    */
   public float getProteina()
   {
       
       return proteinas;
   }
   /**
    * metodo para obtener los gramos de carbohidratos
    */
   public float getCarbohidrato()
   {
       
       return carbohidratos;
   }
   /**
    * metodo para obtener los gramos totales
    */
   public float getTotal()
   {
       float total = carbohidratos + proteinas + grasas;
       return total;
   }
   
   public float getCalorias()
   {
       return calorias;
   }
}
