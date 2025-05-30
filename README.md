[//]: # (# Core_Java)

# ShortCut  <br>

<pre>
Alt + Shift + Mouse Drag : MultiCursor<br>
Ctrl + Alt + Shift + J for multiple lines<br>
Ctrl + Shift + UpKey/Down for line up-down<br>
</pre>

# Collection Framework

<ul>
        <li><b>List Interface</b>: Ordered collection, allows duplicates.
            <ul>
                <li><b>ArrayList</b>: Resizable array.<br>Use Case: Storing search results on Amazon for ordered display and pagination.</li>
                <li><b>LinkedList</b>: Doubly-linked list (also implements Deque, Queue).<br>Use Case: Managing browser history in Chrome for frequent additions/removals.</li>
                <li><b>Vector</b>: Synchronized resizable array (legacy).<br>Use Case: Storing thread-safe user sessions in a legacy Java web app.</li>
                <li><b>Stack</b>: Extends Vector, implements LIFO stack (legacy).<br>Use Case: Implementing undo functionality in a Notion-like text editor.</li>
                <li><b>CopyOnWriteArrayList</b>: Thread-safe array list, creates a new copy on mutation.<br>Use Case: Storing event listeners in a multi-threaded GUI app like Swing-based tools.</li>
            </ul>
        </li>
        <li><b>Set Interface</b>: Unordered collection, no duplicates.
            <ul>
                <li><b>HashSet</b>: Hash table-based set.<br>Use Case: Storing unique hashtags on X to avoid duplicates.</li>
                <li><b>LinkedHashSet</b>: Hash table with linked list, maintains insertion order.<br>Use Case: Tracking recently viewed items on eBay, preserving view order.</li>
                <li><b>TreeSet</b>: Sorted set using a red-black tree (implements NavigableSet).<br>Use Case: Maintaining a leaderboard in a gaming app like Clash Royale.</li>
                <li><b>EnumSet</b>: Specialized set for enum types.<br>Use Case: Storing user roles (e.g., ADMIN, USER) in a login system like GitHub.</li>
                <li><b>CopyOnWriteArraySet</b>: Thread-safe set backed by CopyOnWriteArrayList.<br>Use Case: Managing active user IDs in a real-time chat app like Slack.</li>
            </ul>
        </li>
        <li><b>Queue Interface</b>: Ordered collection for processing elements (includes Deque).
            <ul>
                <li><b>PriorityQueue</b>: Priority-based queue using a heap.<br>Use Case: Scheduling tasks in a job queue for a server like Jenkins.</li>
                <li><b>ArrayDeque</b>: Resizable array-based deque (implements Deque).<br>Use Case: Implementing a sliding window for streaming data in a Netflix analytics system.</li>
                <li><b>LinkedList</b>: Doubly-linked list (also implements Deque, List).<br>Use Case: Managing a queue of user actions in a collaborative tool like Trello.</li>
            </ul>
        </li>
        <li><b>Map Interface</b>: Key-value pair storage, no duplicate keys.
            <ul>
                <li><b>HashMap</b>: Hash table for key-value pairs.<br>Use Case: Mapping user IDs to profiles in a social media app like LinkedIn.</li>
                <li><b>LinkedHashMap</b>: Hash table with linked list, maintains insertion/access order.<br>Use Case: Caching recently accessed pages in a web browser like Firefox.</li>
                <li><b>TreeMap</b>: Sorted map using a red-black tree (implements NavigableMap).<br>Use Case: Autocomplete feature in Google Search with sorted suggestions.</li>
                <li><b>Hashtable</b>: Synchronized hash table (legacy).<br>Use Case: Storing thread-safe configurations in a legacy Java app server.</li>
                <li><b>ConcurrentHashMap</b>: Thread-safe map for high concurrency.<br>Use Case: Managing session tokens in a multi-threaded server like Tomcat.</li>
                <li><b>EnumMap</b>: Specialized map for enum keys.<br>Use Case: Mapping days to tasks in a calendar app like Google Calendar.</li>
                <li><b>WeakHashMap</b>: Map with weakly referenced keys for garbage collection.<br>Use Case: Caching temporary data in a web app like Reddit to save memory.</li>
                <li><b>IdentityHashMap</b>: Map using reference equality for keys.<br>Use Case: Tracking object instances in a debugging tool like Eclipse.</li>
            </ul>
        </li>
    </ul>
