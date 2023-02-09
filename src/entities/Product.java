package entities;

public class Product {

    //variaveis
    private String name;
    private Double price;
    private Integer quantity;
    //variaveis


    //getters e setters
    public Product(String name, Double price, Integer quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    public Integer getQuantity()
    {
        return quantity;
    }

    public void setQuantity(Integer quantity)
    {
        this.quantity = quantity;
    }
    //getters e setters

    //valor total do produto
    public double total()
    {
        return price * quantity;
    }
}
