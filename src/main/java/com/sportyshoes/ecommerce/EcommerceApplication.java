package com.sportyshoes.ecommerce;

import com.sportyshoes.ecommerce.model.Product;
import com.sportyshoes.ecommerce.model.User;
import com.sportyshoes.ecommerce.service.ProductService;
import com.sportyshoes.ecommerce.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Properties;
import java.util.stream.Stream;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductService productService, UserRepository userRepository) {
        return args -> {
            productService.save(new Product(1L, "Casual Shoes", 300.00, "https://rukminim1.flixcart.com/image/434/521/k0flmkw0/shoe/z/6/t/dtss18ft-019-8-ducati-navy-original-imafk8cyqht7nx9c.jpeg?q=50"));
            productService.save(new Product(2L, "Nike Shoes", 200.00, "https://rukminim1.flixcart.com/image/434/521/kfoapow0-0/shoe/n/7/e/aq7481-401nike-nike-midnight-navy-pure-platinum-original-imafw2xpwzangcdz.jpeg?q=50"));
            productService.save(new Product(3L, "Sports Shoes", 100.00, "https://rukminim1.flixcart.com/image/434/521/km0x5zk0/shoe/f/i/x/7-ck1069-100nike-8-nike-white-pure-platinum-clear-original-imagfyryxrg5mqqa.jpeg?q=50"));
            productService.save(new Product(4L, "Reebok Shoes", 5.00, "https://rukminim1.flixcart.com/image/434/521/knxiavk0/shoe/a/r/b/6-hkz70-7-reebok-smoky-indigo-vector-original-imag2hwk8h5xq6a3.jpeg?q=50"));
            productService.save(new Product(5L, "Puma Shoes", 3.00, "https://rukminim1.flixcart.com/image/434/521/khkvukw0-0/shoe/h/z/0/37192808-10-puma-black-sharp-green-original-imafxka6fxytfhah.jpeg?q=50"));
            productService.save(new Product(6L, "Adidas Shoes", 500.00, "https://rukminim1.flixcart.com/image/434/521/kl9rssw0/shoe/z/y/e/7-hkk23-adidas-dovgry-ftwwht-hazyel-original-imagyfkg7g7y26ys.jpeg?q=50"));

            Stream.of("Abhinov", "Mohit", "Shubham", "Riki", "Pooja").forEach(name -> {
                User user = new User(name, name.toLowerCase() + "@gmail.com");
                userRepository.save(user);
            });
            userRepository.findAll().forEach(System.out::println);
        };
    }
}
