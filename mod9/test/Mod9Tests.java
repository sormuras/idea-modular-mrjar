import mod.MyClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Mod9Tests {
  @Test
  void test9() {
    Assertions.assertEquals("9", new MyClass().toString());
  }
}
