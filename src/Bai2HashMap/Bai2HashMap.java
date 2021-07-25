package Bai2HashMap;

import java.util.*;

public class Bai2HashMap {
    HashMap<String, Product> hashmap = new HashMap<>();
    public void AddProduct(String key,  Product sp){
        hashmap.put(key, sp);
        System.out.println(hashmap);
    }
    public void EditProduct(String key, Product sp){
        hashmap.replace(key, sp);
        System.out.println(hashmap);
    }
    public void PrintAll(){
        Set<Map.Entry<String, Product>> setHashMap = hashmap.entrySet();
        for (Map.Entry<String, Product> i : setHashMap) {
            System.out.println(i.getKey()+"-->"+i.getValue());
        }
    }
    public static void main(String[] args) {
        Bai2HashMap m = new Bai2HashMap();
        Scanner sc = new Scanner(System.in);
        String select="";
        while(true){
            System.out.println("A. Them 3 san pham vao gio hang");
            System.out.println("B. Giam so luong trong gio hang di 1");
            System.out.println("C. Them 1 san pham vao gio hang");
            System.out.println("D. In gio hang");
            System.out.println("E. Thoat");
            System.out.println("Chon chuc nang");
            select=sc.nextLine();
            switch (select){
                case "A":
                    m.AddProduct("POLARIZED FISHING GLASSES", new Product(69.99, "Green", 3));
                    break;
                case "B":
                    m.EditProduct("POLARIZED FISHING GLASSES", new Product(69.99, "Green", 2));
                    break;
                case "C":
                    m.AddProduct("SHIRT", new Product(10, "", 1));
                    break;
                case "D":
                    m.PrintAll();
                    break;
                case "E":
                    return;
                default:
                    System.out.println("Vui long chon lai");
                    break;
            }
        }

    }
}
