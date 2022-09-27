package Practice03;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Q02_PımxmlKontrolü {

    @Test
    public void name() {

        // Verify that we have pom.xml file in our project => please try in 4 min
        String dosyaYolu = "pom.xml";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
}
