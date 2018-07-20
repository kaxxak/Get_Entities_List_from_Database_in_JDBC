import entities.Product;
import models.ProductModel;

import java.text.SimpleDateFormat;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
    ProductModel productModel = new ProductModel();
    List<Product> products =productModel.finAll();
    for (Product product:products ) {
      System.out.println("Id: "+product.getId());
      System.out.println("Name: "+product.getName());
      System.out.println("Price:" + product.getPrice());
      System.out.println("Quantity: "+product.getQuantity());
      System.out.println("Description: "+product.getDescription());
      System.out.println("Date Created: "+simpleDateFormat.format(product.getDateCreated()));
      System.out.println("Featured: "+product.isFeatured());
      System.out.println("==========================================================");
    }
  }
}
