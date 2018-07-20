package models;

import entities.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductModel {
  public List<Product> finAll() {
    List<Product> products = new ArrayList<Product>();
    {

      try {
        PreparedStatement preparedStatement = ConnectDatabase.getConnection().prepareStatement("select * from product");

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
          Product product = new Product();
          product.setId(resultSet.getInt("id"));
          product.setName(resultSet.getString("name"));
          product.setPrice(resultSet.getBigDecimal("price"));
          product.setQuantity(resultSet.getInt("price"));
          product.setDescription(resultSet.getString("description"));
          product.setDateCreated(resultSet.getDate("dataCreated"));
          product.setFeatured(resultSet.getBoolean("featured"));
          products.add(product);
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
      return products;
    }
  }

}
