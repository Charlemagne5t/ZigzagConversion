import org.example.Solution;
import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void convertTest_PAYPALISHIRING_PAHNAPLSIIGYIR_3() {
        Assert.assertEquals("PAHNAPLSIIGYIR",
                new Solution().convert("PAYPALISHIRING", 3));
    }

    @org.junit.Test
    public void convertTest_PAYPALISHIRING_PINALSIGYAHRPI_4() {
        Assert.assertEquals("PINALSIGYAHRPI",
                new Solution().convert("PAYPALISHIRING", 4));
    }
}
