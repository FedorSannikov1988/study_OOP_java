package homework1;

import java.util.List;
import java.util.ArrayList;

public class VendingMachine {
    private List<Product> productsForSale = new ArrayList<Product>();
    private double revenueVendingMachine = 0;

    public void addProductVendingMachine(Product inputProduct) {
        this.productsForSale.add(inputProduct);
    }

    public List<Product> findTypeProductInVM(String typeProduct) {

        List<Product> foundProduct = new ArrayList<>();

        for (Product product : productsForSale) {
            if (product.getTypeProduct().contains(typeProduct)) {
                foundProduct.add(product);
            }
        }
        return foundProduct;
    }

    public List<Product> findBrandProductInVM(String brandProduct) {

        List<Product> foundProduct = new ArrayList<>();

        for (Product product : productsForSale) {
            if (product.getBrandProduct().contains(brandProduct)) {
                foundProduct.add(product);
            }
        }
        return foundProduct;
    }

    public List<Product> findCostProductVM(double reasonablePrice) {

        List<Product> foundProduct = new ArrayList<>();

        for (Product product : productsForSale) {
            if (product.getCostProductPackage() <= reasonablePrice) {
                foundProduct.add(product);
            }
        }
        return foundProduct;
    }

    public List<Product> findTypeProductAndCostProductInVM(String typeProduct,
                                                           double reasonablePrice) {

        List<Product> foundProduct = new ArrayList<>();

        for (Product product : productsForSale) {
            if ((product.getTypeProduct().contains(typeProduct)) &&
                    (product.getCostProductPackage() <= reasonablePrice)) {
                foundProduct.add(product);
            }
        }
        return foundProduct;
    }

    private List<Product> findTypeProductAndBrandProductInVM(String typeProduct,
                                                               String brandProduct) {

        List<Product> foundProduct = new ArrayList<>();

        for (Product product : productsForSale) {
            if ((product.getTypeProduct().contains(typeProduct)) &&
                    (product.getBrandProduct().contains(brandProduct))) {
                foundProduct.add(product);
            }
        }
        return foundProduct;
    }

    public void sellOneProductHuman(String typeProduct, String brandProduct) {

        List<Product> findProductForPurchased =
                findTypeProductAndBrandProductInVM(typeProduct, brandProduct);

        if (findProductForPurchased.size() > 0) {
            for (int i = 0; i < productsForSale.size(); i++) {
                if (productsForSale.get(i) == findProductForPurchased.get(0)) {

                    if (productsForSale.get(i).getQuantityProductPackage() > 1) {
                        revenueVendingMachine += productsForSale.get(i).getCostProductPackage();
                        productsForSale.get(i).setQuantityProductPackage((productsForSale.get(i).getQuantityProductPackage())-1);
                    }
                    else {
                        revenueVendingMachine += productsForSale.get(i).getCostProductPackage();
                        productsForSale.remove(i);
                        return;
                    }
                }
            }
        }
    }

    public double getRevenue() {
        return revenueVendingMachine;
    }

    @Override
    public String toString() {
        String cherta = "*********************************************";
        StringBuilder strOut = new StringBuilder();
        for (Product product: productsForSale) {
            strOut.append("\n" + cherta + "\n");
            strOut.append(product.toString());
        }
        strOut.append("\n" + cherta);

        return strOut.toString();
    }

}
