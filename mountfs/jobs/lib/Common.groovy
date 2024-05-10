package lib

public class Common {
    // Capitalize job name, and replace '-' with ' '.
    static jobName(String jobId) {
        return jobId.replace('-', ' ').capitalize()
    }
}