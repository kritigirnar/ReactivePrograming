import java.util.*;
import reactor.core.publisher.Mono;
import org.junit.jupiter.api.Test;

public class Main {
   // public static void main(String[] args) {
     // System.out.println("Hello, World!");
      @Test
      public void TestMono()
      {
        Mono<String> monoObject= Mono.just(
          "mono single object");
        monoObject.subscribe(System.out::println);
        
        
      

//  }
}
}
