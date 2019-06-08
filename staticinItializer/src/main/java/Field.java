import com.sun.org.apache.regexp.internal.RE;

import java.util.HashMap;
import java.util.Map;

public enum Field {
    REPORTER("reporter"),
    ASSIGNEE("assignee");

    public static final Map<Field, FieldService> fieldServicesMap = new HashMap<>();
    // public static final Map<Field, FieldService> optionalFieldServicesMap = initFieldServiceMap();

    static {
        System.out.println("Static initializing...");
        fieldServicesMap.put(REPORTER, new ReporterService());
        fieldServicesMap.put(ASSIGNEE, new AssigneeService());
        System.out.println("End of static initializing");
    }

    private static Map<Field, FieldService> initFieldServiceMap() {
        Map<Field, FieldService> map = new HashMap<>();
        System.out.println("Static initializing...");
        map.put(REPORTER, new ReporterService());
        map.put(ASSIGNEE, new AssigneeService());
        System.out.println("End of static initializing");
        return map;
    }

    private final String name;

    Field(String name) {
        this.name = name;
    }
}
