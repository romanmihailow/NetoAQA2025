import org.junit.jupiter.api.Test;
import ru.netology.BonusService;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {
    @Test
    void calculateBonusTest() {
        int amount = 2000;
        int expected =100;
        BonusService service = new BonusService();
        int actual = service.calculateBonus(amount);
        assertEquals(expected, actual);



    }
}
