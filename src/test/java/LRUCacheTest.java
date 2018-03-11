import org.junit.Assert;
import org.junit.Test;

public class LRUCacheTest {

    @Test
    public void test() throws Exception {
        LRUCache cache = new LRUCache( 2 /* capacity */ );

        cache.put(1, 1);
        cache.put(2, 2);
        Assert.assertEquals(1, cache.get(1));       // returns 1
        cache.put(3, 3);    // evicts key 2
        Assert.assertEquals(-1, cache.get(2));       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        Assert.assertEquals(-1, cache.get(1));       // returns -1 (not found)
        Assert.assertEquals(3, cache.get(3));       // returns 3
        Assert.assertEquals(4, cache.get(4));       // returns 4
    }

    @Test
    public void isNotPresented() throws Exception {
        LRUCache cache = new LRUCache(3);
        cache.array = new LRUCache.Entry[] {getEntry(1, 1),getEntry(2, 2),getEntry(3, 3)};
        Assert.assertFalse(cache.isNotPresented(3));
        Assert.assertTrue(cache.isNotPresented(4));
    }

    @Test
    public void insert() throws Exception {
        LRUCache cache = new LRUCache(3);
        Assert.assertArrayEquals(
                new LRUCache.Entry[] {
                        null, null, null }, cache.array);

        LRUCache.Entry entry1 = getEntry(1, 1);
        LRUCache.Entry entry2 = getEntry(2, 2);
        LRUCache.Entry entry3 = getEntry(3, 3);
        LRUCache.Entry entry4 = getEntry(4, 4);
        cache.insert(entry1);
        Assert.assertArrayEquals(
                new LRUCache.Entry[] {
                        entry1, null, null }, cache.array);

        cache.insert(entry2);
        Assert.assertArrayEquals(
                new LRUCache.Entry[] {
                        entry2, entry1, null }, cache.array);

        cache.insert(entry3);
        Assert.assertArrayEquals(
                new LRUCache.Entry[] {
                        entry3, entry2, entry1}, cache.array);

        cache.insert(entry4);
        Assert.assertArrayEquals(
                new LRUCache.Entry[] {
                        entry4, entry3, entry2 }, cache.array);

    }

    @Test
    public void update() throws Exception {
        LRUCache cache = new LRUCache(3);

        LRUCache.Entry entry1 = getEntry(1, 1);
        LRUCache.Entry entry2 = getEntry(2, 2);
        LRUCache.Entry entry3 = getEntry(3, 3);
        LRUCache.Entry entry4 = new LRUCache.Entry(3, 4);
        cache.array = new LRUCache.Entry[] { entry1, entry2, entry3 };

        cache.update(entry4);
        Assert.assertArrayEquals(
                new LRUCache.Entry[] {
                        entry1, entry2, entry4 }, cache.array);
    }

    @Test
    public void rearrange() throws Exception {
        LRUCache cache = new LRUCache(3);

        LRUCache.Entry entry1 = getEntry(1, 1);
        LRUCache.Entry entry2 = getEntry(2, 2);
        LRUCache.Entry entry3 = getEntry(3, 3);

        cache.array = new LRUCache.Entry[] {entry1, entry2, entry3};

        cache.rearrange(3);
        Assert.assertArrayEquals(
                new LRUCache.Entry[] {
                        entry3, entry1, entry2 }, cache.array);

        cache.rearrange(2);
        Assert.assertArrayEquals(
                new LRUCache.Entry[] {
                        entry2, entry3, entry1 }, cache.array);

        cache.rearrange(2);
        Assert.assertArrayEquals(
                new LRUCache.Entry[] {
                        entry2, entry3, entry1 }, cache.array);
    }

    private LRUCache.Entry getEntry(int key, int val) {
        return new LRUCache.Entry(key, val);
    }
}