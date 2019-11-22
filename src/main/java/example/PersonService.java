package example;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements InitializingBean {
    @Autowired
    private PersonRepository personRepository;

    public void afterPropertiesSet() {
        // NPE here
        personRepository.findByIdIgnoreCase(null);
    }
}
