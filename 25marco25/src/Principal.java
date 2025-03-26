import java.util.*;



public class Principal {

    public static void main(String[] args) {

        List<String> ListaCompras;
        ListaCompras = new ArrayList();
        
        
        ListaCompras.add("refri");
        ListaCompras.add("carne");
        ListaCompras.add("carvao");
        ListaCompras.add("gelo");
        
        Collections.sort(ListaCompras);
        
        System.out.println(ListaCompras.get(2));
        
        System.out.println(ListaCompras);
        
        System.out.println();
        System.out.println();
        
        
        
        
        Set ListaCompras2;
        
        ListaCompras2= new HashSet();
        
        ListaCompras2.add("refri");
        ListaCompras2.add("carne");
        ListaCompras2.add("carvao");
        ListaCompras2.add("gelo");
        
        System.out.println(ListaCompras2);
        
        System.out.println();System.out.println();
        
        
        Map<String,String> ListaCompras3;
        
        ListaCompras3 = new HashMap<String, String>();
        
       ListaCompras3.put("bebida","cachaca");
       ListaCompras3.put("carvao","madeira queimada");
       ListaCompras3.put("carne","fodase vegetarianos");
       ListaCompras3.put("mais coias","sei la");
       
       System.out.println(ListaCompras3.get("carne"));
        System.out.println(ListaCompras3.containsValue("cachaca"));
        System.out.println(ListaCompras3.keySet());
        System.out.println(ListaCompras3.values());
        
        
    }
    
    
}
