import mod.MyClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Mod8Tests {
  @Test
  void test8() {
    Assertions.assertEquals("8", new MyClass().toString());
  }
}
