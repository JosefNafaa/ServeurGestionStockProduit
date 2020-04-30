package com.example.serveurGestionStockProduit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.serveurGestionStockProduit.entity.Produit;
import com.example.serveurGestionStockProduit.entity.Role;
import com.example.serveurGestionStockProduit.repository.ProduitRepository;
import com.example.serveurGestionStockProduit.repository.RoleRepository;
import com.example.serveurGestionStockProduit.util.RoleEnum;

@SpringBootApplication

public class ServeurGestionStockProduitApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ServeurGestionStockProduitApplication.class, args);
		

		RoleRepository roleRepository = ctx.getBean(RoleRepository.class);

		
        ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);
		
		

		Role roleUser = new Role(RoleEnum.ROLE_USER);
		Role roleAdmin = new Role(RoleEnum.ROLE_ADMIN);

		

		roleRepository.save(roleUser);
		roleRepository.save(roleAdmin);
		//ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);

		//produitRepository.save(new Produit("Livre", 50, 20));
		//produitRepository.save(new Produit("Cahier", 200, 5.25f));
		//produitRepository.save(new Produit("Stylo", 500, 2.10f));
  
		/*RoleRepository roleRepository = ctx.getBean(RoleRepository.class);

		Role roleUser = new Role("ROLE_USER");
		Role roleAdmin = new Role("ROLE_ADMIN");

		Role roleUser = new Role(RoleEnum.ROLE_USER);
		Role roleAdmin = new Role(RoleEnum.ROLE_ADMIN);
		UserRepository userRepository = ctx.getBean(UserRepository.class);

		User user = new User("user", "password1", true);
		user.setRoles(Arrays.asList(roleUser));

		userRepository.save(user);

		User admin = new User("admin", "password2", true);
		admin.setRoles(Arrays.asList(roleUser, roleAdmin));

		userRepository.save(admin);*/
	}

}
