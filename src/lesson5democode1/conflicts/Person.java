package lesson5democode1.conflicts;

public interface Person { String getName(); 
 default int getId() { return 0; }
 }