import java.util.*;
import reactor.core.publisher.Mono;
//import org.junit.jupiter.api.Test;

public class Main {
   public static void main(String[] args) {
     // System.out.println("Hello, World!");
      // @Test
      TestMono();
}
public static void TestMono()
      {
       // Mono<String> monoObject= Mono.just(
        //  "mono single object").log();
          // throw error;
          //? means object type
          
          Mono<?> monoObj= Mono.just("hello single object")
          .then(Mono.error(new RuntimeException("exception thriwn from mono obj")))
        .log();
        monoObj.subscribe(System.out::println, a->
        System.out.println(a.getMessage()));
      
 }
}
