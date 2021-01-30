package com.apfs.demoLoader;
import com.apfs.model.Contact;
import com.apfs.repository.ContactRepository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner{
   private final ContactRepository contactRepository;

   @Autowired
    public DemoLoader(ContactRepository contactRepository){
       this.contactRepository = contactRepository;
   }

   @Override
    public void run(String ... strings) throws Exception{
       this.contactRepository.save(new Contact("Abraham", "Parker", "asdsd@gmail.com"));
   }
    
}
