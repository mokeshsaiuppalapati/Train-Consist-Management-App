import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UC8Test {

    @Test
    void testFilter_CapacityGreaterThanThreshold() {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper",72));
        bogies.add(new Bogie("General",90));

        List<Bogie> result =
                bogies.stream()
                        .filter(b -> b.getCapacity() > 70)
                        .collect(Collectors.toList());

        assertEquals(2,result.size());
    }


    @Test
    void testFilter_CapacityEqualToThreshold() {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Test",70));

        List<Bogie> result =
                bogies.stream()
                        .filter(b -> b.getCapacity() > 70)
                        .collect(Collectors.toList());

        assertTrue(result.isEmpty());
    }


    @Test
    void testFilter_CapacityLessThanThreshold() {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("AC Chair",56));
        bogies.add(new Bogie("First Class",24));

        List<Bogie> result =
                bogies.stream()
                        .filter(b -> b.getCapacity() > 70)
                        .collect(Collectors.toList());

        assertEquals(0,result.size());
    }


    @Test
    void testFilter_MultipleBogiesMatching() {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper",72));
        bogies.add(new Bogie("Luxury",80));
        bogies.add(new Bogie("General",90));

        List<Bogie> result =
                bogies.stream()
                        .filter(b -> b.getCapacity() > 70)
                        .collect(Collectors.toList());

        assertEquals(3,result.size());
    }


    @Test
    void testFilter_NoBogiesMatching() {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("A",20));
        bogies.add(new Bogie("B",30));

        List<Bogie> result =
                bogies.stream()
                        .filter(b -> b.getCapacity() > 70)
                        .collect(Collectors.toList());

        assertTrue(result.isEmpty());
    }


    @Test
    void testFilter_AllBogiesMatching() {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("X",80));
        bogies.add(new Bogie("Y",90));

        List<Bogie> result =
                bogies.stream()
                        .filter(b -> b.getCapacity() > 70)
                        .collect(Collectors.toList());

        assertEquals(2,result.size());
    }


    @Test
    void testFilter_EmptyBogieList() {

        List<Bogie> bogies = new ArrayList<>();

        List<Bogie> result =
                bogies.stream()
                        .filter(b -> b.getCapacity() > 70)
                        .collect(Collectors.toList());

        assertTrue(result.isEmpty());
    }


    @Test
    void testFilter_OriginalListUnchanged() {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper",72));
        bogies.add(new Bogie("AC Chair",56));

        int originalSize = bogies.size();

        bogies.stream()
                .filter(b -> b.getCapacity() > 70)
                .collect(Collectors.toList());

        assertEquals(originalSize,bogies.size());
    }
}