public class FrenchCountryNames {
   public static void addFrenchArticleToCountry(String name){

        if(name.equals("Belize")||name.equals("Cambodge")||name.equals("Mexique")||name.equals("Mozambique")||name.equals("Zaiire")||name.equals("Zimbabwe")){
            return "le "+name;
        }else if(name.equals("Estas Unis")||name.equals("Pays-Bas")){
            return "les "+name;
        }else{
       if(name.charAt(name.length()-1)==e){
           return "la " +name;
       }else if("AEIOUaeiou".indexOf(name.substring(0))){
           return "l\' " + name;
       }
        }
   }
}
+
