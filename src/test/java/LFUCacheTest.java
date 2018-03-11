import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LFUCacheTest {
    @Test
    public void insert() throws Exception {
        LFUCache cache = new LFUCache(3);

        LFUCache.Entry entry1 = getEntry(1, 1);
        LFUCache.Entry entry2 = getEntry(2, 2);
        LFUCache.Entry entry3 = getEntry(3, 3);
        LFUCache.Entry entry4 = getEntry(4, 4);

        cache.insert(entry1);
        Assert.assertArrayEquals(new LFUCache.Entry[] { null, null, entry1 }, cache.array);

        cache.insert(entry2);
        Assert.assertArrayEquals(new LFUCache.Entry[] { null, entry1, entry2 }, cache.array);

        cache.insert(entry3);
        Assert.assertArrayEquals(new LFUCache.Entry[] { entry1, entry2, entry3 }, cache.array);

        cache.insert(entry4);
        Assert.assertArrayEquals(new LFUCache.Entry[] { entry1, entry2, entry4}, cache.array);

        cache = new LFUCache(1);
        cache.insert(entry1);
        Assert.assertArrayEquals(new LFUCache.Entry[] { entry1 }, cache.array);
        cache.insert(entry2);
        Assert.assertArrayEquals(new LFUCache.Entry[] { entry2 }, cache.array);
    }

    @Test
    public void rearrange() throws Exception {
        LFUCache cache = new LFUCache(3);

        LFUCache.Entry entry1 = getEntry(1, 1);
        LFUCache.Entry entry2 = getEntry(2, 2);
        LFUCache.Entry entry3 = getEntry(3, 3);

        cache.array = new LFUCache.Entry[] { null, entry1, entry2 };
        cache.rearrange(2);
        Assert.assertArrayEquals(new LFUCache.Entry[] { null, entry2, entry1 }, cache.array);

        cache.array = new LFUCache.Entry[] { null, entry1, entry2 };
        entry2.frequency = 1;
        cache.rearrange(2);
        Assert.assertArrayEquals(new LFUCache.Entry[] { null, entry2, entry1 }, cache.array);

        cache.array = new LFUCache.Entry[] { entry1, entry2, entry3 };
        entry1.frequency = 2;
        entry2.frequency = 1;
        entry3.frequency = 3;
        cache.rearrange(3);
        Assert.assertArrayEquals(new LFUCache.Entry[] { entry3, entry1, entry2 }, cache.array);

        cache.array = new LFUCache.Entry[] { entry1, entry2, entry3 };
        entry1.frequency = 2;
        entry2.frequency = 1;
        entry3.frequency = 2;
        cache.rearrange(3);
        Assert.assertArrayEquals(new LFUCache.Entry[] { entry3, entry1, entry2 }, cache.array);

        cache.array = new LFUCache.Entry[] { entry1, entry2, entry3 };
        entry1.frequency = 0;
        entry2.frequency = 0;
        entry3.frequency = 1;
        cache.rearrange(3);
        Assert.assertArrayEquals(new LFUCache.Entry[] { entry3, entry1, entry2 }, cache.array);
    }

    @Test
    public void get() throws Exception {
        LFUCache cache = new LFUCache(3);

        LFUCache.Entry entry1 = getEntry(1, 1);
        LFUCache.Entry entry2 = getEntry(2, 2);
        LFUCache.Entry entry3 = getEntry(3, 3);
        cache.array = new LFUCache.Entry[] { entry1, entry2, entry3 };

        Assert.assertEquals(-1, cache.get(4));

        Assert.assertEquals(3, cache.get(3));
        Assert.assertArrayEquals(new LFUCache.Entry[] { entry3, entry1, entry2 }, cache.array);

        Assert.assertEquals(2, cache.get(2));
        Assert.assertArrayEquals(new LFUCache.Entry[] { entry2, entry3, entry1 }, cache.array);

        Assert.assertEquals(3, cache.get(3));
        Assert.assertEquals(3, cache.get(3));
        Assert.assertEquals(3, cache.get(3));
        Assert.assertEquals(2, cache.get(2));
        Assert.assertArrayEquals(new LFUCache.Entry[] { entry3, entry2, entry1 }, cache.array);
    }

    @Test
    public void put() throws Exception {
        LFUCache cache = new LFUCache(3);

        LFUCache.Entry entry1 = getEntry(1, 1);
        LFUCache.Entry entry2 = getEntry(2, 2);
        LFUCache.Entry entry3 = getEntry(3, 3);
        LFUCache.Entry entry4 = getEntry(4, 4);

        cache.put(entry1.key, entry1.val);
        Assert.assertArrayEquals(new LFUCache.Entry[] { null, null, entry1 }, cache.array);

        cache.put(entry2.key, entry2.val);
        Assert.assertArrayEquals(new LFUCache.Entry[] { null, entry2, entry1 }, cache.array);

        cache.put(entry2.key, entry2.val);
        Assert.assertArrayEquals(new LFUCache.Entry[] { null, entry2, entry1 }, cache.array);

        cache.put(entry3.key, entry3.val);
        Assert.assertArrayEquals(new LFUCache.Entry[] { entry2, entry3, entry1 }, cache.array);

        cache.put(entry4.key, entry4.val);
        Assert.assertArrayEquals(new LFUCache.Entry[] { entry2, entry4, entry3 }, cache.array);

    }

    @Test
    public void customTest_1() throws Exception {
        LFUCache cache = new LFUCache(2);

        LFUCache.Entry entry1 = getEntry(1, 1);
        LFUCache.Entry entry2 = getEntry(2, 2);
        LFUCache.Entry entry3 = getEntry(3, 3);
        LFUCache.Entry entry4 = getEntry(4, 4);

        cache.put(entry1);
        cache.put(entry2);
        Assert.assertEquals(1, cache.get(1));
        cache.put(entry3);
        Assert.assertEquals(-1, cache.get(2));
        Assert.assertEquals(3, cache.get(3));
        cache.put(entry4);
        Assert.assertEquals(-1, cache.get(1));
        Assert.assertEquals(3, cache.get(3));
        Assert.assertEquals(4, cache.get(4));
    }

    @Test
    public void customTest_2() throws Exception {
        LFUCache cache = new LFUCache(3);

        LFUCache.Entry entry1 = getEntry(1, 1);
        LFUCache.Entry entry2 = getEntry(2, 2);
        LFUCache.Entry entry3 = getEntry(3, 3);
        LFUCache.Entry entry4 = getEntry(4, 4);
        LFUCache.Entry entry5 = getEntry(5, 5);

        cache.put(entry1);
        cache.put(entry2);
        cache.put(entry3);
        cache.put(entry4);
        Assert.assertEquals(4, cache.get(4));
        Assert.assertEquals(3, cache.get(3));
        Assert.assertEquals(2, cache.get(2));
        Assert.assertEquals(-1, cache.get(1));
        cache.put(entry5);
        Assert.assertEquals(-1, cache.get(1));
        Assert.assertEquals(2, cache.get(2));
        Assert.assertEquals(3, cache.get(3));
        Assert.assertEquals(-1, cache.get(4));
        Assert.assertEquals(5, cache.get(5));
    }

    private LFUCache.Entry getEntry(int key, int val) {
        return new LFUCache.Entry(key, val);
    }

}