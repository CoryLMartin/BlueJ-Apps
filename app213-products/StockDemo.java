
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * @version 2.0 
 * Edited by Cory Martin
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29*/
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo()
    {
        this.stock = new StockList();
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Cod Vanguard"));
        stock.add(new Product(102, "Fifa 22 "));
        stock.add(new Product(103, "GTA V"));
        stock.add(new Product(104, "Battlefield 2042"));
        stock.add(new Product(105, "F1 2021"));
        stock.add(new Product(106, "Minecraft"));
        stock.add(new Product(107, "Halo Infinite"));
        stock.add(new Product(108, "Skyrim"));
        stock.add(new Product(109, "NBA 2K22"));
        stock.add(new Product(110, "Cod Black Ops 4"));
        runDemo();
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        stock.buyProduct(101, 500);
        stock.buyProduct(102, 400);
        stock.buyProduct(103, 300);
        stock.buyProduct(104, 600);
        stock.buyProduct(105, 100);
        stock.buyProduct(106, 700);
        stock.buyProduct(107, 800);
        stock.buyProduct(108, 800);
        stock.buyProduct(109, 900);
        stock.buyProduct(110, 100);
    }

    private void sellProducts()
    {
        stock.sellProduct(101, 400);
        stock.sellProduct(102, 400);
        stock.sellProduct(103, 200);
        stock.sellProduct(104, 500);
        stock.sellProduct(105, 0);
        stock.sellProduct(106, 500);
        stock.sellProduct(107, 700);
        stock.sellProduct(108, 500);
        stock.sellProduct(109, 800);
        stock.sellProduct(110, 0);
    }    
}