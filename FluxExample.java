port java.util.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

//import org.junit.jupiter.api.Test;

public class Main {
   public static void main(String[] args) {
     // System.out.println("Hello, World!");
      // @Test
      //TestMono();
      testFlux();
}
public static void TestMono()
      {
          Mono<?> monoObj= Mono.just("hello single object")
          .then(Mono.error(new RuntimeException("exception thriwn from mono obj")))
        .log();
        monoObj.subscribe(System.out::println, a->
        System.out.println(a.getMessage()));
      
 }
 
 public static void testFlux()
 {
   Flux<String> fluxMultipleObject= 
   Flux.just("kriti","mahi","mulu");
   fluxMultipleObject.subscribe(System.out::println);
 }
 
 
}
