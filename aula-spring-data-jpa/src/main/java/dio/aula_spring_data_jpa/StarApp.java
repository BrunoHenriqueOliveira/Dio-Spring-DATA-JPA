package dio.aula_spring_data_jpa;

import dio.aula_spring_data_jpa.model.User;
import dio.aula_spring_data_jpa.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StarApp implements CommandLineRunner {
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setNome("Bruno");
        user.setUserName("brunolobinho");
        user.setPassword("bru1234");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
