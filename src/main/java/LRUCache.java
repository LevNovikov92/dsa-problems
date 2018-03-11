class LRUCache {

    static class Entry {
        private final int key;
        private final int val;

        Entry(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    Entry[] array;

    LRUCache(int capacity) {
        if (capacity == 0) throw new UnsupportedOperationException("Capacity should be > 0");
        array = new Entry[capacity];
    }

    void put(int key, int val) {
        if (isNotPresented(key)) {
            insert(new Entry(key, val));
        } else {
            update(new Entry(key, val));
            rearrange(key);
        }
    }

    void rearrange(int key) {
        int index = 0;
        for (Entry ent : array) {
            if (ent.key == key) {
                break;
            }
            index++;
        }
        
        if (index == 0) return;
        if (index >= array.length) throw new UnsupportedOperationException("key was not found");
        
        Entry entry = array[index];
        for (int i = index - 1; i >= 0; i--) {
            array[i + 1] = array[i]; 
        }
        array[0] = entry;
    }

    void update(Entry entry) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].key == entry.key) {
                array[i] = entry;
            }
        }
    }

    void insert(Entry entry) {
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = entry;
    }

    boolean isNotPresented(int key) {
        for (Entry ent : array) {
            if (ent != null && ent.key == key) {
                return false;
            }
        }
        return true;
    }

    int get(int key) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].key == key) {
                result = array[i].val;
                rearrange(key);
            }
        }
        return result;
    }
}
