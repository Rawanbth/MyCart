package com.udacity.store;

import com.udacity.store.model.Product;
import com.udacity.store.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
public class StoreApplication  implements CommandLineRunner {

    public static void main(String[] args) {
            SpringApplication.run(StoreApplication.class, args);
        }

    @Autowired
    private ProductRepository productRepository;


    @Override
    public void run(String... args) throws Exception {
        // TODO: Populate the database with products

        Product p1=  new Product(1L,"Mascara",  20.70, "https://d3e7ardzpaj3y4.cloudfront.net/image/catalog/product/63155910_EssenceILoveExtremeCrazyVolumeMascara-N2-500x500.png", "Essence I Love Extreme Crazy Volume Mascara - Black");
        productRepository.save(p1);
        Product p2=  new Product(2L,"Blush",  186.19, "https://d3e7ardzpaj3y4.cloudfront.net/image/catalog/product/73400602_nars%20torrid-500x500.png", "Nars Liquid Blush - Torrid");
        productRepository.save(p2);
        Product p3=  new Product(3L,"Lip Gloss",  79.99, "https://d3e7ardzpaj3y4.cloudfront.net/image/catalog/product/50750322_21402-500x500.png", "KIKO Unlimited Double Touch Lipstick - 103");
        productRepository.save(p3);

        System.out.println("Products saved successfully!");



    }
}



