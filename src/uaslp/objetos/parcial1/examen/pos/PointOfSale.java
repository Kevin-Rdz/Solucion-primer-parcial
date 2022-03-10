package uaslp.objetos.parcial1.examen.pos;

import java.util.ArrayList;

public class PointOfSale {
    private ArrayList<Cartitem> items;
    public PointOfSale(){
        items = new ArrayList<>();
    }
    public void addToCart(int quantity, Product product){
        for(Cartitem item: items){
            if(item.getProductName().equals(product.getName())){
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        Cartitem cartItem = new Cartitem();
        cartItem.setQuantity(quantity);
        cartItem.setProduct(product);
        items.add(cartItem);
    }
    public ArrayList<Cartitem> getProducts(){
        return items;
    }
    public float getTotal(){
        float total = 0;

        for(Cartitem item: items){
            total += item.getAmount() * item.getQuantity();
        }
        return total;
    }
    public int getCountByName(String name){
        for(Cartitem item: items){
            if(item.getProductName().equals(name)){
                return item.getQuantity();
            }
        }
        return 0;
    }
}
