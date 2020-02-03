package api.models;

import javax.persistence.*;

@Entity(name= "products")
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name="name")
    private String name;

    @Column(name="category")
    private String category;

    @Column(name="price")
    private float price;

    //setting up getters 
    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getCategory(){
        return this.category;
    }

    public float getPrice(){
        return this.price;
    }
    // end of getters

    //setters
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setPrice(float price){
        this.price = price;
    }
    

}