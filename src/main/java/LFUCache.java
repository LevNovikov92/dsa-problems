class LFUCache {

    void put(Entry entry) {
        put(entry.key, entry.val);
    }

    static class Entry {
        final int key;
        int val;
        int frequency = 0;

        Entry(int key, int val) {
            this.key = key;
            this.val = val;
        }

        @Override
        public String toString() {
            return "k:" + key + ",v:" + val;
        }

        @Override
        public boolean equals(Object obj) {
            Entry entry = (Entry) obj;
            return entry.key == key && entry.val == val;
        }
    }

    Entry[] array;

    LFUCache(int capacity) {
        array = new Entry[capacity];
    }

    void put(int key, int val) {
        if (array.length == 0) return;
        if (isNotPresented(key)) {
            insert(new Entry(key, val));
            rearrange(key);
        } else {
            update(key, val);
            rearrange(key);
        }
    }

    int get(int key) {
        if (array.length == 0) return -1;
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].key == key) {
                result = array[i].val;
                array[i].frequency += 1;
                rearrange(array[i].key);
            }
        }
        return result;
    }

    void rearrange(int key) {
        for (int i = 0; i < array.length; i++) {
            Entry ent = array[i];
            if (ent != null && ent.key == key) {
                if (i  == 0) return;
                for (int j = i; j > 0 && array[j] != null && array[j - 1] != null; j--) {
                    if (array[j - 1].frequency <= array[j].frequency) {
                        Entry val = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = val;
                    } else {
                        return;
                    }
                }
                return;
            }
        }
    }

    void update(int key, int val) {
        for (Entry ent : array) {
            if (ent != null && ent.key == key) {
                ent.val = val;
                ent.frequency++;
            }
        }
    }

    void insert(Entry entry) {
        if (array[0] == null) {
            for (int i = 1; i < array.length; i++) {
                array[i - 1] = array[i];
            }
        }
        array[array.length - 1] = entry;
    }

    boolean isNotPresented(int key) {
        for (LFUCache.Entry ent : array) {
            if (ent != null && ent.key == key) {
                return false;
            }
        }
        return true;
    }
}
