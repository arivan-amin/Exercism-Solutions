class Badge {
    
    public String print (Integer id, String name, String department) {
        return formatId(id) + name + formatDepartment(department);
    }
    
    private static String formatId (Integer id) {
        return id == null ? "" : "[%s] - ".formatted(id);
    }
    
    private static String formatDepartment (String department) {
        return " - %s".formatted(getDepartmentName(department));
    }
    
    private static String getDepartmentName (String department) {
        return department == null ? "OWNER" : department.toUpperCase();
    }
}
