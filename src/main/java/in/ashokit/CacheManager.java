package in.ashokit;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class CacheManager implements ApplicationRunner{
@Override
public void run(ApplicationArguments args) throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Logic executing yo load data to cache....");
	
}
}
