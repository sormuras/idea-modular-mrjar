import mod.MyClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Mod17Tests {
  @Test
  void test17() {
    Assertions.assertEquals("17", new MyClass().toString());
  }
}
